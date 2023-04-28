package com.reverse;
public class Even{

//String name="Senthil";
//
//long accNo=512345678945678l;

public Integer accBalance=500;

public Integer getAccBalance() {
	System.out.println("Account Balance is collected and sent to you "+ accBalance);
	return accBalance;
}
public static void main(String[] args) {
	Even account=new Even();
	
	Integer accBalance2 = account.getAccBalance();
	System.out.println("I have the received the amount "+accBalance2);
}

}
