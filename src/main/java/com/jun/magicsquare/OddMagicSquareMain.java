package com.jun.magicsquare;

import java.util.Scanner;

public class OddMagicSquareMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println("홀수 정수를 입력하세요");
		OddMagicSquare odd = new OddMagicSquare(n);
		odd.make();
		odd.print();
	}
}
