package com.reverse;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {

		int givenNumber=0;
		int reverseNumber=0;

		System.out.println("Enter your number");
		Scanner scan=new Scanner(System.in);
		givenNumber= scan.nextInt();

		while(givenNumber!=0) {

reverseNumber=reverseNumber*10;
reverseNumber=reverseNumber+givenNumber%10;
givenNumber=givenNumber/10;

	}
		System.out.println(reverseNumber);
	}
}
