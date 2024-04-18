package com.designpatterns.design.patterns.SingletonPattern;

public class Samosa {
	
	private static Samosa samosa;
	
	private Samosa() {
		
	}
	
	//lazy way of creating singleton object
	public static Samosa getSamosa() {
		
		synchronized (Samosa.class) {
			if(samosa==null) {
				samosa = new Samosa();
			}
		}
		
		return samosa;
	}
}
