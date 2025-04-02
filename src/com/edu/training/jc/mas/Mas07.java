package com.edu.training.jc.mas;

import java.util.Random;

/**
 * Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее
 * члены, большие данного Z, этим числом. Подсчитать количество замен.
 */

public class Mas07 {

	public static void main(String[] args) {

		double[] mas;
		double n;
		int counter = 0;
		Random rand = new Random();

		mas = new double[rand.nextInt(100)];
		n = rand.nextDouble();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextDouble();
		}

		System.out.print("Исходный массив: ");

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + ", ");
		}
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > n) {
				mas[i] = n;
				counter++;
			}
		}
		
		System.out.println("\nКонстанта - " + n);
		System.out.println("Массив после замены: ");

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + ", ");
		}
		System.out.println("\nКоличество произведённых замен - " + counter);
	}

}
