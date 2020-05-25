package Exercise_4;

import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;
import org.knowm.xchart.XYSeries;

import java.util.ArrayList;
import java.util.List;

public class SinMain {
    public static void main(String[] args) {
        XYChart chart = new XYChartBuilder().width(800).height(800).build();

        chart.getStyler().setChartTitleVisible(false);
        chart.getStyler().setLegendVisible(false);
        chart.getStyler().setDefaultSeriesRenderStyle(XYSeries.XYSeriesRenderStyle.Scatter);
        chart.getStyler().setMarkerSize(5);
        chart.setTitle("Drawing a Function");
        List<Double> xData = new ArrayList<Double>();
        List<Double> yData = new ArrayList<Double>();

        for (double i = 0; i <= (2*Math.PI) ; i= i + 0.0001) { // i = i+0.0001 because we want more exact plots
            yData.add((1+(i/Math.PI)) * Math.cos(i) * Math.cos(40*i));
            xData.add(i);
        }


        chart.addSeries("line", xData,yData);

        new SwingWrapper(chart).displayChart();

    }
}
