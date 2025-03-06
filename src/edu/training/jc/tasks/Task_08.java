package edu.training.jc.tasks;

public class Task_08 {

	public static void main(String[] args) {
		double a = 6.5;
		double h = 25.7;

		double P = 6 * a;
		double S = (3 * Math.sqrt(3) / 2) * Math.pow(a, 2);
		double V = S * h;

		System.out.println("Периметр правильного шестигранника = " + P);
		System.out.println("Площадь правильного шестигранника = " + S);
		System.out.println("Объём правильной призмы = " + V);

	}

}
