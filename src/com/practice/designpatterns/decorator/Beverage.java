package com.practice.designpatterns.decorator;

/**
 * 
 * @author mallesh
 *
 */
public abstract class Beverage {
		String description = "Unknown Beverage";
	    public static Size size;
	    
	    public Size getSize(){
	    		return size;
	    }
	    
	    public void setSize(Size argSize){
	    	 this.size = argSize;
	    }
	    
		/**
		 * @author mallesh
		 * @return
		 * returns Description of Beverage as String
		 * 
		 */
		public String getDescription(){
				return description;
		}
		
		/**
		 * @author mallesh
		 * @return double
		 * This method has to be implemented in the subclasses
		 */
		public abstract double cost();
}
