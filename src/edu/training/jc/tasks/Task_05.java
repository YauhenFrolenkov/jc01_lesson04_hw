package edu.training.jc.tasks;

public class Task_05 {

	public static void main(String[] args) {
		double e = Math.E;

		for (int i = 1; i <= 4; i++) {
			double res = Math.pow(e, i);
			System.out.println(i + " степень числа е (экспоненты) = " + res);
		}

	}

}
