package com.reverse;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args){

		int givenNumber=0;

		int reversedNumber=0;

		System.out.println("Enter Your Number: ");
		Scanner scanner =new Scanner(System.in);

		givenNumber=scanner.nextInt();

		while(givenNumber!=0){

			reversedNumber=reversedNumber*10;
			reversedNumber=reversedNumber+givenNumber%10;

			givenNumber=givenNumber/10;
		}
		System.out.println(reversedNumber);

	}
}