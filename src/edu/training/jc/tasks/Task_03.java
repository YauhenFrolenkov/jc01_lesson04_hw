package edu.training.jc.tasks;

public class Task_03 {

	public static void main(String[] args) {
		double x1 = 1;
		double y1 = 1;
		double x2 = 4;
		double y2 = 1;
		double x3 = 1;
		double y3 = 5;

		double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		double b = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
		double c = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));

		double gip = Math.max(Math.max(a, b), c);
		double cat1, cat2;

		if (gip == a) {
			cat1 = b;
			cat2 = c;
		} else if (gip == b) {
			cat1 = a;
			cat2 = c;
		} else {
			cat1 = a;
			cat2 = b;
		}

		System.out.println("Длина гипотенузы = " + gip);
		System.out.println("Длины катетов = " + cat1 + " и " + cat2);
		
		if (Math.pow(gip, 2) == Math.pow(cat1, 2) + Math.pow(cat2, 2)) {
			System.out.println("Треугольник прямоугольный");
		} else {
			System.out.println("Треугольник не прямоугольный");
		}

	}

}
