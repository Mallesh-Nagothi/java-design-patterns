package com.practice.designpatterns.java;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck malladDuck = new MallardDuck();
		malladDuck.performFly();
		malladDuck.performQuack();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		model.performQuack();
		
		
	}

}
