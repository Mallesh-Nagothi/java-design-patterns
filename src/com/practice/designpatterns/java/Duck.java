package com.practice.designpatterns.java;

/**
 * 
 * @author mallesh
 * @since 02/18/2017
 * 
 *  This is an abstract class which hides behavior of Duck in a separate interfaces and implementation classes
 *  This is for demonstrating Strategy Pattern
 */
public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck(){  }
	
	public abstract void display();
	
	public void performFly(){
			flyBehavior.fly();
	}
	
	public void performQuack(){
			quackBehavior.quack();
	}
	
	public void swim(){
		System.out.println("All ducks float, incl decoys!! Swimming from Abstract Super Class DUCK");
	}

	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	
	
	
}
