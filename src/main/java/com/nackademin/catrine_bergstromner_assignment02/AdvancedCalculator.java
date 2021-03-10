package com.nackademin.catrine_bergstromner_assignment02;
import java.lang.Math;

public class AdvancedCalculator extends BasicCalculator implements AdvancedOperations{

	@Override
	public double square(double num3) {
				return Math.sqrt(num3);
	}

	@Override
	public double powerOf(double base, double exp) {
				return Math.pow(base, exp);
	}

	@Override
	public double tan(double num4) {
				return Math.tan(num4);
	}

	@Override
	public double sinh(double num5) {
		return Math.sinh(num5);
	}

	@Override
	public double cosh(double num6) {
			return Math.cosh(num6);
	}
	

}
