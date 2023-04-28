package com.string;


public class StringBasic {
	public static void main(String[] args) {

		String s1 ="Senthil";

		
		char[] charArray = s1.toCharArray();

		String reversed="";
		for (int i=charArray.length-1; i >=0; i--) {
			reversed=reversed+charArray[i];

			System.out.println(reversed);

		}

		StringBuilder s2=new StringBuilder(s1);
		StringBuilder reverse2 = s2.reverse();
		reverse2.toString();
		System.out.println(reverse2);

		StringBuffer st=new StringBuffer();
		StringBuffer append = st.append(s1);
		append.reverse();
		System.out.println(append);





		//Print the Char
		char ch = s1.charAt(2);	
		System.out.println(ch);
		// Print the Equals
		boolean equals = s1.equals("Senthil");
		System.out.println(equals);

		boolean equals2 = s1.equals("senthil");
		System.out.println(equals2);

		boolean equalsIgnoreCase = s1.equalsIgnoreCase("senthil");
		System.out.println(equalsIgnoreCase);

		boolean contains = s1.contains("Senthil");
		System.out.println("Char is present in the element " + contains);

		int length = s1.length();
		System.out.println(length);

		String replace = s1.replace("thil", "THIL");
		System.out.println(replace);

		String substring = s1.substring(1,4);
		System.out.println(substring);

		StringBuilder string =new StringBuilder(s1);

		StringBuilder reverse = string.reverse();

		String string2 = reverse.toString();
		System.out.println(string2);


		StringBuilder s3=new StringBuilder(s1);

		StringBuilder string6=s3.reverse();

		String string3 = string6.toString();
		System.out.println(string3);


		String rever="";

		for (int i=s1.length()-1;i>= 0; i--) {

			rever=rever+s1.charAt(i);
			System.out.println(rever);

		}





	}	
}


