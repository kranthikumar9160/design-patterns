package com.designpatterns.design.patterns.FactoryDesignPattern;

public class WebDeveloper implements Employee {
	public int salary() {
		System.out.println("Getting web developer salary");
		return 40000;
	}
}
