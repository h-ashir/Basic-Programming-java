package com.ilpbatch4.utility;

public class PatternZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 4;
		printpattern(input);
	}

	private static void printpattern(int input) {
//		for (int i = 0; i < input; i++) {
//			for (int j = 0; j < input; j++) {
//				if (i == 0 || i == input - 1 || j == input - i - 1) {
//					System.out.print("0");
//				} else if ((j == i && i<input/2) || (j == input -1- i && i<input/2)) {
//
//					System.out.print("1");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
		for (int i = 1; i <= input; i++) {
			if (i == 1 || i == input) {
				for (int j = 1; j <= input; j++) {
					System.out.print(j%2!=0?"0":"1");
				}
 
			} else {
				for (int j = 1; j <= input - i; j++) {
					System.out.print(" ");
				}
				System.out.print(i%2!=0?"0":"1");
			}
			System.out.println("");
 
		}

	}

}
