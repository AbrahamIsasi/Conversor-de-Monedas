package Views;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Clases.Convertir;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Set;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;


/**
 *
 * @author juanc
 */
public class Monedas extends javax.swing.JFrame {
    
    public Monedas() {
        initComponents();
        setLocationRelativeTo(null);
        
        Date fecha = new Date();
        String fechaString = fecha.toString(); 
        Calendar hora = new GregorianCalendar();
        Calendar format = new GregorianCalendar();
        SimpleDateFormat abc = new SimpleDateFormat("dd-MMM-YYYY");
        labelfecha.setText(abc.format(fecha));
        
        String hours = Integer.toString(hora.get(Calendar.HOUR_OF_DAY));
        String minuto = Integer.toString(hora.get(Calendar.MINUTE));
        
        
        String horacomp = hours+" :"+minuto+ " ";
        labelhora.setText(horacomp);
        
    
    }  
    
   
 

    Convertir convertir = new Convertir();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLocaleChooser1 = new com.toedter.components.JLocaleChooser();
        jSpinField1 = new com.toedter.components.JSpinField();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        cbxOrigin = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        cbxDestino = new javax.swing.JComboBox<>();
        labelfecha = new javax.swing.JLabel();
        btnIngresarCantidad = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelhora = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbxOrigin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PEN", "EUR", "USD", "GBP", "JPY", "KRW" }));
        cbxOrigin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxOriginActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbxDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EUR", "PEN", "USD", "GBP", "JPY", "KRW" }));
        cbxDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDestinoActionPerformed(evt);
            }
        });
        jPanel1.add(cbxDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 133, 101, -1));
        jPanel1.add(labelfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 100, 32));

        btnIngresarCantidad.setText("Ingrese la cantidad");
        btnIngresarCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarCantidadActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresarCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 210, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Convertidor de Monedas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 220, 37));
        jPanel1.add(labelhora, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 80, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dinero.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(cbxOrigin, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(cbxOrigin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    NumberFormat formatoImporte = NumberFormat.getCurrencyInstance();    
    private void btnIngresarCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarCantidadActionPerformed
        try {
            String origin = (String) cbxOrigin.getSelectedItem();
            String destino = (String) cbxDestino.getSelectedItem();
            String cantidad = JOptionPane.showInputDialog("Ingrese la cantidad");

            JOptionPane.showMessageDialog(
                    null,cantidad+" "+origin+" equivale a "+ convertir.conversion(origin, destino, cantidad)+" "+ destino);
        
            
        } catch (IOException ex) {
            Logger.getLogger(Monedas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnIngresarCantidadActionPerformed

    private void cbxOriginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxOriginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxOriginActionPerformed

    private void cbxDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxDestinoActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Monedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Monedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Monedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Monedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Monedas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresarCantidad;
    private javax.swing.JComboBox<String> cbxDestino;
    private javax.swing.JComboBox<String> cbxOrigin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private com.toedter.components.JLocaleChooser jLocaleChooser1;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JPanel jPanel1;
    private com.toedter.components.JSpinField jSpinField1;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private javax.swing.JLabel labelfecha;
    private javax.swing.JLabel labelhora;
    // End of variables declaration//GEN-END:variables
}
