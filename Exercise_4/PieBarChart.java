package Exercise_4;

import org.knowm.xchart.*;
import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.style.Styler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class PieBarChart {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\programmering\\integers.dat");
        Scanner scan = new Scanner(file);
        Integer lessThan10 = 0, less20 = 0, less30 = 0, less40 = 0,
                less50 = 0, less60 = 0, less70 = 0, less80 = 0, less90 = 0, less100 = 0;
        while (scan.hasNext()) {
            String s = scan.next();

            if (Integer.parseInt(s) < 10) {
                lessThan10++;
            } else if (Integer.parseInt(s) < 20) {
                less20++;
            } else if (Integer.parseInt(s) < 30) {
                less30++;
            } else if (Integer.parseInt(s) < 40) {
                less40++;
            } else if (Integer.parseInt(s) < 50) {
                less50++;
            } else if (Integer.parseInt(s) < 60) {
                less60++;
            } else if (Integer.parseInt(s) < 70) {
                less70++;
            } else if (Integer.parseInt(s) < 80) {
                less80++;
            } else if (Integer.parseInt(s) < 90) {
                less90++;
            } else less100++;
        }
        start(lessThan10, less20, less30, less40, less50,
                less60, less70, less80, less90, less100);
    }

    public static void start(Integer lessThan10, int less20, int less30, int less40, int less50,
                             int less60, int less70, int less80, int less90, int less100){

            PieChart Piechart = new PieChartBuilder().width(800).height(800).build();
            CategoryChart Barchart = new CategoryChartBuilder().width(800).
                    height(800).title("Integer Bar Chart").
                    yAxisTitle("Intervals").yAxisTitle("Count").build();

            Barchart.getStyler().setLegendPosition(Styler.LegendPosition.InsideNW);
            Barchart.getStyler().setHasAnnotations(true);
            Barchart.addSeries("Integer Value",
                    Arrays.asList("<10", "<20","<30", "<40", "<50", "<60",
                    "<70", "<80", "<90", "<100"),
                    Arrays.asList(lessThan10, less20,less30
                            ,less40,less50,less60,
                    less70,less80,less90,less100));
            Piechart.setTitle("Integer Pie Chart");
            Piechart.addSeries("<10", lessThan10);
            Piechart.addSeries("<20", less20);
            Piechart.addSeries("<30", less30);
            Piechart.addSeries("<40", less40);
            Piechart.addSeries("<50", less50);
            Piechart.addSeries("<60", less60);
            Piechart.addSeries("<70", less70);
            Piechart.addSeries("<80", less80);
            Piechart.addSeries("<90", less90);
            Piechart.addSeries("<100", less100);
            new SwingWrapper<>(Piechart).displayChart();
            new SwingWrapper<>(Barchart).displayChart();

        }
    }