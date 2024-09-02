package stringdemo;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		//To accept user input
		Scanner sc= new Scanner(System.in);
		
		//Store user string out into variable
		String name=sc.nextLine();
		
		System.out.println("Print Reverse String without reverse method");
		//Reverse String without reverse method
		for(int i=name.length()-1;i>=0;i--)
		{
			System.out.print(name.charAt(i));
		}
		
		System.out.println("Print Reverse String with reverse method");
		
		
		
		
		

	}

}
