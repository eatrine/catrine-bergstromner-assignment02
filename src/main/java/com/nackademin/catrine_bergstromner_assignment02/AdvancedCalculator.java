package com.nackademin.catrine_bergstromner_assignment02;
import java.lang.Math;

public class AdvancedCalculator implements AdvancedOperations{

	@Override
	public double square(double num3) {
				return Math.sqrt(num3);
	}

	@Override
	public double powerOf(double base, double exp) {
				return Math.pow(base, exp);
	}

	@Override
	public double abs(double num4) {
				return Math.abs(num4);
	}

	@Override
	public double sin(double num5) {
		return Math.sinh(num5);
	}

	@Override
	public double cos(double num6) {
			return Math.cosh(num6);
	}
	

}
