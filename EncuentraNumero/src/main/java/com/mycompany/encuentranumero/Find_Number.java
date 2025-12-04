package com.mycompany.encuentranumero;

import java.util.*;

public class Find_Number {
	public static void main(String[] args) {
		int randNo, inputNo, userAttempt = 1;
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		randNo = rand.nextInt(101);
		System.out.println("Adivina un numero entre 1 y 100\n");
		do {
			inputNo = scan.nextInt();
			if (inputNo > randNo) {
				System.out.println("Menor!!");
			}
			if (inputNo < randNo) {
				System.out.println("mayor!!");
			}
			if (inputNo == randNo) {
				System.out.println("Correcto!!");
				System.out.println("Lo adivinaste en " + userAttempt + "  intentos.");
			}
			userAttempt++;
		} while (inputNo != randNo);
	}
}
