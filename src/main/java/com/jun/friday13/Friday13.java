package com.jun.friday13;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Friday13 {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		int currentYear = cal.get(Calendar.YEAR);
		int count = 1;
		
		for(int year = 2000; year <= currentYear; year++) {
			for(int month = 0; month < 12; month++) {
				cal.set(year, month, 13);
				if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {
					System.out.println((count++) + "\t" + sdf.format(cal.getTime()));
				}
			}
		}
	}
}
