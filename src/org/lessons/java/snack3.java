package org.lessons.java;

import java.util.Random;

public class snack3 {
public static void main(String[] args) {
	Random rdn = new Random();
	
//	Genero 10 numeri casuali e li stampo
	int[] numbers = new int[10];
	
	for (int x = 0; x < 10; x++) {
		numbers[x] = rdn.nextInt(100);
		System.out.println(numbers[x]);
	}
	
//	Giro sull'array e sommo solo i numeri in posizioni dispari
	int sum = 0;
	
	for (int x = 1; x <= numbers.length; x+=2) {
		sum += numbers[x];
	}
	
//	Stampo il risultato della sommma
	System.out.println("La somma dei numeri dispari è: " + sum);
}
}
