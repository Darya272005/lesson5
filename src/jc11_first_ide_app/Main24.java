package jc11_first_ide_app;

import java.util.Scanner;

public class Main24 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите количество лепестков:");
		int petalCount = scanner.nextInt();

		if (petalCount % 2 == 0) {
			System.out.println("Не любит");
		} else {
			System.out.println("Любит");
		}

		scanner.close();
	}
}
