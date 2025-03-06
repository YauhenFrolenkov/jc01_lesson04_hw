package edu.training.jc.tasks;

public class Task_06 {

	public static void main(String[] args) {
		int x = 1234;
		int xSave = x;
		int res = 0;

		while (x > 0) {
			res += x % 10;
			x /= 10;
		}

		System.out.println("Сумма цифр четырехзначного числа " + xSave + " = " + res);
	}

}
