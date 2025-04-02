package com.edu.training.jc.mas;

import java.util.Random;

/**
 * Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет
 * ли она возрастающей.
 */

public class Mas04 {

	public static void main(String[] args) {

		double[] mas = new double[3]; // взяли небольшой размер, т.к. случайно сгенерировать длинную возрастающую
										// последовательность очень долго
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextDouble();
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.println(mas[i]);
		}
		for (int i = 0; i < mas.length - 1; i++) {
			if (mas[i] > mas[i + 1]) {
				System.out.println("Последовательность не является возрастающей");
				return;
			}
		}
		System.out.println("Последовательность является возрастающей");
	}
}
