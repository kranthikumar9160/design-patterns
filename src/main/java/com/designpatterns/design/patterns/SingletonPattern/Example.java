package com.designpatterns.design.patterns.SingletonPattern;

public class Example {
	public static void main(String[] args) {
		Samosa samosa1 = Samosa.getSamosa();
		System.out.println("samosa1 hashcode : " + samosa1.hashCode());
		
		Samosa samosa2 = Samosa.getSamosa();
		System.out.println("samosa2 hashcode : " + samosa2.hashCode());
		
		Jalebi jalebi1 = Jalebi.getJalebi();
		System.out.println("jalebi1 hashcode : " + jalebi1.hashCode());
		
		Jalebi jalebi2 = Jalebi.getJalebi();
		System.out.println("jalebi2 hashcode :" + jalebi2.hashCode());
	}
}
