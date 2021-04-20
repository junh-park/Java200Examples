package com.jun.billboard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class BillboardArrayMain {
	public static void main(String[] args) {
		ArrayList<String> htmls = new ArrayList<String>();

		String newUrls = "https://www.billboard.com/charts/hot-100";
		URL url = null;

		try {
			url = new URL(newUrls);
			BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "euc-kr"), 8);
			String line = null;
			while ((line = reader.readLine()) != null) {
				if (line.trim().startsWith("")) {
					htmls.add(line.trim());
				}
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (String str : htmls) {
			System.out.println(str);
		}
	}

}
