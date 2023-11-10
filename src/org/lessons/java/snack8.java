package org.lessons.java;

import java.util.Scanner;

public class snack8 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Scrivi una parola che contenga almeno una a e una o");
	String word = in.nextLine();
	in.close();
	
	char[] letters = word.toCharArray();
	
	for (int x=0; x < letters.length; x++) {
		switch (letters[x]) {
		case 'a': {
			letters[x] = 'o';
			break;
		} case 'o': {
			letters[x] = 'a';
			break;
		} 
	}
}
	
	String finalWord = new String(letters);
	System.out.println(finalWord);
	
}}

