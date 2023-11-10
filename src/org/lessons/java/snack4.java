package org.lessons.java;

import java.util.Scanner;

public class snack4 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
//	Chiedo una parola all'utente
	System.out.println("Dammi una parola?");
	String word = in.nextLine();
	
	in.close();
	
//	Creo un array con le lettere della parola scelta
	char[] wordArray = word.toCharArray();
	
//	Genero la parola al contrario
	String reverseWord = "";
	for (int x=wordArray.length -1; x >= 0 ; x--) {
		
		reverseWord += wordArray[x];
	}
	
	
//	Controllo se la parola è palindroma
	if(word.equalsIgnoreCase(reverseWord)) {
		System.out.println("La parola scelta è palindroma");
	} else {
		System.out.println("La parola scelta non è palindroma");
	}
}
}
