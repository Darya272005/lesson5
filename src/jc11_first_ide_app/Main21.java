package jc11_first_ide_app;

import java.util.Scanner;

public class Main21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Кто ты: мальчик или девочка? Введи Д или М");
		String gender = scanner.next();

		if (gender.equals("Д")) {
			System.out.println("Мне нравятся девочки!");
		} else if (gender.equals("М")) {
			System.out.println("Мне нравятся мальчики!");
		} else {
			System.out.println("Некорректный ввод!");
		}

		scanner.close();
	}
}
