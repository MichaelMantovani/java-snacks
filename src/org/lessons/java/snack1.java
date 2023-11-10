package org.lessons.java;

import java.util.Scanner;

public class snack1 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Inserisci un numero?");
	int number = in.nextInt();
	if (number % 2 == 0) {
		System.out.println(number);
	}else {
		System.out.println(++number);
	}
}
}