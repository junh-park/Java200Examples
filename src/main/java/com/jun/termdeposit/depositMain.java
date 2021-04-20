package com.jun.termdeposit;

public class depositMain {
	public static void main(String[] args) {
		double saveUs = TermDeposit.saveUs(144000, 36, 1.5);
		System.out.printf("적금: %.0f \n", saveUs);
	}
}
