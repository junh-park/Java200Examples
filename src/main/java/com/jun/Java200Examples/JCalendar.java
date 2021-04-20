package com.jun.Java200Examples;

public class JCalendar {
	public boolean isLeapYear(int year) {
		boolean isS = false;
		if((year%4==0)&&(year%100!=0) || year%400==0) {
			isS = true;
		}
		return isS;
	}

	public static void main(String[] args) {
		JCalendar hc = new JCalendar();
		System.out.println(hc.isLeapYear(201));
	}

	public int total(int year) {
		int numOfDays = 0;
		
		for(int i = 1; i < year; i++) {
			if(isLeapYear(i)) {
				System.out.println(year + " is a leap year");
				numOfDays += 366;
			}
			else {
				numOfDays += 365;
			}
		}
		return numOfDays;
	}
}
