package startagilepackage;

import java.util.Scanner;

public class SubjectPercentageDemo {
	public static void main(String[] args) {
		
		float total=500;
		System.out.println("Enter the marks of 5 subjects scored in CBSE exam");
		Scanner Subject= new Scanner(System.in);
		System.out.println("Enter Student English mark :");
		float English = Subject.nextFloat();
		System.out.println("Enter Student Hindi mark :");
		float Hindi = Subject.nextFloat();
		System.out.println("Enter Student Math mark :");
		float Math = Subject.nextFloat();
		System.out.println("Enter Student Social mark :");
		float Social = Subject.nextFloat();
		System.out.println("Enter Student Science mark :");
		float Science = Subject.nextFloat();
		
		float sum= English+Hindi+ Math+ Social+ Science;
		float result= (sum/total)*100;
		System.out.println("the result of CBSE exam is: " +result);
		
		
	}

}
