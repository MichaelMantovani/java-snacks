package org.lessons.java;

import java.util.Random;

public class snack2 {
public static void main(String[] args) {
	Random rdn = new Random();
	String[] nomi = {"Mario", "Luigi", "Giovanna", "Anna", "Carlo", "Maria", "Luca", "Giuseppe", "Elena", "Francesca"};
	String[] cognomi = {"Rossi", "Bianchi", "Verdi", "Russo", "Ferrari", "Esposito", "Romano", "Gallo", "Conti", "Marino"};
	String[] invitati = new String [10];
	System.out.println("Lista degli invitati: ");
	for (int x = 0; x < invitati.length; x++) {
		int rdnNumber = rdn.nextInt(10);
		invitati[x] = nomi[rdnNumber] + " " + cognomi[rdnNumber];
		System.out.println(invitati[x]);
	}
}
}
