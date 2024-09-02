package startagilepackage;

import java.util.Scanner;

public class IfElseIfDemo {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("ENTER YOUR AGE :");
		int age= input.nextInt();
		if(age>=18)
		{
			System.out.println("CONGRATS you are eleigible for driving license");
		}
		else if(age>=15 && age<18)
		{
			System.out.println("CONGRATS you are eleigible for learner license");
		}
		else
		{
			System.out.println("SORRY you are not eligible for any license");
		}
	}

}
