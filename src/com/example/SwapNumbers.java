package com.example;

import java.util.Scanner;

public class SwapNumbers {

public static void main(String[] args) {
	
	// Swap2Numbers
	
	
	int a,b;
	
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("THe numbers are");
			a=scanner.nextInt();
			
			b=scanner.nextInt();
	a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.println("After swaping numbers are");
	
	System.out.println(a);System.out.println(b);
/*int a,b,c;

Scanner scanner=new Scanner(System.in);

System.out.println("The numbers are ");

a=scanner.nextInt();
b=scanner.nextInt();
c=a;
a=b;
b=c;
System.out.println("After Swapping");
System.out.println(a);System.out.println(b);

*/
}
}
	
	/*int a=10;
	int b=20;
	
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a);
	System.out.println(b);
		}}*/
			

//int a=10;
//int b=20;
// int c=a;
// 
// a=b;
// b=c;
// 
// System.out.println(a);
// System.out.println(b);
