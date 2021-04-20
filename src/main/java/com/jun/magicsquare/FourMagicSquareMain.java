package com.jun.magicsquare;

import java.util.Scanner;

public class FourMagicSquareMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println("4의 배수 정수를 입력하세요");
		FourMagicSquare square = new FourMagicSquare(n);	
		square.make();
		square.print();
		
	}
}
