package com.practice.designpatterns.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	List<String> toppings = new ArrayList<String>();
	
	void prepare(){
		System.out.println("Preparing::"+name);
		System.out.println("Tossing dough");
		System.out.println("Adding Sauce");
		System.out.println("Adding Toppings");
		for(int i=0; i < toppings.size(); i++){
			System.out.println("  "+toppings.get(i));
		}
	}
	
	void bake(){
		System.out.println("Bake for 25 minutes at 350 degrees");
	}
	
	void cut(){
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	void box(){
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	public String getName(){
		return name;
	}
	
	
}
