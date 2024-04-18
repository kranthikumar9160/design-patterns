package com.designpatterns.design.patterns.BreakingSingletonPattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;

public class Example {

	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, FileNotFoundException, IOException, ClassNotFoundException {

// 1. Reflection API to break Singleton Pattern
// sol: If object is there -> then throw exception from inside constructor
		
		
//		Samosa samosa1 = Samosa.getSamosa();
//		System.out.println("samosa1 hashcode : " + samosa1.hashCode());
//		
//		Constructor[] constructor = Samosa.class.getDeclaredConstructors();
//		
//		Constructor<Samosa> constructor1 = constructor[0];
//		constructor1.setAccessible(true);
//		
//		Samosa samosa2 = constructor1.newInstance();
//		
//		System.out.println("samosa2 hashcode : " +  samosa2.hashCode());
		
		
// 2. Deserialization
		
		Samosa samosa = Samosa.getSamosa();
		System.out.println(samosa.hashCode());
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
		oos.writeObject(samosa);
		
		System.out.println("serialization done..");
		
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
		Samosa s2= (Samosa) ois.readObject();
		System.out.println(s2.hashCode());
		
	}
	
}
