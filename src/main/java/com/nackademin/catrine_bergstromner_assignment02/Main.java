package com.nackademin.catrine_bergstromner_assignment02;

public class Main {

	public static void main(String[] args) {
		BasicCalculator bc = new BasicCalculator();
		AdvancedCalculator ac = new AdvancedCalculator();
		System.out.println(bc.add(10, 2));
		System.out.println(bc.sub(4, 10));
		System.out.println(bc.mul(2, 10));
		System.out.println(bc.div(4, 10));
		System.out.println(ac.square(10));
		System.out.println(ac.powerOf(4, 10));
		System.out.println(ac.abs(-1000));
		System.out.println(ac.sin(10));
		System.out.println(ac.cos(10));
	}

}
