package org.lessons.java;

import java.util.Scanner;

public class snack6 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Dammi un numero");
		String digit = in.nextLine();
		in.close();
		
		int result = 0;
		
		for	(int x = 0; x < digit.length(); x++) {
			char carattere = digit.charAt(x);
			if (carattere >= '0' && carattere <= '9' && digit.charAt(0) == '-') {
				int numero = carattere - '0';
				result = result * 10 - numero;
			} else if (carattere >= '0' && carattere <= '9') {
				int numero = carattere - '0';
				result = result * 10 + numero;
			}
		}
		
		System.out.println("Hai scelto il numero: "+ result);
		
	}

}