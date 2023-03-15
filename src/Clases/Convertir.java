package Clases;

import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Convertir {

    public double conversion(String origin,String destino,String cantidad) throws IOException{
        
        // Crea un objeto cliente OkHttp
        OkHttpClient client = new OkHttpClient().newBuilder().build();

        // Crea una URL con las variables
        HttpUrl url = HttpUrl.parse("https://api.apilayer.com/fixer/convert")
                .newBuilder()
                .addQueryParameter("to", destino)
                .addQueryParameter("from", origin)
                .addQueryParameter("amount", cantidad)
                .build();

        // Crea una solicitud HTTP GET con la URL de la API y la clave de API
        Request request = new Request.Builder()
                .url(url)
                .addHeader("apikey", "WluOx5kQhrpPDJ80Kf3gZGxtQnFet7fz")
                .method("GET", null)
                .build();

        // Ejecuta la solicitud HTTP y obtiene la respuesta
        Response response = client.newCall(request).execute();

        // Obtiene el cuerpo de la respuesta como una cadena
        String responseBody = response.body().string();

        // Convierte la respuesta JSON en un objeto Java utilizando Gson
        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(responseBody, JsonObject.class);

        // Obtiene el valor de la propiedad "result" del objeto JSON
        double result = jsonObject.get("result").getAsDouble();
        
        return Math.round(result);
    }

}
