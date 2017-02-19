package com.practice.designpatterns.java;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		/*Duck malladDuck = new MallardDuck();
		malladDuck.performFly();
		malladDuck.performQuack();*/
		
		int x  = 10;
		int result = 0;
		for(int j = 1; j <=  x; j  =  j + 1 ){
			result = j * 8;
			System.out.println(j + " X 8= "+ result);
		}
			}

}
