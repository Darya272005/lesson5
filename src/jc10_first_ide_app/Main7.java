package jc10_first_ide_app;

import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите начало отрезка a:");
		double a = scanner.nextDouble();

		System.out.println("Введите конец отрезка b:");
		double b = scanner.nextDouble();

		System.out.println("Введите шаг h:");
		double h = scanner.nextDouble();

		for (double x = a; x <= b; x += h) {
			double y;

			if (x > 2) {
				y = x;
			} else {
				y = -x;
			}

			System.out.println("x = " + x + "; y = " + y);
		}
	}

}
