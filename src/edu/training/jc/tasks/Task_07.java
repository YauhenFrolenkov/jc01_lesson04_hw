package edu.training.jc.tasks;

public class Task_07 {

	public static void main(String[] args) {
		double x = -3.5;
		double y = 5;

		double arRes = (Math.pow(x, 2) + Math.pow(y, 2)) / 2;
		double geoRes = Math.sqrt(Math.abs(x) * Math.abs(y));

		System.out.println("Cреднее арифметическое квадратов = " + arRes);
		System.out.println("Cреднее геометрическое модулей = " + geoRes);

	}

}
