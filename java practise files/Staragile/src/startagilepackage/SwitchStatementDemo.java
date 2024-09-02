package startagilepackage;

import java.util.Scanner;

public class SwitchStatementDemo {

	public static void main(String[] args) {

    //in switch statement 
    Scanner input= new Scanner(System.in);
  
    System.out.println("enter your age: ");
    int age = input.nextInt();
    switch(age) {
    case 18 :
    case 19:
    case 20:
    case 50:
    case 60:
    	System.out.println("your are eligible for driving license ");
    break;
    case 15:
    case 16:
    case 17:
    	System.out.println(" your are eleigible for learner license");
    break;
   
    default: System.out.println("not eligible for any license");
    }
    
    
    

	}

}
