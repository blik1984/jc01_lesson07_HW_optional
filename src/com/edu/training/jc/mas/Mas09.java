package com.edu.training.jc.mas;

import java.util.Random;

/**
 * Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и
 * наименьший элементы.
 */

public class Mas09 {

	public static void main(String[] args) {

		double[] mas = createRandomDoubleArray();
		viewDoubleArray(mas);
		int[] minMax = findIndexMinMax(mas);
		exchangeTwoElements(mas, minMax);
		viewDoubleArray(mas);

	}

	public static double[] createRandomDoubleArray() {
		double[] mas;
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
		return mas;
	}

	public static int[] findIndexMinMax(double mas[]) {
		int[] minMax = new int[2];
		double min = mas[0];
		double max = mas[0];
		int minIndex = 0;
		int maxIndex = 0;
		for (int i = 1; i < mas.length; i++) {
			if (mas[i] > max) {
				max = mas[i];
				maxIndex = i;
			}
			if (mas[i] < min) {
				min = mas[i];
				minIndex = i;
			}
		}
		minMax[0] = minIndex;
		minMax[1] = maxIndex;
		return minMax;
	}

	public static void exchangeTwoElements(double[] mas, int[] minMax) {

		double prom;
		prom = mas[minMax[0]];
		mas[minMax[0]] = mas[minMax[1]];
		mas[minMax[1]] = prom;

	}

	public static void viewDoubleArray(double[] mas) {

		for (int i = 0; i < mas.length; i++) {
			System.out.printf("%.3f", mas[i]);
			System.out.printf(", ");
		}
		System.out.printf("\n ");

	}

}
