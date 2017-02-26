package com.practice.designpatterns.factory;

public class PizzaOrderClient {

	public static void main(String[] args) {
		PizzaStore pizzaNYStore = new NYPizzaStore();
		PizzaStore pizzaCiGoStore = new ChicagoPizzaStore();
		
		Pizza pizza = pizzaNYStore.orderPizza("cheese");
		System.out.println("We have ordered "+ pizza.getName()+" \n");
		

		pizza = pizzaCiGoStore.orderPizza("cheese");
		System.out.println("We have ordered "+ pizza.getName()+" \n");
	}

}
