package jc10_first_ide_app;

import java.util.Scanner;

public class Main17 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите действительное число a:");
		double a = scanner.nextDouble();

		System.out.println("Введите натуральное число n:");
		int n = scanner.nextInt();

		double product = 1.0;
		for (int i = 0; i < n; i++) {
			product *= (a + i);
		}

		System.out.println("Произведение арифметической последовательности: " + product);
	}
}
