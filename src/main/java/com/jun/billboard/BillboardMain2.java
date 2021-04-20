package com.jun.billboard;

public class BillboardMain2 {
	public static void main(String[] args) {
		Billboard b1 = new Billboard(1, "Despacito", 1, "http://www.billboard.com.imgages/pref_images/q61808osztw.jpg",
				"luis fonsi");
		showAbout(b1);

		Billboard b = b1;
		showAbout(b);

	}

	private static void showAbout(Billboard b) {
		String sf = String.format("%d, %s, %d, %s, %s", b.getRank(), b.getSong(), b.getLastweek(), b.getImagesrc(),
				b.getArtist());
		System.out.println(sf);
	}
}
