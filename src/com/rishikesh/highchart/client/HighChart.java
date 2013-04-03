package com.rishikesh.highchart.client;

import org.moxieapps.gwt.highcharts.client.Chart;
import org.moxieapps.gwt.highcharts.client.Series;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class HighChart implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {

    Chart chart = new Chart()
    .setType(Series.Type.SPLINE)
    .setChartTitleText("Temperaturen")
    .setMarginRight(10);
	
	Series series = chart.createSeries()
	.setName("°C in Palma")
	.setPoints(new Number[] { 22.4, 25.6, 20.5, 19.0, 17.0, 18.0, 19.0, 18.3 });
	chart.addSeries(series);

	Series series2 = chart.createSeries()
	.setName("°C in Leipzig")
	.setPoints(new Number[] { 13.5, 14.3, 16.4, 9.9, 12.5, 13.0, 15.9, 20.0} );
	chart.addSeries(series2);
	
	RootPanel.get().add(chart);
	
	}
	
}
