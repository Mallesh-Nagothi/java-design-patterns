package com.practice.designpatterns.observer.javautil;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay cDisplay  =new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(45, 55, 55.5f);

	}

}
