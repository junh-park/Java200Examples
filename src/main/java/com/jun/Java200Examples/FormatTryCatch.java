package com.jun.Java200Examples;

public class FormatTryCatch {

	public static void main(String[] args) {
		String sNum = "123.5";
		String nNum = "h";
		
		try {
			int a = Integer.parseInt(sNum);
			System.out.println(a);
		} catch (NumberFormatException ee) {
			System.out.println("int인지 확인해봐!!!!");
			System.out.println(ee.getMessage());
		} catch (Exception ee) {
			System.out.println("야 잘 좀 넣어");
		} finally {
			System.out.println("난 수행되어야만해 ");
		}
	}
}
