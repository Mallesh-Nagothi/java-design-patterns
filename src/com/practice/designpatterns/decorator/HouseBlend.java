package com.practice.designpatterns.decorator;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		description = "House Blend Coffee";
	}
	
	@Override
	public double cost() {
		 double cost = 3.99;
		   if(getSize() == Size.TALL){
			    cost = cost + 3.25;
		   }else if(getSize() == Size.GRANDE){
			    cost = cost + 3.50;
		   }else if(getSize() == Size.VENTI){
			    cost = cost + 3.75;
		   }
			return cost;
	}
}
