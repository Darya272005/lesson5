package jc10_first_ide_app;

import java.util.Scanner;

public class Main14 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите натуральное число:");
		int n = scanner.nextInt();

		double sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += 1.0 / i;
		}

		System.out.println("Сумма гармонического ряда: " + sum);
	}

}
