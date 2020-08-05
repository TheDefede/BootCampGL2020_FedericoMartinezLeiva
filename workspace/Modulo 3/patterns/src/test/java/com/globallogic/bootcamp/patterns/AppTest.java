package com.globallogic.bootcamp.patterns;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AppTest{
	

	
	@Test
	void testInstance() {
		
		Currency theFirstConcurrency = Currency.getInstance();
		
		Currency theSecondtConcurrency = Currency.getInstance();
		
		assertTrue(theFirstConcurrency.equals(theSecondtConcurrency));
		
	}
	
	@Test
	void singletonOrderTest() {
		
		Order theFirstOrder = new Order();
		
		Order theSecondOrder = new Order();
		
		assertTrue(theFirstOrder.getTheCurrency().equals(theSecondOrder.getTheCurrency()));
		
	}
	
	@Test
	void singletonProducTest() {
		
		Order theFirstOrder = new Order();
		
		Order theSecondOrder = new Order();
		
		assertTrue(theFirstOrder.getProduct().equals(theSecondOrder.getProduct()));
		
	}
}
