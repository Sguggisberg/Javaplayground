package ch.stg.allgemein.reflection;

import java.awt.Point;

public class Example1 {

	
	
	public static void main(String[] args) {
		// 1. Class Object 
		System.out.println(String.class);
		System.out.println(int.class);
		System.out.println(String[].class);

		// 2. 
		System.out.println("".getClass());
		System.out.println(new Point().getClass());
		
		// 3. 
		try {
			Class<?> aClass = Class.forName("java.lang.String");
			System.out.println(aClass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// Referenztyp Object
		// Objecttyp String bzw. Point
		
		Object o1 = ""; 
		Object o2 = new Point();
		System.out.println(o1.getClass().getClassLoader());
	}

}
