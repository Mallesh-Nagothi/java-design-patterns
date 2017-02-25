package com.practice.designpatterns.observer;

public class StatisticsDisplay implements Observer, DataElement {

	private float temp;
	private float presr;
	private float humid;
	private Subject weatherData;
	
	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("StatisticsDispaly::"+temp+" pressure:"+presr+" Humidit:"+humid);

	}

	@Override
	public void update(float temp, float humidity, float presure) {
		this.temp = temp;
		this.presr = presure;
		this.humid = humidity;
		display();
	}
}
