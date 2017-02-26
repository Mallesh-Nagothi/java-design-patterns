package com.practice.designpatterns.factory;

public abstract class PizzaStore {
	//SimplePizzaFactory pizzaFactory;
	
	/*public PizzaStore(SimplePizzaFactory pizzaFactory){
		this.pizzaFactory = pizzaFactory;
	}*/
	
	public Pizza orderPizza(String pizzaType){
		Pizza pizza;
		//pizza  = pizzaFactory.createPizza(pizzaType);
		pizza  = createPizza(pizzaType);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	protected abstract Pizza createPizza(String pizzaType);
	
}
