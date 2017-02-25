package com.practice.designpatterns.observer;

/**
 * 
 * @author mallesh
 *
 */
public interface Subject {
		public void registerObserver(Observer o);
		public void removeObserver(Observer o);
		public void notifyObservers();
}
