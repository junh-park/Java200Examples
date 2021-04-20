package com.jun.smithnumber;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SmithNumberTest {
	SmithNumber smith; 

	@Before
	public void setUp() {
		smith = new SmithNumber();
	}
	
	@Test
	public void When12NumbersAreEntered_TheResultShouldBe3() {
		int a = 12;
		int result = smith.sumEach(a);
		assertEquals(3, result);
	}
	
	@Test
	public void When123NumbersAreEntered_SumThemUp() {
		int a = 123;
		int result = smith.sumEach(a);
		assertEquals(6, result);
	}
	
	@Test
	public void When4IsInserted_ItReturnsTrue() {
		int a = 4;
		
		assertFalse(smith.isPrime(a));
	}
	
	@Test
	public void When5IsInserted_ItReturnsTrue() {
		int a = 5;
		
		assertTrue(smith.isPrime(a));
	}
	
	@Test
	public void When6IsInserted_ItReturnsFalse() {
		int a = 6;
		
		assertFalse(smith.isPrime(a));
	}
	
	@Test
	public void When15000001IsInserted_ItReturnsFalse() {
		int a = 15000001;
		boolean prime = smith.isPrime(a);
		
		assertFalse(prime);
	}
	
	@Test
	public void When_37_Is_Inserted_It_Returns_False() {
		int a = 37;
		boolean prime = smith.isPrime(a);
		
		assertTrue("37 must be a prime number", prime);
	}

	@Test
	public void When22IsEntered_ItShouldReturn13() {
		int a = 22;
		
		assertEquals(13, smith.sumFactors(a));
	}
	
	@Test
	public void When27IsEntered_ItShouldReturn23() {
		int a = 27; 
		
		assertEquals(9, smith.sumFactors(a));
	}
	
	@Test
	public void When14IsEntered_ItShouldReturn23() {
		int a = 14; 
		
		assertEquals(9, smith.sumFactors(a));
	}
	
	@Test
	public void When20IsEntered_ItShouldReturn23() {
		int a = 20; 
		
		assertEquals(9, smith.sumFactors(a));
	}
	
	@Test
	public void When35IsEntered_ItShouldReturn23() {
		int a = 35; 
		
		assertEquals(12, smith.sumFactors(a));
	}
	
	@Test
	public void When27IsEntered_ItShouldReturnTrue() {
		int a = 27;
		
		boolean smithNumber = smith.isSmith(a);
		
		assertTrue(smithNumber);
	}
	
}
