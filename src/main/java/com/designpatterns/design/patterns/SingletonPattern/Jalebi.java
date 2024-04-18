package com.designpatterns.design.patterns.SingletonPattern;

public class Jalebi {
	private static Jalebi jalebi = new Jalebi();
	
	private Jalebi() {
		
	}
	
	//Eager way of creating singleton object
	public static Jalebi getJalebi() {
		return jalebi;
	}
}
