package edu.training.jc.tasks;

public class Task_04 {

	public static void main(String[] args) {
		double R = 14.5;
		double a = 60.0;
		
		if (R <= 0 || a < 0 || a > 360) {
			System.out.println("Введены некорректные значения");
		}
		
		double L = 2 * Math.PI * R * (a / 360);

		double S = Math.PI * Math.pow(R, 2) * (a / 360);

		System.out.println("Длина дуги = " + L);
		System.out.println("Площадь сектора = " + S);

	}

}
