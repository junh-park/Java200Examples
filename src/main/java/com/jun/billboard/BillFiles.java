package com.jun.billboard;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

public class BillFiles {
	public static void main(String[] args) {
		File f = new File("billboard");
		File[] fd = f.listFiles();
		for (File ff : fd) {
			String fname = ff.getName();
			String post = fname.substring(fname.lastIndexOf(".")+1);
			System.out.println(fname + " " + post);
			System.out.println(ff.getAbsolutePath());
			System.out.println(new Date(ff.lastModified()));
			try(BufferedReader br = new BufferedReader(new FileReader(ff.getAbsolutePath()))){
				String msg = "";
				while((msg = br.readLine()) != null) {
					System.out.println(msg);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("---------------------------");
		}
	}
}
