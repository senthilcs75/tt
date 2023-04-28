package com.map;


public class LinkedHashMap {

	public static void main(String[] args) {

		java.util.LinkedHashMap<Integer,String> sent=new java.util.LinkedHashMap<>();

		sent.put(1, "Senthil");

		sent.put(2, "Siv");

		sent.put(3, "Ganesh");

		sent.put(5, "muruga");
		
		System.out.println(sent);
	}
}
