package com.ilpbatch4.utility;

public class PatternAlphaNumber {

	public static void main(String[] args) {
		int input = 5;
		printNumberAlpha(input);

	}

	private static void printNumberAlpha(int input) {

		for (int i = 0; i < input; i++) {
			char alpha = 'A';
			char alphasmall = 'a';
			int number = 1;

			for (int j = input - i; j > 1; j--) {
				System.out.print("  ");	
			}

			for (int j = 0; j <= i; j++) {
				if (j % 2 != 0) {
					System.out.print(alpha + " ");
				} else {
					System.out.print(alphasmall + " ");
				}
				alphasmall = (char) (alphasmall + 1);
				alpha = (char) (alpha + 1);
			}

			for (int j = 0; j <= i; j++) {
				System.out.print(number + " ");
				number++;
			}
			System.out.println();
		}
	}

}
