package org.collections;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListEx {

	public static void main(String[] args) {


		ArrayList<String>  al=new ArrayList<String>();

		al.add("Siva");
		al.add("Hari");
		al.add("Sree");
		al.add("kani");
		System.out.println(al);
		System.out.println(al.isEmpty());

		al.add(null);

		System.out.println(al);

		System.out.println(al.get(1));

		al.set(2, "happy");
		System.out.println(al);

		System.out.println(al.indexOf("Siva"));

		System.out.println(al.lastIndexOf("kani"));


		System.out.println("------------");
		ArrayList<String> list=new ArrayList<String>();

		list.addAll(al);
		System.out.println(list);

		list.clear();
		System.out.println(list);

		al.remove(4); 
		System.out.println(al );

		for (String string : al) {

			System.out.println(string);
		}
		for (int i = 0; i <al.size(); i++) {

			System.out.println(al.get(i));

		}

		System.out.println("-------------");
		ListIterator<String> iterator=al.listIterator();
	
		while (iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}
			
			while (iterator.hasPrevious()) {
				System.out.println(iterator.previous());
			}
		}
	}



