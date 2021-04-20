package com.jun.billboard;

public class BillboardMainObject {
	public static void main(String[] args) {
		Billboard b1 = new Billboard(1, "Despacito", 1, "http://www.billboard.com.imgages/pref_images/q61808osztw.jpg",	"luis fonsi");
		Billboard b2 = new Billboard(2, "That's what I like", 2, "http://www.billboard.com.imgages/pref_images/q61808osztw.jpg", "bruno mars");
		Billboard b3 = new Billboard(3, "I'm the one", 3, "http://www.billboard.com.imgages/pref_images/q61808osztw.jpg",	"dj khaled");
		
		showAbout(b1);
		showAbout(b2);
		showAbout(b1,b2);
		showAbout(b1,b2,b3);
		
		Billboard[] b = new Billboard[3];
		b[0] = b1;
		b[1] = b2;
		b[2] = b3;
		
		showAbout(b[0], b[1]);
		showAbout(b);
				
	}
	
	private static void showAbout(Billboard b) {
		System.out.println("1--------------------------------------------------------");
		String sf = String.format("%d, %s, %d, %s, %s", b.getRank(), b.getSong(), b.getLastweek(), b.getImagesrc(),
				b.getArtist());
		System.out.println(sf);
	}
	
	private static void showAbout(Billboard... billboards) {
		System.out.println("2========================================================");
		for (Billboard billboard : billboards) {
			showAbout(billboard);
		}
		System.out.println("<2========================================================");
		
	}
}
