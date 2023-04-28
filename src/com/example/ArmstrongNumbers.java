package com.example;

public class ArmstrongNumbers {

	public static void main(String[] args) {

int num=153;

int temp=num;

int result=0;
while (num>0) {
	
int a=num%10;

result=result+(a*a*a);

num=num/10;
}

		if (temp==result) {


			System.out.println("The given number is armstrong");	
		}
			else
				
				System.out.println("given number is not armstrong");
		}
		
	}
