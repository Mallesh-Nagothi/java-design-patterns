package com.practice.designpatterns.decorator;

public class Decaf extends Beverage {

	public Decaf() {
		description = "Decaf  Coffee";
	}
	
	@Override
	public double cost() {
		 double cost = 2.99;
		   if(getSize() == Size.TALL){
			    cost = cost + 1.25;
		   }else if(getSize() == Size.GRANDE){
			    cost = cost + 1.50;
		   }else if(getSize() == Size.VENTI){
			    cost = cost + 1.75;
		   }
			return cost;
	}

}
