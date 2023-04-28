package com.example;

public class Fibonacci {

	public static void main(String[] args) {

		//Fibonacci series
		int a=1;

		int b=0;

		for (int i = 0; i <=10; i++) {
			int c=a+b;

			System.out.println(c);
			a=b;
			b=c;

		}

	}
}