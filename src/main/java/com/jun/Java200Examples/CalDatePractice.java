package com.jun.Java200Examples;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalDatePractice {

	public static void main(String[] args) {
		
		
		long currentTimeMillis = System.currentTimeMillis();
		@SuppressWarnings("unused")
		int days = ((int) (currentTimeMillis/1000/24/60/60));
		
		System.out.println("Current time in milisecond: " + currentTimeMillis);
		
		Date d = new Date();
		Date dd = new Date(d.getTime()+24*60*60*1000);
		
		System.out.println("Current date : " + d);
		System.out.println("TMW : " + dd);
		
		Calendar cal1970 = Calendar.getInstance();
		cal1970.set(1970,1-1,1);
		
		Calendar today = Calendar.getInstance();
		long minus = today.getTimeInMillis()-cal1970.getTimeInMillis();
		
		System.out.println("time difference : " + minus);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String st=sdf.format(dd);
		System.out.println("time : " + st);
		
		double ups2 = 8.9/2;
		System.out.printf("적당한 하이힐 높이는 %1$.2fcm입니다.", ups2);
		
	}
}
