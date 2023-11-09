package jc10_first_ide_app;

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите положительное число:");
		int number = scanner.nextInt();

		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i;
		}

		System.out.println("Сумма чисел от 1 до " + number + ":" + sum);
	}

}
