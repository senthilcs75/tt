package org.day1;


public class Practice {

	 int collectedAmt=1000;
	public int giveMe() {
		System.out.println("have collected the amt"+ collectedAmt);
		return collectedAmt;
	}

	public static void main(String[] args) {

		Practice amt=new Practice();
 
		int giveMe = amt.giveMe();

	System.out.println("got the amount of Rs"+giveMe);


	}}