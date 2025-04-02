package com.edu.training.jc.mas;

import java.util.Random;

/**
 * Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых остаток
 * от деления на М равен L (0 < L < М-1).
 */

public class Mas11 {

	public static void main(String[] args) {

		int[] mas = createRandomPositiveIntArray();
		viewIntArray(mas);
		double m = 6;
		specialViewIntArray(mas, m);
	}

	public static int[] createRandomPositiveIntArray() {
		int[] mas;
		Random rand = new Random();
		mas = new int[rand.nextInt(100)];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(2 * mas.length);
		}
		return mas;
	}

	public static void viewIntArray(int[] mas) {

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i]);
			System.out.print(", ");
		}
		System.out.printf("\n ");

	}

	public static void specialViewIntArray(int[] mas, double m) {

		for (int i = 0; i < mas.length; i++) {
			int prom = (int)(mas[i]%m);
	//		System.out.print(prom);

			if (prom > 0 && prom < (mas[i] - 1)) {
				System.out.print(mas[i] + ", остаток - " + prom);
				System.out.print("; ");
			}
		}
		System.out.printf("\n ");

	}

}


