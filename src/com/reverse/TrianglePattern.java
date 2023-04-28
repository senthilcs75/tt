package com.reverse;

import java.util.Scanner;

import org.day1.ForLoop;

public class TrianglePattern {
	public static void main(String[] args) {


Scanner scan=new Scanner(System.in);

System.out.println("Enter the number is ");

int startNumber=1;

int limit;

limit=scan.nextInt();

int row,column;
for (int i = 0; i <limit; i++) {
	for (int j = 0; j <=i; j++) {
		System.out.print(startNumber+" ");
		startNumber=startNumber+1;
		
	}
	System.out.println();
}

		/*	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number of lines");

	int nextInt = scan.nextInt();

	int row,column=0;

	for (int i = 1; i <nextInt; i++) {

		for (int j = 5; j >=i; j--) {
			System.out.print("*");

		}		
		System.out.println();
		 */
	}
}
