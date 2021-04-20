package com.jun.billboard;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class RestDay {
	public static void main(String[] args) {
		String st = "2017-06-13";
		Calendar d2 = todate(st);
		
		System.out.println(toYMD(d2));
		
		String st2 = goGo(st, -7);
		System.out.println(st2);
		Calendar d3 = todate(st2);
		System.out.println(toYMD(d3));
		
		TimeZone tz = TimeZone.getDefault();
		Calendar cal = Calendar.getInstance();
		System.out.println(toYMD(cal));
		
		TimeZone tzNY = TimeZone.getTimeZone("America/New_York");
		Calendar calNY = Calendar.getInstance(tzNY);
		System.out.println(toYMD2(calNY));
	}

	private static Calendar todate(String ss) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date dd = new Date();
		
		try {
		dd = sdf.parse(ss);
		}
		catch (ParseException e) {
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(dd);
		return cal;
	}
	
	private static String goGo(String ss, int day) {
		Calendar cal = todate(ss);
		cal.add(Calendar.DAY_OF_YEAR, day);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(cal.getTime());
	}

	private static String toYMD(Calendar dd) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(dd.getTime());
	}

	private static String toYMD2(Calendar dd) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(dd.getTime());
	}
}
