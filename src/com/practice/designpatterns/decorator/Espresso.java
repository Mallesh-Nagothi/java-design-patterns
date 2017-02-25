package com.practice.designpatterns.decorator;

public class Espresso extends Beverage {

	public Espresso() {
		description = "Espresso";
	}
	
	@Override
	public double cost() {
		 double cost = 3.99;
		   if(getSize() == Size.TALL){
			    cost = cost + 2.25;
		   }else if(getSize() == Size.GRANDE){
			    cost = cost + 2.50;
		   }else if(getSize() == Size.VENTI){
			    cost = cost + 2.75;
		   }
			return cost;
	}

}
