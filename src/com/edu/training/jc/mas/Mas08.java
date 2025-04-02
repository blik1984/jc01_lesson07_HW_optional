package com.edu.training.jc.mas;

import java.util.Random;

/**
 * Дан массив действительных чисел, размерность которого N. Подсчитать, сколько
 * в нем отрицательных, положительных и нулевых элементов.
 */

public class Mas08 {

	public static void main(String[] args) {

		double[] mas;
		int counterNull = 0;
		int counterPositiv = 0;
		int counterNegativ = 0;
		Random rand = new Random();

		mas = new double[rand.nextInt(100)];

		for (int i = 0; i < mas.length; i++) {
			int flag = rand.nextInt(2);
			if (flag > 0) {
				mas[i] = -1 * rand.nextDouble();
			} else {
				mas[i] = rand.nextDouble();
			}
		}
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > 0) {
				counterPositiv++;
			} else if (mas[i] < 0) {
				counterNegativ++;
			} else {
				counterNull++;
			}
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("%.3f", mas[i]);
			System.out.printf(", ");
		}
		System.out.println("\nОбщее количество элементов - " + mas.length);
		System.out.println("Количество положительных элементов - " + counterPositiv);
		System.out.println("Количество отрицательных элементов - " + counterNegativ);
		System.out.println("Количество нулевых элементов - " + counterNull); // массив случайный и попасть в ноль как-то
																				// не получается.

	}

}
