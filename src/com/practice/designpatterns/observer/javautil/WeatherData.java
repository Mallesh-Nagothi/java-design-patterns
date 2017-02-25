package com.practice.designpatterns.observer.javautil;

import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable {
		
		private float temp;
		private float humid;
		private float pres;
		
		public WeatherData() { }

		public void measurementsChanged(){
			setChanged();
			notifyObservers();
		}
		
		public void setMeasurements(float t, float h, float p){
			this.temp = t;
			this.humid=h;
			this.pres=p;
			measurementsChanged();
		}
		
		public float getTemp() {
			return temp;
		}

		public void setTemp(float temp) {
			this.temp = temp;
		}

		public float getHumid() {
			return humid;
		}

		public void setHumid(float humid) {
			this.humid = humid;
		}

		public float getPres() {
			return pres;
		}

		public void setPres(float pres) {
			this.pres = pres;
		}
		
		
		
		
		
		

}
