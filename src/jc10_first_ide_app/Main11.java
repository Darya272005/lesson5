package jc10_first_ide_app;

import java.math.BigInteger;

public class Main11 {
	public static void main(String[] args) {
		BigInteger dif = BigInteger.ZERO;

		for (int i = 1; i <= 200; i++) {
			BigInteger cube = BigInteger.valueOf(i).pow(3);
			if (i % 2 == 0) {
				dif = dif.subtract(cube);
			} else {
				dif = dif.add(cube);
			}
		}

		System.out.println("Разность кубов первых двухсот чисел: " + dif);
	}
}
