package com.ilpbatch4.utility;

public class DuplicatesInArray {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1, 10, 12, 10, 11 };
		duplicates(array);

	}

	public static void duplicates(int[] array) {
		System.out.println("Duplicates in the array:");

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					System.out.print(array[i] + " ");
				}
			}
		}
	}

}
