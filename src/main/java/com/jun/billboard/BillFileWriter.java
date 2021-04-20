package com.jun.billboard;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class BillFileWriter {
	public static void main(String[] args) {
		Billboard b1 = new Billboard(1, "Despacito", 1, "http://www.billboard.com.imgages/pref_images/q61808osztw.jpg",
				"luis fonsi");
		Billboard b2 = new Billboard(2, "That's what I like", 2,
				"http://www.billboard.com.imgages/pref_images/q61808osztw.jpg", "bruno mars");
		Billboard b3 = new Billboard(3, "I'm the one", 3,
				"http://www.billboard.com.imgages/pref_images/q61808osztw.jpg", "dj khaled");
		ArrayList<Billboard> bblist = new ArrayList<Billboard>();
		
		bblist.add(b1);
		bblist.add(b2);
		bblist.add(b3);
		
		File f = new File("billboard");
		if(!f.exists()) {
			f.mkdirs();
		}
		try(PrintWriter pw = new PrintWriter(new FileWriter("billboard\\bill.txt", false),true)){
			for (Billboard billboard : bblist) {
				pw.println(billboard);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
