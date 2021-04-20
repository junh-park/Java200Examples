package com.jun.ant;

public class AntQuiz {
	public String ant(String s) {
		String t = "";
		char c = s.charAt(0);
		int count = 1;
		
		for(int i = 1; i < s.length(); i++) {
			if(c == s.charAt(i)) {
				count++;
			}
			else {
				t = t + count + c;
				c = s.charAt(i);
				count = 1;
			}
		}
		t = t + count + c;
		return t;
	}
	
	public void ant(int stage) {
		String s = "11";
		for (int i = 0; i < stage; i++) {
			System.out.println(s);
			s = ant(s);
		}
	}
	
	public static void main(String[] args) {
		AntQuiz quiz = new AntQuiz();
		quiz.ant(12);
	}
}
