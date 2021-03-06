package com.jun.Java200Examples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class ForCondition3 {
	public static void main(String[] args) {
		List<Integer> ilist = new ArrayList<Integer>();
		int s = 0;
		for (int i = 1; i <= 100; i++) {
			ilist.add(i);
		}
		
		s = ilist.stream().reduce(0, Integer::sum);
		System.out.println("Summation from 1 to 100: " + s);
	
		s = 0;
		s = ilist.stream().filter(e -> e % 2 == 1).reduce(0, Integer::sum);
		System.out.println("Summation of odd numbers from 1 to 100: " + s);
		
		s = 0;
		s = ilist.stream().filter(e -> e % 2 == 1).reduce(0, (x,y) -> x+y);
		System.out.println("Summation of odd numbers from 1 to 100: " + s);
		
		s = 0;
		s = ilist.stream().filter(e -> e % 2 == 1).reduce(0, 
				new BinaryOperator<Integer>() {

					@Override
					public Integer apply(Integer t, Integer u) {
						return t+u;
					}
				});
		System.out.println("Summation of odd numbers from 1 to 100: " + s);
		
		
	}
}
