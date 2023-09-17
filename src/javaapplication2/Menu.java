/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication2;

import Analizador.Generador;
import Analizador.scanner;
import Analizador.parser;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import Graficas.Graficas;
import Reportes.Reportes;
import javaapplication2.Guadar;
/**
 *
 * @author jose_
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Manu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        Archivo = new javax.swing.JButton();
        Analizar = new javax.swing.JButton();
        Ejecutar = new javax.swing.JButton();
        Reporte = new javax.swing.JButton();
        panel1 = new java.awt.Panel();
        Salida = new java.awt.TextArea();
        Entrada = new java.awt.TextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Graficar = new javax.swing.JButton();
        GuardarComo = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 150));
        setResizable(false);

        Archivo.setText("Archivo");
        Archivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivoActionPerformed(evt);
            }
        });

        Analizar.setText("Analizar");
        Analizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalizarActionPerformed(evt);
            }
        });

        Ejecutar.setText("Ejecutar");
        Ejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EjecutarActionPerformed(evt);
            }
        });

        Reporte.setText("Reporte");
        Reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteActionPerformed(evt);
            }
        });

        panel1.setBackground(new java.awt.Color(204, 204, 204));
        panel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setText("Analizador");

        jLabel2.setText("Startpy");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setText("Salida");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setText("Entrada");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Salida, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(22, 22, 22)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Salida, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                    .addComponent(Entrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        Graficar.setText("Graficar");
        Graficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraficarActionPerformed(evt);
            }
        });

        GuardarComo.setText("Guardar Como");
        GuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarComoActionPerformed(evt);
            }
        });

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Archivo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Analizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Ejecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Graficar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(GuardarComo)
                .addGap(0, 0, 0)
                .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Archivo)
                    .addComponent(Analizar)
                    .addComponent(Ejecutar)
                    .addComponent(Reporte)
                    .addComponent(Graficar)
                    .addComponent(GuardarComo)
                    .addComponent(Guardar))
                .addGap(0, 0, 0)
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EjecutarActionPerformed
        Salida.setText("");
        Ejecutar();


    }//GEN-LAST:event_EjecutarActionPerformed

    private void ReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteActionPerformed
        Reportes reporte = new Reportes();
        reporte.ReportesTokem();
        reporte.ReportesLexema();
    }//GEN-LAST:event_ReporteActionPerformed

    private void ArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchivoActionPerformed
        Graficas grafica = new Graficas();
        String texto = grafica.AbirArchivo();
        Entrada.setText(texto);
    }//GEN-LAST:event_ArchivoActionPerformed

    private void GraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraficarActionPerformed
        Graficas grafica = new Graficas();
        //grafica.GraficaBarras();
        grafica.MostrarGraficaBarras();
        grafica.MostrarGraficaPie();
    }//GEN-LAST:event_GraficarActionPerformed

    private void AnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalizarActionPerformed
        Salida.setText("");
        vaciar();
        Analizar();


    }//GEN-LAST:event_AnalizarActionPerformed

    private void GuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarComoActionPerformed
        Guadar guardar = new Guadar();
        guardar.GuardarComo(Entrada.getText());
    }//GEN-LAST:event_GuardarComoActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // TODO add your handling code here:
        Guadar guardar = new Guadar();
        guardar.Guardar(Entrada.getText());
    }//GEN-LAST:event_GuardarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Generador generar = new Generador();
        generar.compilar();
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    private void Ejecutar() {
        vaciar();
        Analizar();
        String codigoFuente = Entrada.getText();
        StringBuilder panel = new StringBuilder();

        if (parser.erroresSintacticos.isEmpty()) {
            parser.Traduccion.forEach((linea) -> {
                String textoAgregado = linea + "\n";
                panel.append(textoAgregado);
            });
            String resultado = panel.toString();
            Salida.append(resultado);
        } 
        
        ReportesLexicos();
        Reportes();

        parser.Traduccion.clear();
        parser.erroresSintacticos.clear();
        scanner.lexemas.clear();
        scanner.erroreslexicos.clear();

    }

    public void Analizar() {
        StringBuilder panel = new StringBuilder();
        if (scanner.erroreslexicos.isEmpty()) {
            System.out.println("no se encontraron errores lexicos");
        } else {
            scanner.erroreslexicos.forEach((error) -> {
                //System.out.println(error.getTipo() + "| " + error.getDescripcion() + "| " + error.getLinea() + "| " + error.getColumna() + "\n");
                String textoAgregado = error.getTipo() + "| " + error.getDescripcion() + "| " + error.getLinea() + "| " + error.getColumna() + "\n";
                panel.append(textoAgregado);
            });
        }
        if (parser.erroresSintacticos.isEmpty()) {
            System.out.println("No se encontraron errores sintacticos");
        } else {
            parser.erroresSintacticos.forEach((error) -> {
                String textoAgregado = error.getTipo() + "| " + error.getDescripcion() + "| " + error.getLinea() + "| " + error.getColumna() + "\n";
                panel.append(textoAgregado);
                //System.out.println(error.getTipo() + "| " + error.getDescripcion() + "| " + error.getLinea() + "| " + error.getColumna());
            });
        }
        String resultado = panel.toString();
        System.out.println("esto es " + resultado);
        Salida.setText(resultado);
        ReportesLexicos();
        Reportes();

    }

    public void Reportes() {
        String nombreArchivo = "TablaTokems.html";
        String ejecutar = Entrada.getText();

        try {
            //  sintactico con el parser
            parser parser = new parser();
            BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo));

            // Escribir el encabezado HTML
            writer.write("<!DOCTYPE html>");
            writer.newLine();
            writer.write("<html>");
            writer.newLine();
            writer.write("<head>");
            writer.newLine();
            writer.write("<title>Tabla HTML generada desde Java</title>");
            writer.newLine();
            writer.write("</head>");
            writer.newLine();
            writer.write("<body>");
            writer.newLine();

            // Crear la tabla HTML
            writer.write("<table style=\"collapse; margin: 25px 0; font-size: 1em; font-family: sans-serif; min-width: 450px; box-shadow: 0 0 20px rgba(0, 0, 0, 0.15); padding: 12px 15px;\">");
            writer.newLine();

            // Encabezado de la tabla
            writer.write("<tr style=\"background-color: #980081; color: #ffffff; text-align: middle;\" >");
            writer.newLine();
            writer.write("<th>Lexema</th>");
            writer.newLine();
            writer.write("<th>Token</th>");
            writer.newLine();
            writer.write("<th>Linea</th>");
            writer.newLine();
            writer.write("<th>columna</th>");
            writer.newLine();
            writer.write("</tr>");
            writer.newLine();

            //System.out.println(scanner.lexemas.size());
            for (int i = 0; i < scanner.lexemas.size(); i++) {
                writer.write("<tr style=\"background-color: rgb(223, 223, 223);\" >");
                writer.newLine();
                writer.write("<td>" + scanner.lexemas.get(i).getTipo() + "</td>");
                writer.newLine();
                writer.write("<td>" + scanner.lexemas.get(i).getDescripcion() + "</td>");
                writer.newLine();
                writer.write("<td>" + scanner.lexemas.get(i).getLinea() + "</td>");
                writer.newLine();
                writer.write("<td>" + scanner.lexemas.get(i).getColumna() + "</td>");
                writer.newLine();
                writer.write("</tr>");
                writer.newLine();
            }

            // Cerrar la tabla y el cuerpo del HTML
            writer.write("</table>");
            writer.newLine();
            writer.write("</body>");
            writer.newLine();
            writer.write("</html>");
            writer.newLine();

            // Cerrar el archivo
            writer.close();
            
            System.out.println("Tabla HTML generada con éxito en " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void vaciar() {
        String codigoFuente = Entrada.getText();
        try {
            // realizar el analisis lexico con el scanner
            scanner scan = new scanner(new java.io.StringReader(codigoFuente));
            //  sintactico con el parser
            parser parser = new parser(scan);
            parser.parse();
            System.out.println("Analisis realizado correctamente");

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public void ReportesLexicos() {
        String nombreArchivo = "TablaLexicos.html";
        String ejecutar = Entrada.getText();

        try {
            //  sintactico con el parser
            parser parser = new parser();
            BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo));

            // Escribir el encabezado HTML
            writer.write("<!DOCTYPE html>");
            writer.newLine();
            writer.write("<html>");
            writer.newLine();
            writer.write("<head>");
            writer.newLine();
            writer.write("<title>Tabla HTML generada desde Java</title>");
            writer.newLine();
            writer.write("</head>");
            writer.newLine();
            writer.write("<body>");
            writer.newLine();

            // Crear la tabla HTML
            writer.write("<table style=\"collapse; margin: 25px 0; font-size: 1em; font-family: sans-serif; min-width: 450px; box-shadow: 0 0 20px rgba(0, 0, 0, 0.15); padding: 12px 15px;\">");
            writer.newLine();

            // Encabezado de la tabla
            writer.write("<tr style=\"background-color: #980081; color: #ffffff; text-align: middle;\">");
            writer.newLine();
            writer.write("<th>Lexema</th>");
            writer.newLine();
            writer.write("<th>Token</th>");
            writer.newLine();
            writer.write("<th>Linea</th>");
            writer.newLine();
            writer.write("<th>columna</th>");
            writer.newLine();
            writer.write("</tr>");
            writer.newLine();

            // Filas de la tabla
            //System.out.println(scanner.erroreslexicos.size());
            for (int i = 0; i < scanner.erroreslexicos.size(); i++) {
                writer.write("<tr style=\"background-color: rgb(223, 223, 223);\">");
                writer.newLine();
                writer.write("<td>" + scanner.erroreslexicos.get(i).getTipo() + "</td>");
                writer.newLine();
                writer.write("<td>" + scanner.erroreslexicos.get(i).getDescripcion() + "</td>");
                writer.newLine();
                writer.write("<td>" + scanner.erroreslexicos.get(i).getLinea() + "</td>");
                writer.newLine();
                writer.write("<td>" + scanner.erroreslexicos.get(i).getColumna() + "</td>");
                writer.newLine();
                writer.write("</tr>");
                writer.newLine();
            }
            //System.out.println("tamano es  "+ scanner.lexemas.size());

            // Cerrar la tabla y el cuerpo del HTML
            writer.write("</table>");
            writer.newLine();
            writer.write("</body>");
            writer.newLine();
            writer.write("</html>");
            writer.newLine();

            // Cerrar el archivo
            writer.close();

            System.out.println("Tabla HTML generada con éxito en " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Analizar;
    private javax.swing.JButton Archivo;
    private javax.swing.JButton Ejecutar;
    private java.awt.TextArea Entrada;
    private javax.swing.JButton Graficar;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton GuardarComo;
    private javax.swing.JButton Reporte;
    private java.awt.TextArea Salida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private java.awt.Panel panel1;
    private java.awt.PopupMenu popupMenu1;
    // End of variables declaration//GEN-END:variables
}
