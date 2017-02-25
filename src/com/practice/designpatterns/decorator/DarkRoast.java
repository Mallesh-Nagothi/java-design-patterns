package com.practice.designpatterns.decorator;

import com.practice.designpatterns.decorator.Beverage;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
	
	@Override
	public double cost() {
		   double cost = 0.99;
		   if(getSize() == Size.TALL){
			    cost = cost + .25;
		   }else if(getSize() == Size.GRANDE){
			    cost = cost + .50;
		   }else if(getSize() == Size.VENTI){
			    cost = cost + .75;
		   }
			return cost;
	}

}
