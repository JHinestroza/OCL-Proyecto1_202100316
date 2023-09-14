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
import java.util.LinkedList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.jfree.data.category.DefaultCategoryDataset;
import Analizador.parser;
import java.awt.BorderLayout;
import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author jose_
 */
public class Graficas {
    
    public static LinkedList<String> traduccion = new LinkedList<>();
    
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
    public  void GraficaBarras(){
        String titulo = parser.title;
        String tituloX = parser.ejex;
        String tituloY = parser.ejey;
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        for (int i = 0; i < parser.Valores.size(); i++) {
            
            datos.addValue(Double.valueOf(parser.Valores.get(i)), parser.Grafica.get(i), parser.Grafica.get(i));
        }
        JFreeChart chart = ChartFactory.createBarChart(
                titulo, // Título
                tituloX, // Etiqueta del eje X
                tituloY, // Etiqueta del eje Y
                datos, // Datos
                PlotOrientation.VERTICAL, // Orientación de la gráfica
                true, // Mostrar leyenda
                true, // Usar tooltips
                false // Usar URLs
        );
        
        
        ChartFrame frame = new ChartFrame("Ejemplo", chart);
        frame.setPreferredSize(new java.awt.Dimension(400, 500));
        frame.pack();
        frame.setVisible(true);;
    }
    
    public void Pie()
    {
        //Ingreso de datos
        String titulo = parser.title;
        String tituloX = parser.ejex;
        String tituloY = parser.ejey;
        DefaultPieDataset dataset = new DefaultPieDataset( );
      
        for(int i = 0; i < parser.Valores.size(); i++){
            
            dataset.setValue( parser.Grafica.get(i), Double.valueOf(parser.Valores.get(i)));
        }
        // Creación de gráfica
        
        JFreeChart grafica = ChartFactory.createPieChart(titulo, dataset,true,true,true);
        PiePlot plot = (PiePlot) grafica.getPlot();    
        plot.setSimpleLabels(true);
        //PieSectionLabelGenerator generator = new StandardPieSectionLabelGenerator(tituloY, numberFormat, percentFormat);
        //plot.setLabelGenerator(generator);
        
        
        // Mostrar
        
        ChartFrame frame = new ChartFrame("Ejemplo", grafica);
        frame.setPreferredSize(new java.awt.Dimension(400, 500));
        frame.pack();
        frame.setVisible(true);;
    }
    
    
}
