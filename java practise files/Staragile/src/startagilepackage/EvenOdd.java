package startagilepackage;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("enter the number");
		int number=input.nextInt();
		if(number%2==0)
		{
			System.out.println("Number is EVEN ");
		}
		else
		{
			System.out.println("Number is ODD");
		}

		
		

	}

}
