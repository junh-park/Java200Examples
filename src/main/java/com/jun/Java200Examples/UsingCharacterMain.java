package com.jun.Java200Examples;

public class UsingCharacterMain {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Character chr1 = new Character('W');
		Character chr2 = new Character('9');
		
		if(Character.isLetter(chr1.charValue())) {
			System.out.print("1: " + chr1.charValue());
		}

		System.out.print(" ");
		System.out.print('\u0057');System.out.print("\t");
		System.out.println(Integer.toHexString((int)chr1));
		System.out.println((int)chr1);
		if(Character.isDigit(chr2.charValue())) {
			System.out.println("2: " + chr2.charValue());
		}
	}
}
