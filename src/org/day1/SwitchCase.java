package org.day1;

public class SwitchCase {
	public static void main(String[] args) {
		
		String hero="ganesh";
		
		switch (hero) {
		case "surya":
			System.out.println("hero name is "+hero);
			break;
		case "ajith":
			System.out.println("hero name is "+hero);

			break;
			
		default:
			System.out.println("not able to find the hero name");
			break;
		}
	}

}
