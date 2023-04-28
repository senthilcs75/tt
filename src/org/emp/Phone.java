package org.emp;

public class Phone {

	private void phoneInfo(int phoneID) {

		System.out.println("Phone Id is"+phoneID);
	}
	private void phoneInfo(String phoneName	) {
		System.out.println("Phone Name is"+phoneName);
	}
	private void phoneInfo(long phoneIMEINo) {
		System.out.println("Phone IMEI no is"+phoneIMEINo);
	}
	public static void main(String[] args) {
Phone phone=new Phone();

phone.phoneInfo(2345);
phone.phoneInfo("APple");
phone.phoneInfo(23457545622l);
	}

}
