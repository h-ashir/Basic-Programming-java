package com.ilpbatch4.utility;

//the sum of the series 1-3+5-7+.............+n 
public class SumOfSeries {

	public static void main(String[] args) {
		int input = 4;
		series(input);
	}

	public static void series(int input) {
		int sum = 0;
		int odd = 1;
		for (int i = 1; i <= input; i++) {
			if (i % 2 != 0) {

				sum = sum + odd;
				odd = odd + 2;
			} else {

				sum = sum - odd;
				odd = odd + 2;
			}
		}
		System.out.println("Sum is :" + sum);
	}
}
