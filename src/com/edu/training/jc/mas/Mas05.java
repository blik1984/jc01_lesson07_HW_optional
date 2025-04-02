package com.edu.training.jc.mas;

import java.util.Random;

/**
 * Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из
 * четных чисел этой последовательности. Если таких чисел нет, то вывести
 * сообщение об этом факте.
 */

public class Mas05 {

	public static void main(String[] args) {

		int[] mas;
		int[] masEven;
		int counter = 0;
		Random rand = new Random();

		mas = new int[rand.nextInt(50)];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(1000);
		}
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0) {
				counter++;
			}
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + ", ");
		}
		if (counter == 0) {
			System.out.println("\nВ массиве отсутствуют чётные числа");
		} else if (counter == 1) {
			System.out.println("\nВ массиве присутствует 1 чётное число");
		} else if (counter > 0 && counter < 5) {
			System.out.println("\nВ массиве присутствует " + counter + " чётных числа");
		} else if (counter > 4 && counter < 21) {
			System.out.println("\nВ массиве присутствует " + counter + " чётных чисел");
		} else if (counter > 20) {
			int counter2 = counter % 10;
			if (counter2 == 1) {
				System.out.println("\nВ массиве присутствует " + counter + " чётное число");
			} else if (counter2 > 1 && counter2 < 5) {
				System.out.println("\nВ массиве присутствует " + counter + " чётных числа");
			} else if ((counter2 > 4 && counter2 < 10) || counter2 == 0) {
				System.out.println("\nВ массиве присутствует " + counter + " чётных чисел");
			}
		}

		masEven = new int[counter];
		for (int i = 0, j = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0) {
				masEven[j++] = mas[i];
			}
		}
		for (int i = 0; i < masEven.length; i++) {
			System.out.print(masEven[i] + ", ");
		}
	}
}
