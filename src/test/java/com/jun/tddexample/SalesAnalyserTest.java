package com.jun.tddexample;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class SalesAnalyserTest {

	private static final List<Sale> exampleSales = Arrays.asList(
			new Sale("Cardiff", 10, 2),
			new Sale("Cardiff", 3, 5),
			new Sale("Cardiff", 6, 20),
			new Sale("London", 5, 7)
			);
	
	private static final Map<String, Integer> expectedStoreSales = new HashMap<String, Integer>();
	static {
		expectedStoreSales.put("Cardiff", 155);
		expectedStoreSales.put("London", 35);
	}
	
	@Test
	public void should_aggregate_sales() {
		SalesRepository mockRepository = mock(SalesRepository.class);
		when(mockRepository.loadSales()).thenReturn(exampleSales);
		
		SalesAnalyser analyser = new SalesAnalyser(mockRepository);
		
		Map<String, Integer> storeSales = analyser.tallyCitySales();
		
		assertEquals("Calculated wrong store sales", expectedStoreSales, storeSales);
		verify(mockRepository,times(1)).loadSales();
	}
}
