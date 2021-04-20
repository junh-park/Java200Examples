package com.jun.sumeach;

import com.jun.divide.PrimeDivide;

public class Smith {
	public static void printSmith(int t1, int t2) {
		for(int i = t1; i < t2; i++) {
			if(!SumEach.isPrime(i) && SumEach.sumEach(i) == SumEach.sumSmith(i)) {
				System.out.printf("%d는 스미스 수 ",i);
				PrimeDivide.printPrimeDivide(i);
			}
		}
	}
	
	public static void main(String[] args) {
		printSmith(10000, 20000);
	}
}
