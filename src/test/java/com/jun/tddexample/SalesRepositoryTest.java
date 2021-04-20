package com.jun.tddexample;

import java.util.List;

import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class SalesRepositoryTest {

	@Test
	public void should_load_sample_data() {
		SalesRepository repo = new SalesRepository("src/main/resources/example-sales.csv");
		
		List<Sale> sales = repo.loadSales();
		
		 assertThat(sales, hasItem(allOf(
		            hasProperty("store", equalTo("London")),
		            hasProperty("number", equalTo(2)),
		            hasProperty("pricePerItem", equalTo(30)))));
	}
	

}
