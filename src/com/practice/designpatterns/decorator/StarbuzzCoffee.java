package com.practice.designpatterns.decorator;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		beverage.setSize(Size.TALL);
		System.out.println("Beverage ::"+beverage.getDescription()+" Cost::$"+beverage.cost());
		
		Beverage beverage1 = new DarkRoast();
		beverage.setSize(Size.VENTI);
		beverage1 = new Mocha(beverage1);
		beverage1 = new Mocha(beverage1);
		beverage1 = new Whip(beverage1);
		System.out.println("Beverage 1::"+beverage1.getDescription()+" Cost::$"+beverage1.cost());
		
		Beverage beverage2 = new DarkRoast();
		beverage.setSize(Size.GRANDE);
		beverage2 = new Soy(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println("Beverage 2::"+beverage2.getDescription()+" Cost::$"+beverage2.cost());
		
		

	}

}
