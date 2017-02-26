package com.practice.designpatterns.factory;

public class SimplePizzaFactory {

	public Pizza createPizza(String pizzaType){
		Pizza pizza  = null;
		if(pizzaType.equals("cheese")){
			pizza  = new CheesePizza();
		}else if(pizzaType.equals("pepperoni")){
			pizza  = new PepperoniPizza();
		}else if(pizzaType.equals("clam")){
			pizza  = new ClamPizza();
		}else if(pizzaType.equals("veggie")){
			pizza  = new VeggiePizza();
		}
		return pizza;
	}
	
}
