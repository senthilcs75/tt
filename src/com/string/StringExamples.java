package com.string;

import org.day1.ForLoop;

public class StringExamples {

	public static void main(String[] args) {
		
		
	}}
		//To get the Unique Values

		/*String name="SenthilKumar";

		String output="";

		for (int i = 0; i < name.length(); i++) {

			char charAt = name.charAt(i);

			if (output.indexOf(charAt)==-1) {
				output=output+charAt;

			}}
		System.out.println(output);
	}

}*/

/*


		// TO get the total in given number

		String name="ja45gag54gaga3ga";

		String temp="0";

		int sum=0;

		for (int i = 0; i < name.length(); i++) {
			char charAt = name.charAt(i);

			if (Character.isDigit(charAt)) {

				temp=temp+charAt;
			}else {

				int parseInt = Integer.parseInt(temp);

				sum=sum+parseInt;

				temp="0";
			}
		}
		int parseInt = Integer.parseInt(temp);
		sum=sum+parseInt;
		System.out.println(sum);
	}

}

 */
//To get the total in each number
/*	public static void main(String[] args) {

		String name="ja45gag54gaga3ga";

		int sum=0;

		for (int i = 0; i < name.length(); i++) {
			char charAt = name.charAt(i);

			if (Character.isDigit(charAt)) {
				int numericValue = Character.getNumericValue(charAt);

				sum=sum+numericValue;
			}
		}
		System.out.println(sum);
	}
 */
