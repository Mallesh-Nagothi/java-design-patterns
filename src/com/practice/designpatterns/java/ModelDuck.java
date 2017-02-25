package com.practice.designpatterns.java;

public class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("Guys.. excuse me I'm a model duck not real");

	}

}
