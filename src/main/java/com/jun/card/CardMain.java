package com.jun.card;

public class CardMain {
	public static void main(String[] args) {
		
		Card c1 = new Card("H4");
		Card c2 = new Card("H4");
		Card c3 = new Card(c1);

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.getCardVal());
		System.out.println(c2.getCardVal());
		System.out.println(c1.equals(c2));
		System.out.println(c2.equals(c3));
		
		for (int j = 0; j < CardUtil.VALUE.length; j++) {
			Card c = new Card();
			System.out.printf("%s\t", c);
		}
	}
}
