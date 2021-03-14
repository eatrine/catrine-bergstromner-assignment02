package com.nackademin.catrine_bergstromner_assignment02;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

import java.util.logging.Logger;

public class MyAdvancedCalcTest {
	AdvancedCalculator ac = new AdvancedCalculator ();
	//Random rand = new Random ();
	public static final Logger LOG = Logger.getLogger(AdvancedCalculator.class.getName());

	//test with positive numbers

	@Test
	public void testAdvCalcPos() {
		double min = 30.0;
		double max = 1.0;
		double tempNum3 = 0.0;
		double tempNum4= 0.0;
		double tempNum5= 0.0;
		double tempNum6= 0.0;
		double tempBase = 0.0;
		double tempExp = 0.0;
		double tempResult = 0.0;
		
		for (int i=0; i<5; i++) {
			tempNum3 = (Math.random() * (max - min)+ min);
			tempResult = Math.sqrt(tempNum3);
			LOG.info("Calculating the square root of value " + tempNum3 + " and the result is " + tempResult);
			assertEquals(ac.square(tempNum3), tempResult, 0);
		
		}
		for (int i=0; i<5; i++) {
			tempBase = (Math.random() * (max - min)+ min);
			tempExp = (Math.random() * (max - min)+ min);
			tempResult = Math.pow(tempBase,tempExp);
			LOG.info("Calculating the power of a value " + tempBase + " powered of " + tempExp + " and the result is " + tempResult);
			assertEquals(ac.powerOf(tempBase, tempExp), tempResult, 0);
		
		}
		for (int i=0; i<5; i++) {
			tempNum4 = (Math.random() * (max - min)+ min);
			tempResult = Math.tan(tempNum4);
			LOG.info("Calculating the tangent of an angle " + tempNum4 + " and the result is " + tempResult);
			assertEquals(ac.tan(tempNum4), tempResult, 0);
		
		}
		for (int i=0; i<5; i++) {
			tempNum5 = (Math.random() * (max - min)+ min);
			tempResult = Math.sinh(tempNum5);
			LOG.info("Calculating the hyperbolic sin of a value " + tempNum5 + " and the result is " + tempResult);
			assertEquals(ac.sinh(tempNum5), tempResult, 0);
		
		}
		for (int i=0; i<5; i++) {
			tempNum6 = (Math.random() * (max - min)+ min);
			tempResult = Math.cosh(tempNum6);
			LOG.info("Calculating the hyperbolic cos of a value " + tempNum6 + " and the result is " + tempResult);
			assertEquals(ac.cosh(tempNum6), tempResult, 0);
		
		}
	}
	
	//test with negative numbers
	
	@Test
	public void testAdvCalcNeg() {
		double min = -30.0;
		double max = -1.0;
		double tempNum3 = 0.0;
		double tempNum4= 0.0;
		double tempNum5= 0.0;
		double tempNum6= 0.0;
		double tempBase = 0.0;
		double tempExp = 0.0;
		double tempResult = 0.0;
		
		for (int i=0; i<5; i++) {
			tempNum3 = (Math.random() * (max - min)+ min);
			tempResult = Math.sqrt(tempNum3);
			LOG.info("Calculating the square root of value " + tempNum3 + " and the result is " + tempResult);
			assertEquals(ac.square(tempNum3), tempResult, 0);
		
		}
		for (int i=0; i<5; i++) {
			tempBase = (Math.random() * (max - min)+ min);
			tempExp = (Math.random() * (max - min)+ min);
			tempResult = Math.pow(tempBase,tempExp);
			LOG.info("Calculating the power of a value " + tempBase + " powered of " + tempExp + " and the result is " + tempResult);
			assertEquals(ac.powerOf(tempBase, tempExp), tempResult, 0);
		
		}
		for (int i=0; i<5; i++) {
			tempNum4 = (Math.random() * (max - min)+ min);
			tempResult = Math.tan(tempNum4);
			LOG.info("Calculating the tangent of an angle " + tempNum4 + " and the result is " + tempResult);
			assertEquals(ac.tan(tempNum4), tempResult, 0);
		
		}
		for (int i=0; i<5; i++) {
			tempNum5 = (Math.random() * (max - min)+ min);
			tempResult = Math.sinh(tempNum5);
			LOG.info("Calculating the hyperbolic sin of a value " + tempNum5 + " and the result is " + tempResult);
			assertEquals(ac.sinh(tempNum5), tempResult, 0);
		
		}
		for (int i=0; i<5; i++) {
			tempNum6 = (Math.random() * (max - min)+ min);
			tempResult = Math.cosh(tempNum6);
			LOG.info("Calculating the hyperbolic cos of a value " + tempNum6 + " and the result is " + tempResult);
			assertEquals(ac.cosh(tempNum6), tempResult, 0);
		
		}
	}
	//test with zero
	@Test
	public void testAdvCalcZero() {
		double min = 30.0;
		double max = 0.0;
		double tempNum3 = 0.0;
		double tempNum4= 0.0;
		double tempNum5= 0.0;
		double tempNum6= 0.0;
		double tempBase = 0.0;
		double tempExp = 0.0;
		double tempResult = 0.0;
		
		for (int i=0; i<5; i++) {
			tempResult = Math.sqrt(tempNum3);
			LOG.info("Calculating the square root of value " + tempNum3 + " and the result is " + tempResult);
			assertEquals(ac.square(tempNum3), tempResult, 0);
		
		}
		for (int i=0; i<5; i++) {
			//tempBase = (Math.random() * (max - min)+ min);
			tempExp = (Math.random() * (max - min)+ min);
			tempResult = Math.pow(tempBase,tempExp);
			LOG.info("Calculating the power of a value " + tempBase + " powered of " + tempExp + " and the result is " + tempResult);
			assertEquals(ac.powerOf(tempBase, tempExp), tempResult, 0);
		
		}
		for (int i=0; i<5; i++) {
			tempResult = Math.tan(tempNum4);
			LOG.info("Calculating the tangent of an angle " + tempNum4 + " and the result is " + tempResult);
			assertEquals(ac.tan(tempNum4), tempResult, 0);
		
		}
		for (int i=0; i<5; i++) {
			tempResult = Math.sinh(tempNum5);
			LOG.info("Calculating the hyperbolic sin of a value " + tempNum5 + " and the result is " + tempResult);
			assertEquals(ac.sinh(tempNum5), tempResult, 0);
		
		}
		for (int i=0; i<5; i++) {
			tempResult = Math.cosh(tempNum6);
			LOG.info("Calculating the hyperbolic cos of a value " + tempNum6 + " and the result is " + tempResult);
			assertEquals(ac.cosh(tempNum6), tempResult, 0);
		
		}
	}

}
