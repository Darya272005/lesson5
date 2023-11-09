package jc11_first_ide_app;

import java.util.Scanner;

public class Main23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите дату (число):");
        int day = scanner.nextInt();

        System.out.println("Введите месяц:");
        int month = scanner.nextInt();

        if (day >= 1 && day <= 31 && month >= 1 && month <= 12) {
            System.out.println("Введенная дата корректна");
        } else {
            System.out.println("Введенная дата некорректна");
        }

        scanner.close();
    }
}
