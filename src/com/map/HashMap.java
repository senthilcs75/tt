package com.map;


public class HashMap {

	public static void main(String[] args) {

		java.util.HashMap<Integer, String> sent=new java.util.HashMap<Integer,String>();

		sent.put(1, "Senthil");
		sent.put(2, "Siva");
		sent.put(3, "Sree");
		sent.put(4, "Hari");
		sent.put(5, "hello");
		System.out.println(sent);

		Object clone = sent.clone();
		System.out.println(clone);

		System.out.println(sent.containsKey(1));
		System.out.println(sent.containsValue("Siva"));
		System.out.println(sent.get(3));
		System.out.println(sent.isEmpty());
		System.out.println(sent.keySet());
		System.out.println(sent.values());

		System.out.println(sent.entrySet());
		java.util.HashMap<Integer, String> siv=new java.util.HashMap<Integer,String>();
		siv.putAll(sent);
		System.out.println(siv);


	}
}


