package com.ilpbatch4.utility;

//an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.
public class SumOfPairs {

	public static void main(String[] args) {
		int array[] = { 2, 3, 4, 8, 1, 7, 9 };
		int key = 2;
		pair(array, key);

	}

	private static void pair(int[] array, int key) {
		for (int i = 0; i < array.length - 1; i++) {

			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] == key) {
					System.out.println("Pairs: (" + array[i] + "," + array[j] + ")");
				}
//				else {
//					System.out.println("No Pairs found");
//				}

			}
		}

	}

}
