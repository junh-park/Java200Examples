package com.jun.Java200Examples;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
	public static void main(String[] args) {
		long millis = System.currentTimeMillis();
		System.out.println(millis/1000/24/60/60);
		
		Date d = new Date();
		System.out.println(d);

		Date dd = new Date(d.getTime() + 24*60*60*1000);
		
		Calendar cal1970 = Calendar.getInstance();
		cal1970.set(1970, 0, 1);
		
		Calendar today = Calendar.getInstance();
		printCalendar(today);
		long minus = today.getTimeInMillis() - cal1970.getTimeInMillis();
		System.out.println(minus);
		System.out.println(minus/1000/60/60/24);
	}

	private static void printCalendar(Calendar c) {
		System.out.println("-------------------");
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH+1));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.AM_PM));  
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));
	}
}
