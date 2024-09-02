package startagilepackage;

import java.util.Scanner;

public class KilomterToMiles {

	public static void main(String[] args) {

        System.out.println("enter the kilomter value");
        Scanner in= new Scanner(System.in);
        double kilometer= in.nextFloat();
        double miles= kilometer/1.6;
        System.out.println("Coverted mile value is:"+ miles + " miles");

	}

}
