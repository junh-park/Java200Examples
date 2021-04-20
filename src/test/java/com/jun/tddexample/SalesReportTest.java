package com.jun.tddexample;

import static org.mockito.Mockito.*;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class SalesReportTest {

	private static final int TALLY = 234;
	private static final String CITY = "London";
	
	private final PrintStream mockOut = mock(PrintStream.class);
	private final SalesAnalyser mockAnalyser = mock(SalesAnalyser.class);
	private SalesReport report = new SalesReport(mockAnalyser, mockOut);
	
	@Test
	public void shoud_print_city_tallies() {
		Map<String, Integer> cityTallies = new HashMap<String, Integer>();
		cityTallies.put(CITY, TALLY);
		when(mockAnalyser.tallyCitySales()).thenReturn(cityTallies);
		
		report.run();
		
		verify(mockOut).printf(anyString(), eq(CITY), eq(TALLY));
	}
	
}
