package com.edu.training.jc.mas;

import java.util.Random;

/**
 * Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину
 * числовой оси, содержащую все эти числа.
 */

public class Mas06 {

	public static void main(String[] args) {
		int[] mas;
		int min;
		int max;
		int leng;
		Random rand = new Random();

		mas = new int[rand.nextInt(50)];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(1000);
		}
		min = mas[0];
		max = mas[0];
		
		for (int i = 1; i<mas.length;i++) {
			if (max<mas[i]) {
				max = mas[i];
			}
			if(min>mas[i]) {
				min = mas[i];
			}
		}
		leng = max - min;
		
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + ", ");
		}
		System.out.println("\nНачало оси - " + min + ", конец оси - " + max + ", длина оси - " + leng);

	}

}
