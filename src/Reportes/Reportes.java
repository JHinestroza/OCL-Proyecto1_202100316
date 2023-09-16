/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reportes;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author jose_
 */
public class Reportes {
    
    public static void ReportesLexema() {
        // Especifica la ruta y el nombre del archivo que deseas abrir
        String rutaArchivoHTML = "TablaLexicos.html"; // Cambia esta ruta según tu archivo HTML

        try {
            // Verifica si el sistema admite la clase Desktop
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();

                // Comprueba si el archivo HTML existe
                File archivoHTML = new File(rutaArchivoHTML);
                if (archivoHTML.exists()) {
                    // Abre el archivo HTML en el navegador web predeterminado
                    desktop.open(archivoHTML);
                } else {
                    JOptionPane.showMessageDialog(null, "El archivo no se ha creado", "Alerta", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                System.out.println("El sistema no admite Desktop.");
            }
        } catch (IOException e) {
            // Manejo de excepciones en caso de error al abrir el archivo
            e.printStackTrace();
        }

    }
    public static void ReportesTokem() {
        // Especifica la ruta y el nombre del archivo que deseas abrir
        String rutaArchivoHTML = "TablaTokems.html"; // Cambia esta ruta según tu archivo HTML

        try {
            // Verifica si el sistema admite la clase Desktop
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();

                // Comprueba si el archivo HTML existe
                File archivoHTML = new File(rutaArchivoHTML);
                if (archivoHTML.exists()) {
                    // Abre el archivo HTML en el navegador web predeterminado
                    desktop.open(archivoHTML);
                } else {
                    JOptionPane.showMessageDialog(null, "El archivo no se ha creado", "Alerta", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                System.out.println("El sistema no admite Desktop.");
            }
        } catch (IOException e) {
            // Manejo de excepciones en caso de error al abrir el archivo
            e.printStackTrace();
        }

    }
}
