package com.ilpbatch4.utility;

import java.lang.Math;

//5 sum of the series 1(1)-3(2)+5(3)-............
public class SumOfSeriesOfOddWithPower {

	public static void main(String[] args) {
		int input = 3;
		sumseries(input);

	}

	private static void sumseries(int input) {
		int sum = 0;
		int sign = 1;
		for (int i = 1; i <= input; i++) {
			int term = (int) Math.pow(2 * i - 1, i);
			sum = sum + sign * term;
			sign *= -1;
		}
		System.out.print("Sum of series: " + sum);
	}

}
