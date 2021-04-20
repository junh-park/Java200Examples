package com.jun.tddexample;

import java.io.PrintStream;
import java.util.Map;

public class SalesReport {

	private SalesAnalyser analyser;
	private PrintStream out;

	public SalesReport(SalesAnalyser analyser, PrintStream out) {
		this.analyser = analyser;
		this.out = out;
	}

	public void run() {
		analyser.tallyCitySales().forEach((city, tally) -> {
			out.printf("- %-15s - %6.6s -%n", city, tally);
		});
	}
}
