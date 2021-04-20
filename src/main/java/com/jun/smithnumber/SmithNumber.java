package com.jun.smithnumber;

public class SmithNumber {
	public int sumEach(int a) {
		int sum = 0;
		while (a != 0) {
			sum += a % 10;
			a /= 10;
		}
		return sum;
	}

	public boolean isPrime(int a) {
		boolean isP = true;
		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0) {
				isP = false;
				break;
			}
		}
		return isP;
	}

	public int sumFactors(int a) {
		int sum = 0;
		int i = 2;
		if (a == 1 || a == 0)
			return a;
		
		while (a != 1) {
			if (a % i == 0) {
				sum += i;
				a /= i;
			}
			else {
				i++;
			}
		}
		return sum;
	}

	public boolean isSmith(int a) {
		return sumFactors(a) == sumEach(a);
	}
}
