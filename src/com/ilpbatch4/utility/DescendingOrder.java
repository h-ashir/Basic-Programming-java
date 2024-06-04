package com.ilpbatch4.utility;

public class DescendingOrder {

	public static void main(String[] args) {
		int input1 = 1;
		int input2 = 2;
		int input3 = 3;
		descending(input1, input2, input3);
	}

	private static void descending(int input1, int input2, int input3) {
		if (input1 > input2 && input1 > input3) {
			if (input2 > input3) {
				System.out.println(input1 + " " + input2 + " " + input3);
			} else {
				System.out.println(input1 + " " + input3 + " " + input2);
			}
		} else if (input2 > input1 && input2 > input3) {
			if (input1 > input3) {
				System.out.println(input2 + " " + input1 + " " + input3);
			} else {
				System.out.println(input2 + " " + input3 + " " + input1);

			}
		} else {
			if (input1 > input2) {
				System.out.println(input3 + " " + input1 + " " + input2);
			} else {
				System.out.println(input3 + " " + input2 + " " + input1);
			}
		}
	}
}