package com.practice.designpatterns.factory;

public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza(){
		name  = "Chicago Style Deep Dish Cheese Pizza";
		dough = "Chicago Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		toppings.add("Shredded Mozzarella Cheese");
	}
	
	void cut(){
		System.out.println("Cutting the pizza into Square slices");
	}
	
}
