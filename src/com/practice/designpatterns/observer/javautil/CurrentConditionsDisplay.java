package com.practice.designpatterns.observer.javautil;

import java.util.Observable;

import java.util.Observer;;

public class CurrentConditionsDisplay implements Observer, DisplayElements  {

		Observable observable;
		private float temp;
		private float humid;
		
		public CurrentConditionsDisplay(Observable observable) {
				this.observable=observable;
				observable.addObserver(this);
		}
	
	@Override
	public void display() {
		System.out.println("CurrentConditionsDispla::"+ temp +" F degrees and " + humid +"% humidity");
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData weatherData = (WeatherData) o;
			this.temp = weatherData.getTemp();
			this.humid=weatherData.getHumid();
			display();
		}
		
	}

}
