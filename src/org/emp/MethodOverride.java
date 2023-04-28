package org.emp;

public class MethodOverride extends MethodOverload{
	@Override
	public void empid() {
		System.out.println("the emp id is : 54");
	}
	@Override
	public void empEmail() {
		System.out.println("the email id is : 123@gmail.com");
	}
	public static void main(String[] args) {
		MethodOverride ride=new MethodOverride();
		ride.empid();
		ride.empEmail();
		ride.empName();

	}

}
