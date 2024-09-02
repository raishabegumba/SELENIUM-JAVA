
package startagilepackage;
import java.util.Scanner;

public class ScannerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=  new Scanner(System.in);
		
		System.out.println("enter your name :");
		String name = input.nextLine();
	
		System.out.println("enter your age :");
		int age= input.nextInt();
		
		if(age>=18)
		{

		System.out.println(name +" is eligible for license" + " age of" +name+ " is " + age);
		}

	}

}
