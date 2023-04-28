package org.stringexample;

public class StringEx {

	public static void main(String[] args) {

		String name="  Welcome ";
		int number=3;
		System.out.println(name);
		
		System.out.println(name.charAt(2));
		System.out.println(name.length());
		System.out.println(name.equals("wel"));
		System.out.println(name.equalsIgnoreCase("WELCOme"));
		System.out.println(name.isEmpty());
		System.out.println(name.contains("o"));
		System.out.println(name.substring(1));
		System.out.println(name.substring(0, 4));
		System.out.println(name.concat("to all"));
		System.out.println(name.replace("l", "L"));
	System.out.println(name.indexOf("l"));
	System.out.println(name.indexOf("e", 3));
	System.out.println(name.trim());
	System.out.println(name.valueOf(number));
	
	String uppercase="SENTHIL";
	System.out.println(uppercase.toLowerCase());
	
	String lowercase="senthil";
	System.out.println(lowercase.toUpperCase());
	System.out.println(name.join("-", "hi","welcome","to all"));
	System.out.println(name.join("/", "30","01","2023"));
	
	String splitThis="hi,welcome,to,all";
	String[] split = splitThis.split(",");
	for (String string : split) {
		System.out.print(string);
		
	}
	
	}
}