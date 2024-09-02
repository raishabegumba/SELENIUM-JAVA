package startagilepackage;

import java.util.Scanner;

public class TrafficSignalDemo {

	public static void main(String[] args) {
		 Scanner input= new Scanner(System.in);
		 
		    while(true)
		    {
		  
		    System.out.println("enter signal: ");
		    String signal= input.nextLine();
		    switch(signal)
		    {
		    case "RED": System.out.println("---------------PLEASE STOP YOUR VEHICLE-----------");
		    break;
		    case "AMBER": System.out.println("---------------SLOW DOWN YOUR VEHICLE-----------");
		    break;
		    case "GREEN": System.out.println("---------------YOU ARE SAFE TO PROCEED-----------");
		    break;
		    default: System.out.println("SAFE DRIVE AND TAKE CARE OF YOU");
		 	 System.out.println();
		    }
		    }
		    
	}

}
