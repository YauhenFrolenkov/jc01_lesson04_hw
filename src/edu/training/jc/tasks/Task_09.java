package edu.training.jc.tasks;

public class Task_09 {

	public static void main(String[] args) {
		double a = 8;

		double S = Math.pow(a, 2);
		double d = a * Math.sqrt(2);
		double rIn = a / 2;
		double rOut = d / 2;

		System.out.println("Площадь квадрата = " + S);
		System.out.println("Диагональ квадрата = " + d);
		System.out.println("Радиус вписанной окружности = " + rIn);
		System.out.println("Радиус описанной окружности = " + rOut);

	}

}
