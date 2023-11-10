package org.lessons.java;

import java.util.Scanner;

public class snack5 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
		
	boolean isZero = false;
		while (isZero == false) {
			System.out.println("Scrivi un codice alfanumerico (può contenere anche simboli)");
			
			String input = in.nextLine();
			in.close();
			char[] inputArray = input.toCharArray();
			
			int lettersCount = 0;
			int simbolsCount = 0;
			int numbersCount = 0;
			for (int x=0; x< inputArray.length; x++) {
				if(inputArray[x] == '0') {
					numbersCount++;
					isZero = true; 
					break;
				}
				else if(Character.isDigit(inputArray[x])) {
					numbersCount++;
				}else if (Character.isLetter(inputArray[x])){
					lettersCount++;
				} else{
					simbolsCount++;
				}
				
			}
			System.out.println("Le lettere sono: " + lettersCount);
			System.out.println("I numeri sono: " + numbersCount);
			System.out.println("I simboli sono: " + simbolsCount);
		}
		
		
	
	


}
}
