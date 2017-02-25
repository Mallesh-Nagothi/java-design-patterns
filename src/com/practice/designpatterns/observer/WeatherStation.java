package com.practice.designpatterns.observer;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currCondDisp = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay sDisplay = new StatisticsDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 30.5f);
		weatherData.setMeasurements(82, 60, 33.5f);
		

	}

}
