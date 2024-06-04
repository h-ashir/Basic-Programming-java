package com.ilpbatch4.utility;

public class PatternDiamond {

	public static void main(String[] args) {
		int input = 4;
		printpattern(input);

	}

	private static void printpattern(int input) {
		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= input - i; j++) {
				System.out.print("  ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k + " ");
			}
			for (int k = 2; k <= i; k++) {
				System.out.print(k + " ");
			}
			System.out.println("");

		}
		for (int i = input - 1; i >= 1; i--) {
			for (int j = input - i; j >= 1; j--) {
				System.out.print("  ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k + " ");
			}
			for (int k = 2; k <= i; k++) {
				System.out.print(k + " ");
			}
			System.out.println("");
		}

	}

}
