/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graficas;

import Analizador.scanner;
import Analizador.parser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author jose_
 */
public class Graficas {

    public static String Grafica() {
        JFileChooser fileChooser = new JFileChooser();

        // Establecer un filtro de extensión para archivos JSON
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos JSON (*.json)", "json", "Archivos SP (*.sp)", "sp");
        fileChooser.setFileFilter(filter);
        // Mostrar el cuadro de diálogo de selección de archivo
        int returnValue = fileChooser.showOpenDialog(null);
        // Comprobar si el usuario seleccionó un archivo
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            // Obtener el archivo seleccionado
            File selectedFile = fileChooser.getSelectedFile();

            // Verificar que el archivo seleccionado sea JSON (opcional)
            if (selectedFile.getName().endsWith(".json")) {
                // Procesar el archivo JSON seleccionado aquí
                String codigo = LecturaJSON(selectedFile.getPath());
                //System.out.println("Archivo JSON seleccionado: " + selectedFile.getAbsolutePath());
                return codigo;
            } else {
                System.out.println("El archivo seleccionado no es un archivo JSON válido.");
            }
        } else {
            System.out.println("No se seleccionó ningún archivo.");
            return "";
        }
        return "";
    }

    public static String LecturaJSON(String selectedFile) {
        try {
            // Crear un lector de archivos
            FileReader fileReader = new FileReader(selectedFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Leer el archivo línea por línea
            StringBuilder jsonText = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                jsonText.append(line+"\n");
            }

            // Cerrar el lector de archivos
            bufferedReader.close();

            // Extraer el texto del JSON
            String jsonContent = jsonText.toString();

            // Imprimir el texto
            System.out.println("Texto extraído del JSON:\n" + jsonContent);
            return jsonContent;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
    
}
