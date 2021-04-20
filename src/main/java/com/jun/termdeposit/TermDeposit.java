package com.jun.termdeposit;

public class TermDeposit {
	public static double saveUs(int money, int month, double ratio) {
		double tot = 0;
		double r = ratio/100/12;
		double a = money;
		
		for(int i = 0; i < month; i++) {
			a = a*(1+r);
			tot += a;
		}
		return tot;
	}
}
