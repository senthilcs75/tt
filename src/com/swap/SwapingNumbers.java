package com.swap;

public class SwapingNumbers {
	public static void main(String[] args) {




		int MySalary=1000;
		int UrSalary=3000;

		System.out.println("before Swapping "  + MySalary + "before Swapping"

				+ UrSalary);

		MySalary=MySalary-UrSalary;

		UrSalary=MySalary+UrSalary;
		MySalary=UrSalary-MySalary;




		//	int temp=MySalary;
		//	
		//	MySalary=UrSalary;
		//	
		//	UrSalary=temp;
		System.out.println("after Swapping "  + MySalary + "After Swapping" 

			+ UrSalary);

	}

}

