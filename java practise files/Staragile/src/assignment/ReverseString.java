package assignment;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		//To accept user input
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the string to be reversersed: ");
	    
		//Store user string out into variable
		String input=sc.nextLine();				
		System.out.println("Print Reverse String without reverse method");
		
		//Reverse String without reverse method
		for(int i=input.length()-1;i>=0;i--)
			{
				System.out.print(input.charAt(i));
			}
		
		System.out.println();
		System.out.println("=============================");
		StringBuilder reverseString=new StringBuilder(input);
				
		System.out.println("Print Reverse String with reverse method: ");
		System.out.println(reverseString.reverse());
			
		}
		
}




