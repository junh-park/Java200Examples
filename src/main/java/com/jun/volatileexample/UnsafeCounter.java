package com.jun.volatileexample;

public class UnsafeCounter {

	private volatile int counter;
	
	public void inc() {
		counter++;
	}
	
	public void dec() {
		counter--;
	}
	
	public int get() {
		return counter;
	}
}
