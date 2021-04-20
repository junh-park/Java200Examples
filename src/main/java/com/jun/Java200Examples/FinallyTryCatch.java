package com.jun.Java200Examples;

public class FinallyTryCatch {
	
	public static void main(String[] args) {
		try {
			int x = 5;
			int y = 20 / (5 - x);
			System.out.println(y);
		} catch (ArithmeticException e) {
			System.out.println("Check denominator for 0");
			e.printStackTrace();
		} finally {
			System.out.println("Function Executed");
		}
	}
}
