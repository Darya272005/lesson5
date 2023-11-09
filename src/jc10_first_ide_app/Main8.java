package jc10_first_ide_app;

import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите начало отрезка a:");
		double a = scanner.nextDouble();

		System.out.println("Введите конец отрезка b:");
		double b = scanner.nextDouble();

		System.out.println("Введите шаг h:");
		double h = scanner.nextDouble();

		System.out.println("Введите значение c:");
		double c = scanner.nextDouble();

		for (double x = a; x <= b; x += h) {
			double y;

			if (x == 15) {
				y = (x + c) * 2;
			} else {
				y = (x - c) + 6;
			}

			System.out.println("x = " + x + "; y = " + y);
		}
	}

}
