package com.jun.autocloseable;

public class MyAutoCloseable implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("close");
	}

	public void saySomething() {
		System.out.println("Something");
	}

}
