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
import java.util.HashMap;
import javax.swing.JOptionPane;
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
    public static String nombrejson = "";
    public static JFreeChart grafica;
    public static JFreeChart chart;

    public static void Graficar(String titulo, String tituloX, String tituloY, Object ejes, Object valores) {

        String[] textoejes = ejes.toString().split(",");

        String[] textovalores = valores.toString().split(",");
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        for (int i = 0; i < textoejes.length; i++) {
            //System.out.println(textovalores[i]);
            datos.addValue(Double.valueOf(textovalores[i]), textoejes[i], textoejes[i]);

        }
        chart = ChartFactory.createBarChart(
                titulo, // Título
                tituloX, // Etiqueta del eje X
                tituloY, // Etiqueta del eje Y
                datos, // Datos
                PlotOrientation.VERTICAL, // Orientación de la gráfica
                true, // Mostrar leyenda
                true, // Usar tooltips
                false // Usar URLs
        );   
    }

    public static void GraficarPie(String titulo, String tituloX, String tituloY, Object ejes, Object valores) {

        String[] textoejes = ejes.toString().split(",");
        String[] textovalores = valores.toString().split(",");
        DefaultCategoryDataset datos = new DefaultCategoryDataset();

        DefaultPieDataset dataset = new DefaultPieDataset();

        for (int i = 0; i < textoejes.length; i++) {

            dataset.setValue(textoejes[i], Double.valueOf(textovalores[i]));
        }
        // Creación de gráfica

        grafica = ChartFactory.createPieChart(titulo, dataset, true, true, true);
        PiePlot plot = (PiePlot) grafica.getPlot();
        plot.setSimpleLabels(true);
        //PieSectionLabelGenerator generator = new StandardPieSectionLabelGenerator(tituloY, numberFormat, percentFormat);
        //plot.setLabelGenerator(generator);
        
        
        
    }
    public static void MostrarGraficaPie(){
        ChartFrame frame = new ChartFrame("Ejemplo", grafica);
        frame.setPreferredSize(new java.awt.Dimension(400, 500));
        frame.pack();
        frame.setVisible(true);;
    }
    public static void MostrarGraficaBarras(){
        ChartFrame frame = new ChartFrame("Ejemplo", chart);
        frame.setPreferredSize(new java.awt.Dimension(400, 500));
        frame.pack();
        frame.setVisible(true);;
    }

    public static String AbirArchivo() {
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
                String codigo = Lectura(selectedFile.getPath());
                nombrejson = "\""+selectedFile.getName()+"\"";
                //System.out.println("Archivo JSON seleccionado: " + selectedFile.getAbsolutePath());
                return codigo;
            }
            if (selectedFile.getName().endsWith(".sp")) {
                // Procesar el archivo JSON seleccionado aquí
                String codigo = Lectura(selectedFile.getPath());
                selectedFile.getName();
                //System.out.println("Archivo JSON seleccionado: " + selectedFile.getAbsolutePath());
                return codigo;
            } else {
                System.out.println("El archivo seleccionado no es un archivo JSON válido.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningun archivo", "Alerta", JOptionPane.WARNING_MESSAGE);

            return "";
        }
        return "";
    }

    public static String Lectura(String selectedFile) {
        try {
            // Crear un lector de archivos
            FileReader fileReader = new FileReader(selectedFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Leer el archivo línea por línea
            StringBuilder jsonText = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                jsonText.append(line + "\n");
            }

            // Cerrar el lector de archivos
            bufferedReader.close();

            // Extraer el texto del JSON
            String jsonContent = jsonText.toString();

            // Imprimir el texto
            return jsonContent;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public void GraficaBarras() {
        for (String clave : parser.Jsons.keySet()) {
            HashMap valor = parser.Jsons.get(clave);
            System.out.println("Clave: " +clave);
            for (Object codigo : valor.keySet()) {
                System.out.println("Clave: "+ codigo +"     valor: "+ valor.get(codigo));
            }
        }
    }
        public static Object VerNULL(Object verificar, Object id) {
            if (verificar != null){
                return verificar;
            }else{
                return id;
            }
    }
}
