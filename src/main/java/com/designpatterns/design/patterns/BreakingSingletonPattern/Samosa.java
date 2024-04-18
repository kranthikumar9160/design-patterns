package com.designpatterns.design.patterns.BreakingSingletonPattern;

public class Samosa {
	
	private static Samosa samosa;
	
	private Samosa() {
		if(samosa!=null) {
			throw new RuntimeException("You are trying to break singleton pattern");
		}
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
