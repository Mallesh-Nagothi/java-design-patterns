package com.practice.designpatterns.factory;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String pizzaType) {
		Pizza pizza  = null;
		if(pizzaType.equals("cheese")){
			pizza  = new ChicagoStyleCheesePizza();
		}else if(pizzaType.equals("pepperoni")){
			pizza  = new PepperoniPizza();
		}else if(pizzaType.equals("clam")){
			pizza  = new ClamPizza();
		}else if(pizzaType.equals("veggie")){
			pizza  = new VeggiePizza();
		}
		return pizza;
	}

	@Override
	public Pizza orderPizza(String pizzaType) {
		return super.orderPizza(pizzaType);
	}
}
