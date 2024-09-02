package startagilepackage;

import java.util.Scanner;

public class ControlStatementDemo {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.println("enter your age :");
		int age = input.nextInt();
		//demo for dependent if statement
		if(age>=18)
		{

			System.out.println(" the user is eligible for voting");
		}
		if(age<18)
			System.out.println("not elegible");
		    System.out.println("indepenedent if statment ");
		    
		    if(age>90);// condition will not be checked the semicolon mean the statement is terminated 
		    System.out.println("check if statement with semicolon");

	}

}
