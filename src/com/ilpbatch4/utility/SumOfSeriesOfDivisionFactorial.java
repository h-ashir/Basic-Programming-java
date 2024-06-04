package com.ilpbatch4.utility;

//
public class SumOfSeriesOfDivisionFactorial {

	public static void main(String[] args) {
		int input = 5;
		factorialnumber(input);
	}

	private static void factorialnumber(int input) {

		float sum = 0;
		for (float i = 1; i <= input; i++) {
			sum = sum + i / factorial(i);
		}
		System.out.println(sum);
	}

	private static int factorial(float i2) {

		int factorial = 1;
		for (int i = 1; i <= i2; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

}
