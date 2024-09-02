package startagilepackage;

// swapping of 2 numbers using 2 technique

public class swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=============================swapp 2 variables using 3rd variable temp===================");
		int num1=10, num2=20;
		int temp;
		System.out.println("the value of num1 and num2 before swapping is "+ num1+ "   "+ num2);
		temp=num2;
		num2=num1;
		num1=temp;
		System.out.println("the value of num1 and num2 after swapping is "+ num1+ "   "+ num2);
        
		System.out.println("=============================swapp 2 variables using arithmetic operators===================");
		int num3=10, num4=20;
		System.out.println("the value of num3 and num4 before swapping is "+ num3+ "   "+ num4);
		num4=num3+num4;//10+20=30
		num3=num4-num3;//30-10=20
		num4=num4-num3;//30-20=10
		System.out.println("the value of num3 and num4 after swapping is "+ num3+ "   "+ num4);
		
		
	}

}
