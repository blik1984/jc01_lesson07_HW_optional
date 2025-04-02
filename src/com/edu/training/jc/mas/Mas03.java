package com.edu.training.jc.mas;

/**
 * Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число
 * встречается раньше - положительное или отрицательное.
 */

public class Mas03 {

	public static void main(String[] args) {

		int[] mas = new int[] {-1 };
		
		if (mas[0] < 0) {
			System.out.println("Раньше встречается отрицательное число");
		} else {
			System.out.println("Раньше встречается положительное число");
		}
	}

}
