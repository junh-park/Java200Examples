package com.jun.Java200Examples;

public class ForCondition {

	public static void main(String[] args) {
		int s=0;
		for(int i = 1; i <= 100; i+=2) {
			System.out.println(i);
			s+=1;
		}
		System.out.println(s);
	}
}
