package com.constructor;

import javax.rmi.CORBA.StubDelegate;

public class DefaultConstructor {

String Student_name;
int Roll_Num;

public static void main(String[] args) {
	
	DefaultConstructor constructor=new DefaultConstructor();
	
	String student_name2 = constructor.Student_name;
	System.out.println(student_name2);

	int roll_Num2 = constructor.Roll_Num;
	System.out.println(roll_Num2);
//	
//System.out.println(constructor.Student_name);	
//System.out.println(constructor.Roll_Num);
//	
}

}