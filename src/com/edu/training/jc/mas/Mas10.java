package com.edu.training.jc.mas;

import java.util.Random;

/**
 * Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для
 * которых аi > i.
 */

public class Mas10 {

	public static void main(String[] args) {

		int[] mas = createRandomIntArray();
		viewIntArray(mas);
		specialViewIntArray(mas);
	}

	public static int[] createRandomIntArray() {
		int[] mas;
		Random rand = new Random();
		mas = new int[rand.nextInt(100)];

		for (int i = 0; i < mas.length; i++) {
			int flag = rand.nextInt(2);
			if (flag > 0) {
				mas[i] = -1 * rand.nextInt(mas.length);
			} else {
				mas[i] = rand.nextInt(mas.length);
			}
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

	public static void specialViewIntArray(int[] mas) {

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > i) {
				System.out.print(mas[i]);
				System.out.print(", ");
			}
		}
		System.out.printf("\n ");

	}

}
