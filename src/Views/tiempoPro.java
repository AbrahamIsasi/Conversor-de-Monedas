
package Views;

import java.util.GregorianCalendar;
import java.util.Calendar;

public class tiempoPro extends Monedas{
    Calendar hora = new GregorianCalendar();
    
    
    String hours = Integer.toString(hora.get(Calendar.HOUR_OF_DAY));
    String minuto = Integer.toString(hora.get(Calendar.MINUTE));
    String segundos = Integer.toString(hora.get(Calendar.SECOND));
    String horacomp = hours+":"+minuto+":"+segundos;

    
}
