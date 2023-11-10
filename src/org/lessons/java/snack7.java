package org.lessons.java;

import java.util.Scanner;

public class snack7 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Dammi un numero");
	int second = in.nextInt();
	in.close();
	
	int hours = second / 3600;
	
	int minutes = (second % 3600) / 60;
	
	int seconds = second % 60; 
	
	System.out.println(hours + ":" + minutes + ":" + seconds);
}
}
