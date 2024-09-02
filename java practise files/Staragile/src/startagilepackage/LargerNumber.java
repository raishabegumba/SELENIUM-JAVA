package startagilepackage;

import java.util.Scanner;

public class LargerNumber {

	public static void main(String[] args) {

      Scanner input= new Scanner(System.in);
      System.out.println("enter first number");
      int number1= input.nextInt();
      System.out.println("enter second number");
      int number2= input.nextInt();
      System.out.println("enter third number");
      int number3= input.nextInt();
      
      if(number1>number2 && number1>number3)
      {
    	  System.out.println(number1 +" is largest number");
      }
      else if(number2>number1 && number2>number3)
      {
    	  System.out.println(number2+" is largest number");
      }
      else 
      {
    	  System.out.println(number3+" is largest number");
      }
	}

}
