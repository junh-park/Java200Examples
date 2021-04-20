package com.jun.jcalendar;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jun.Java200Examples.JCalendar;

public class JCalendarTest {
	
	private JCalendar jc = new JCalendar();
	
	@Test
	public void when_2020_is_entered_it_should_return_true() {
		int year = 2020;
		
		boolean leapYear = jc.isLeapYear(year);
		
		assertTrue(leapYear);
	}
	
	@Test
	public void when_2_is_entered_it_should_return_365() {
		int year = 2;
		
		int numOfDays = jc.total(year);
		
		assertEquals(365, numOfDays);
	}
	
	@Test
	public void when_3_is_entered_it_should_return_365() {
		int year = 3;
		
		int numOfDays = jc.total(year);
		
		assertEquals(730, numOfDays);
	}
	
	@Test
	public void when_4_is_entered_it_should_return_365() {
		int year = 4;
		
		int numOfDays = jc.total(year);
		
		assertEquals(1095, numOfDays);
	}
	
	@Test
	public void when_5_is_entered_it_should_return_365() {
		int year = 5;
		
		int numOfDays = jc.total(year);
		
		assertEquals(1461, numOfDays);
	}
	
 }
