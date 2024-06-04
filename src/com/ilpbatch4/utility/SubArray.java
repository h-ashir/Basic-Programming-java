package com.ilpbatch4.utility;

public class SubArray {

	public static void main(String[] args) {
		int input = 10;
		subarray(input);
	}

	private static void subarray(int input) {
		int[] arr = { 4, 1, 2, 3, 2, 5, 7, 9, 12 };
		for (int i = 0; i < arr.length; i++) {
			int sum = arr[i];
			for (int j = i + 1; j <= arr.length; j++) {
				if (sum == input) {
					System.out.println("Subarray between index " + i + " and " + (j - 1));
					return;
				}
				if (sum > input || j == arr.length) {
					break;
				}
				sum += arr[j];
			}
		}
		System.out.println("No subarray found in " + input);
	}
}
