package com.designpatterns.design.patterns.ProtypeDesignPattern;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Creating object using prototype design pattern");
		
		NetworkConnection networkConnection = new NetworkConnection();
		networkConnection.setIp("192.168.1.103");
		networkConnection.loadVeryImportantData();
		
		System.out.println(networkConnection);
		
		
		NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();
		NetworkConnection networkConnection3 = (NetworkConnection) networkConnection.clone();
		
		System.out.println(networkConnection2);
		System.out.println(networkConnection3);
	}
}
