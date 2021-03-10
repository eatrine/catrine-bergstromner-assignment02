package com.nackademin.catrine_bergstromner_assignment02;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;


public class MyBasicCalcTest {
	BasicCalculator bc = new BasicCalculator();
	//Random rand = new Random ();
	public static final Logger LOG = Logger.getLogger(BasicCalculator.class.getName());
	
	@Test
	public void testCalc() {
		double max = 30.0;
		double min = -10.0;
		double tempNum1 = 0.0;
		double tempNum2 = 0.0;
		double tempResult = 0.0;
		
		for (int i=0; i<10; i++) {
			tempNum1 = (Math.random() * (max - min)+ min);
			tempNum2 = (Math.random() * (max - min)+ min);
			tempResult = tempNum1 + tempNum2;
			LOG.info("Testing addition with the values " + tempNum1 + " and " + tempNum2 + " and the result is " + tempResult);
			assertEquals(bc.add(tempNum1, tempNum2), tempResult, 0);
		}
		for (int i=0; i<10; i++) {
			tempNum1 = (Math.random() * (max - min)+ min);
			tempNum2 = (Math.random() * (max - min)+ min);
			tempResult = tempNum1 - tempNum2;
			LOG.info("Testing subtraction with the values " + tempNum1 + " and " + tempNum2 + " and the result is " + tempResult);
			assertEquals(bc.sub(tempNum1, tempNum2), tempResult, 0);
		}
		for (int i=0; i<10; i++) {
			tempNum1 = (Math.random() * (max - min)+ min);
			tempNum2 = (Math.random() * (max - min)+ min);
			tempResult = tempNum1 * tempNum2;
			LOG.info("Testing multiplication with the values " + tempNum1 +  " and " + tempNum2 + " and the result is " + tempResult);
			assertEquals(bc.mul(tempNum1, tempNum2), tempResult, 0);
		}
		for (int i=0; i<10; i++) {
			tempNum1 = (Math.random() * (max - min)+ min);
			tempNum2 = (Math.random() * (max - min)+ min);
			tempResult = tempNum1 / tempNum2;
			LOG.info("Testing division with the values " + tempNum1 +  " and "  + tempNum2 + " and the result is " + tempResult);
			assertEquals(bc.div(tempNum1, tempNum2), tempResult, 0);
		}
	}
	

}

	
