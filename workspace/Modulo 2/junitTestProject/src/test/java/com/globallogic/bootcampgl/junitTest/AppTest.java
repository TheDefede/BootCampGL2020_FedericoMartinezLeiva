package com.globallogic.bootcampgl.junitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {
	

	@Test
	void test11() {
		assertEquals("Test", "Test");
	}
	
	@Test 
	void test12equals(){
		String primerString = "abc";
		String segundaString = "abcd";
		
		assertEquals(primerString, segundaString);
	}
	
	@Test 
	void test12NotEquals(){
		String primerString = "abcd";
		String segundaString = "abcd";
		
		assertNotEquals(primerString, segundaString);
	}
	
	@Test
	void greaterThanTrue13() {
		Integer a = 12;
		Integer b = 25;
		Boolean bool = a > b;
		
		assertTrue(bool);
	}
	
	@Test
	void greaterThanFalse13() {
		Integer a = 27;
		Integer b = 25;
		Boolean bool = a > b;
		
		assertFalse(bool);
	}
	
	@Test
	void assertNullAndNotNull() {
		Long id = 1l;
		assertNull(id);
		id = null;
		assertNotNull(id);
	}
	
	@Test
	void sumMethod() {
		
		int a = 2;
		int b = 3;		
		assertEquals(5, App.suma(a, b));
	}
	
	@Test
	void sumMethodError() {
		
		int a = 2;
		int b = 3;		
		assertEquals(6, App.suma(a, b), "el resultado esta mal: ");
	}
	
	@Test
	void forMethodTestTrue() {
		
		assertTrue(App.forMethod(4), "Esta variable no es true");
		
	}
	
	@Test
	void forMethodTestFalse() {
		
		assertFalse(App.forMethod(2), "Esta variable no es false");
		
	}
	
	

}
