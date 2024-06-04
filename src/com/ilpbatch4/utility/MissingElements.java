package com.ilpbatch4.utility;

public class MissingElements {

	public static void main(String[] args) {

		int array[] = { 2, 3, 4, 7, 9 };
		int limit = 10;
		missingelements(array, limit);
	}

	public static void missingelements(int array[], int limit) {

		System.out.print("Missing elements within limit " + limit + ": ");
		for (int i = 1; i <= limit; i++) {
			boolean found = false;
			for (int j = 0; j <= array.length - 1; j++) {
				if (i == array[j]) {
					found = true;
					break;
				}
			}
//			if (found) {
//				System.out.print(i + " ");
//			}
			if (!found) {
				System.out.print(i + " ");
			}

		}
	}

}
