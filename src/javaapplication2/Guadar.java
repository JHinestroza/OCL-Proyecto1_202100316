/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Path;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author jose_
 */
public class Guadar {
private static String Path;

    public  void GuardarComo(String texto) {
        JFrame frame = new JFrame("Guardar Como Ejemplo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JFileChooser fileChooser = new JFileChooser();
        int seleccion = fileChooser.showSaveDialog(frame);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivoSeleccionado = fileChooser.getSelectedFile();
            String contenido = texto;

            try (FileOutputStream outputStream = new FileOutputStream(archivoSeleccionado); BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream))) {
                writer.write(contenido);
                writer.flush();
                System.out.println("Archivo guardado como: " + archivoSeleccionado.getAbsolutePath());
                setPath(archivoSeleccionado.getAbsolutePath());
            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(frame, "Error al guardar el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }
    public  void Guardar(String Texto){
          String contenido = Texto;

        // Especifica la ruta y el nombre del archivo donde deseas guardar los datos
        String rutaArchivo = getPath();
        System.out.println(rutaArchivo);
        try {
            //objeto File para representar el archivo
            File archivo = new File(rutaArchivo);

            // Crea un flujo de salida para escribir en el archivo
            OutputStream outputStream = new FileOutputStream(archivo);

            // Convierte la cadena de contenido en bytes y escribe en el archivo
            byte[] bytes = contenido.getBytes();
            outputStream.write(bytes);

            // Cierra el flujo de salida
            outputStream.close();

            System.out.println("Datos guardados en el archivo: " + rutaArchivo);
        } catch (IOException e) {
            // Manejo de excepciones en caso de error al guardar el archivo
            e.printStackTrace();
        }
    }
    

    public  void setPath(String Path) {
        this.Path = Path;
    }

    public static  String getPath() {
        return Path;
    }
    
}
