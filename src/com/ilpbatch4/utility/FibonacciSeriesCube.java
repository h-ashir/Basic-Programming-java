package com.ilpbatch4.utility;

//import java.lang.Math;

public class FibonacciSeriesCube {

	public static void main(String[] args) {
		int input = 5;
		fibonacciSeries(input);

	}

	private static void fibonacciSeries(int input) {
		double a = 1;
		double b = 2;
//		System.out.print(a + " " + b + " ");
		double sum = 9;
		for (int i = 0; i < (input - 2); i++) {
			double c = a + b;
			a = b;
			b = c;
			double cube = (c * c * c);
			sum = sum + cube;
//			sum = Math.pow(c, 3);
//			sum = Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3);
//			System.out.print(c + " ");
		}
		System.out.println("Sum: " + sum);
	}

}
