package com.jun.tddexample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;

public class SalesRepository {

	private String fileLocation;
	private List<Sale> sales;

	public SalesRepository(String fileLocation) {
		this.fileLocation = fileLocation;
	}

	public List<Sale> loadSales() {
		if (sales == null) {
			sales = new ArrayList<Sale>();
			final File file = new File(fileLocation);
			if (!file.exists() || !file.canRead() || !file.isFile()) {
				System.err.println("Unable to find readable file: " + file.getAbsolutePath());
			}

			try (CSVReader reader = new CSVReader(new FileReader(fileLocation))) {
				String[] nextLine;
				while ((nextLine = reader.readNext()) != null) {
					String store = nextLine[1].trim();
					int number = Integer.parseInt(nextLine[2].trim());
					int pricePerItem = Integer.parseInt(nextLine[3].trim());
					sales.add(new Sale(store, number, pricePerItem));
				}
				return sales;
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		}
		return sales;
	}
}
