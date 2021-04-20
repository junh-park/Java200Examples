package com.jun.Java200Examples;

import java.util.Date;
import java.util.Enumeration;
import java.util.Properties;

public class SystemTest {
	public static void main(String[] args) {
		long ltime = System.currentTimeMillis();
		System.out.println(ltime);
		for(int i = 0; i < 100000; i++) {
			System.out.print("");
		}
		
		long ltime2 = System.currentTimeMillis();
		System.out.println((ltime2 - ltime)/1.0e9);
		System.out.println(ltime2/1000/60/60/24/365 + "years");
		Properties properties = System.getProperties();
	
		System.out.println(properties.getProperty("java.vm.version"));
		System.out.println(properties.getProperty("file.separator"));
		
		System.out.println(new Date(System.currentTimeMillis()));
	
		Enumeration<Object> en = properties.keys();
		int i = 0;
		while(en.hasMoreElements()) {
			String keys = (String) en.nextElement();
			System.out.println((++i +" ") + keys + " : " + properties.getProperty(keys));
		}
	}
}
