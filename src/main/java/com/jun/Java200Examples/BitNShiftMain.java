package com.jun.Java200Examples;

public class BitNShiftMain {
	
	public static String shifts(int a) {
		String s = "";
		for(int i=0; i<=31; i++) {
			int aa = a % 2;
			s = (aa>=0)? aa+s : (-aa)+s;
			a>>=1;
		}
		return s;
	}
	
	public static void main(String[] args) {
		int intNums1 = 123;
		int intNums2 = -123;
		String shifts1 = shifts(intNums1);
		System.out.printf("%d: %s%n",intNums1, shifts1);
		String shifts2 = shifts(intNums2);
	 	System.out.printf("%d: %s%n",intNums2, shifts2);
	 	int a = -1>>1;
	 	System.out.println(a);
	 	System.out.println(-123>>1);
	}
}
