package jc11_first_ide_app;

import java.util.Scanner;

public class Main25 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите температуру в помещении (в градусах Цельсия):");
		int temperature = scanner.nextInt();

		if (temperature > 60) {
			System.out.println("Пожароопасная ситуация!");
		}

		scanner.close();
	}
}
