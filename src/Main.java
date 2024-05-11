import java.util.Random;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.data.xy.XYSeries;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        BuscaMatriz objBuscaMatriz = new BuscaMatriz();
        Grafico objGrafico;
        Random random = new Random();

        XYSeries series = new XYSeries("Complexidade");

        for(int tamanho = 100; tamanho < 1000; tamanho = tamanho + 100){
            int valor = 1;
            int[][] matriz = new int[tamanho][tamanho];

            for(int i = 0; i < tamanho; i++){
                for(int j = 0; j < tamanho; j++){
                    matriz[i][j] = valor++;
                }
            }

            int quantidade = objBuscaMatriz.BuscaLinear(matriz);
            // para mudar entre o grafico de BuscaLinear e EsquinaSuperiorDireita é so mudar o objBuscaMatriz
           //int quantidade = objBuscaMatriz.EsquinaSuperiorDireita(matriz);

            series.add(tamanho, quantidade);
            System.out.println("Quantidade de buscas: " + quantidade);
        }

        objGrafico = new Grafico(series);
        System.out.println("Gráfico gerado com sucesso!");
    }
}