package com.nackademin.catrine_bergstromner_assignment02;

public class Main {

	public static void main(String[] args) {
		BasicCalculator bc = new BasicCalculator();
		AdvancedCalculator ac = new AdvancedCalculator();
		System.out.println(bc.add(11, 2));
		System.out.println(bc.sub(5, 10));
		System.out.println(bc.mul(3, 10));
		System.out.println(bc.div(4, 10));
		System.out.println(ac.square(11));
		System.out.println(ac.powerOf(5, 10));
		System.out.println(ac.tan(11));
		System.out.println(ac.sinh(11));
		System.out.println(ac.cosh(11));
	}

}
