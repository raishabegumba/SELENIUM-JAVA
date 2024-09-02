package startagilepackage;

import java.util.Scanner;

public class WeekDayDemo {

	public static void main(String[] args) {
		Scanner input1= new Scanner(System.in);
		System.out.println("ENTER DAY NUMBER:");
		int dayNum= input1.nextInt();
		switch(dayNum)
		{
		case 1:System.out.println("MONDAY");
		break;
		case 2:System.out.println("TUESDAY");
		break;
		case 3:System.out.println("WEDNESDAY");
		break;
		case 4:System.out.println("THURSDAY");
		break;
		case 5:System.out.println("FRIDAY");
		break;
		case 6:System.out.println("SATURDAY");
		break;
		default:System.out.println("SUNDAY");
		}
		
		Scanner input2= new Scanner(System.in);
		System.out.println("ENTER DAY NAME:");
		String dayName= input2.nextLine();
		switch(dayName)
		{
		case "MONDAY":System.out.println(1);
		break;
		case "TUESDAY":System.out.println(2);
		break;
		case "WEDNESDAY":System.out.println(3);
		break;
		case "THURSDAY":System.out.println(4);
		break;
		case "FRIDAY":System.out.println(5);
		break;
		case "SATURDAY":System.out.println(6);
		break;
		default:System.out.println(7);
		}
		

	}

}
