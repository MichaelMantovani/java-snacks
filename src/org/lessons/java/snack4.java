package org.lessons.java;

import java.util.Scanner;

public class snack4 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.println("Dammi una parola?");
	String word = in.nextLine();
	
	char[] wordArray = word.toCharArray();
	
	String reverseWord = "";
	
	for (int x=wordArray.length -1; x >= 0 ; x--) {
		
		reverseWord += wordArray[x];
	}
	
	
	if(word.equalsIgnoreCase(reverseWord)) {
		System.out.println("La parola scelta è palindroma");
	} else {
		System.out.println("La parola scelta non è palindroma");
	}
}
}
