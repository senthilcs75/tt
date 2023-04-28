package com.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StringBasicLevel {

	public static void main(String[] args){

		String name="Senthil Kumar";

		char[] charArray = name.toCharArray();

		List<Character> list= new ArrayList<Character>();

		for (Character character : charArray) {
			list.add(character);	
		}
		Collections.reverse(list);
		ListIterator iterator = list.listIterator();

		while (iterator.hasNext()) {
			System.out.print(iterator.next());

		}
	}
}

/*	String name="Senthil Kumar";

		char[] array=	 name.toCharArray();
		String reversed="";

		for (int i =  array.length-1; i>=0; i--) {

			reversed=reversed+array[i];

		}
		System.out.println(reversed);

	}
}
 */
/*String name="Senthil Kumar";

		StringBuffer buffer =new StringBuffer();

		buffer.append(name);
		System.out.println(buffer.reverse());

		}
}	*/

//		//Reverse the string using split
//
//		String name="Senthil Kumar";
//
//
//		String[] split = name.split(" ");
//
//		for (int i =  split.length-1; i>=0; i--) {
//
//
//			System.out.println(split[i] + " ");
//
//		}

//		foreach (String split : split) {
//			for (int i = split.length()-1; i>=0; i--) {
//
//
//				char c = split.charAt(i);
//			}
//				reverse=reverse+c;
//
//			
//			reverse=reverse +" ";
//		}
//		System.out.println(reverse);




/*		//Reverse the String

	String name="Senthil";

	String reverse="";

	for (int i = name.length()-1; i>=0; i--) {

		char charAt = name.charAt(i);

		System.out.print(charAt);

	}
 */	






//String Buffer& Builder
/*System.out.println("String is Immutable");
		String name="Senthil";
		System.out.println("Original name is " + name.concat("kumar"));		
		System.out.println(name);


		System.out.println("Stringbuffer is Mutable");
		StringBuffer name1=new StringBuffer("Senthil");
		System.out.println("Original name is " + name1.append("kumar"));
		System.out.println(name1);


		System.out.println("Reverse the name " + name1.reverse());


		StringBuffer replace=new StringBuffer("Siva");
		System.out.println(replace.replace(0, 3, "rIYA"));

		StringBuffer delete=new StringBuffer("xyzsiva");
		System.out.println(delete.delete(0, 3));

StringBuffer insert=new StringBuffer("si");
System.out.println(insert.insert(2, "va"));
System.out.println(insert.capacity());
 */




//String Methods
/*		String name ="Senthil";
		int number=10;

		System.out.println(name .length());
		System.out.println(name.charAt(2));
		System.out.println(name.contains("S"));
		System.out.println(name.equals(name));
		System.out.println(name.equalsIgnoreCase("senthil"));
		System.out.println(name.endsWith("thil"));
		System.out.println(name.toLowerCase());

		System.out.println(name.toUpperCase());
		System.out.println(name.replace("thil", "THIL"));
		System.out.println(name.indexOf("l",2));
		System.out.println(name.isEmpty());
		System.out.println(name.concat("siva"));

		System.out.println(String.valueOf(number));
		System.out.println(name.substring(1,3));
 */	
