package com.jun.volatileexample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UnsafeCounterTest {

	@Test
	public void testUnsafeCounter() throws InterruptedException {
		UnsafeCounter unsafeCounter = new UnsafeCounter();
		Thread first = new Thread(() ->  {
			for(int i = 0; i < 5; i++) {
				unsafeCounter.inc();
			}
		});
		
		Thread second = new Thread(() ->  {
			for(int i = 0; i < 5; i++) {
				unsafeCounter.dec();
			}
		});
		
		first.start();
		second.start();
		first.join();
		second.join();
		
		System.out.println("Current counter value: " + unsafeCounter.get());

		assertEquals(0, unsafeCounter.get());
	}
}
