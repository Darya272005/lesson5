package jc11_first_ide_app;

import java.util.Scanner;

public class Main26 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите три числа:");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();

		int min = Math.min(Math.min(n1, n2), n3);
		int max = Math.max(Math.max(n1, n2), n3);
		int sum = min + max;

		System.out.println("Сумма максимального и минимального чисел: " + sum);

		scanner.close();
	}
}
