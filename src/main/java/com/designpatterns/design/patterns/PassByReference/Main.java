package com.designpatterns.design.patterns.PassByReference;

public class Main {
	public static void main(String[] args) {
		
		Numbers numbers = new Numbers();

		System.out.println(numbers.getI());
		System.out.println(numbers.getJ());
		
		Main main = new Main();
		main.display(numbers);
		System.out.println("After display method...");
		System.out.println(numbers.getI());
		System.out.println(numbers.getJ());
	}
	
	public void display(Numbers numbers) {
		numbers.setI(50);
		numbers.setJ(70);
		
		System.out.println("Inside display method...");
		System.out.println(numbers.getI());
		System.out.println(numbers.getJ());
	}
}
