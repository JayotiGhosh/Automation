package ControlStatements;
 import java.util.Scanner;
 
public class IfStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int age=21;
		for (int i = 1; i<=6; i++) {
			
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your age");
		
		int age = in.nextInt();
		
		if (age<21) {
			System.out.println("Candidate" + " " + i + " is not elligible to vote");
			System.out.println(" ");
			
		}
		else if (age>=21) {
			System.out.println("Candidate" + " " + i + ": Yeah!! you can vote!");
			System.out.println(" ");
		}
	}

}
}

