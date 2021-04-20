package com.jun.Java200Examples;

import java.beans.MethodDescriptor;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class UsingClass {
	public static void main(String[] args) {
		
		Object obj1 = new Object();
		Class classes = obj1.getClass();
		System.out.println(classes.getName());
		System.out.println("---------constructor----------");
		
		Constructor[] constructors = classes.getDeclaredConstructors();
		
		for(Constructor con : constructors) {
			System.out.println(con.getName());
		}
		
		System.out.println("-------methods------");
		
		Method[] methods = classes.getMethods();
		
		for (Method method : methods) {
			System.out.println(method.getName());
		}
	}
}
