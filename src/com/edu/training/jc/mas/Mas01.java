package com.edu.training.jc.mas;

import java.util.Random;

/**
 * В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые
 * кратны данному К.
 */

public class Mas01 {

	public static void main(String[] args) {
		
		int k;
		int[] mas;
		int sum = 0;
		
		Random rand = new Random();
		k = rand.nextInt(10);
		mas = new int[rand.nextInt(100)];
		
		for (int i = 0; i < mas.length; i++) {	
			mas[i] = rand.nextInt(1000);
		}
		
		for (int m = 0; m < mas.length; m++) {	
			if (mas[m] % k == 0) {
				sum = sum + mas[m];
			}
		}
		System.out.println("Создали массив из " + mas.length + " элементов. Делитель - " + k
				+ ". В массив входят следующие числа: ");
		for (int l = 0; l < mas.length; l++) {
			System.out.print(mas[l] + ", ");
		}

		System.out.println("\nСумма элементов нацело делящихся на делитель = " + sum);
	}

}
