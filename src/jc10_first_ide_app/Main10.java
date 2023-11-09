package jc10_first_ide_app;

import java.math.BigInteger;

public class Main10 {
	public static void main(String[] args) {
		BigInteger product = BigInteger.ONE;

		for (int i = 1; i <= 200; i++) {
			BigInteger square = BigInteger.valueOf(i).pow(2);
			product = product.multiply(square);
		}
		System.out.println("Произведение квадратов первых двухсот чисел:" + product);
	}
}
