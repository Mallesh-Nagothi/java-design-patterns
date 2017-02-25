package com.practice.designpatterns.observer;

/**
 * 
 * @author mallesh
 *
 */
public class CurrentConditionsDisplay implements Observer, DataElement {
	private float temp;
	private float humid;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
			this.weatherData = weatherData;
			weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
			System.out.println("CurrentConditionsDispla::"+ temp +" F degrees and " + humid +"% humidity");
	}

	@Override
	public void update(float temp, float humidity, float presure) {
		this.temp = temp;
		this.humid = humidity;
		display();
	}

}
