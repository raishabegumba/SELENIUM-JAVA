package startagilepackage;



public class Conditons_Check {

	public static void main(String[] args) {

		System.out.println("--------------if else-------------------");
		int c1=10;
		int c2=20;
		if(c1==c2)
		{
			System.out.println("c1 and c2 are same");
		}
		else
		{
			System.out.println("c1 and c2 are not same");
		}
		
		System.out.println("--------------if else if-------------------");
	
		if(c1==c2)
		{
			System.out.println("c1 and c2 are same");
		}
		else if(c1!=c2)
		{
			System.out.println("c1 and c2 are not same");
		}
		else
		{
			System.out.println("do nothing");
		}
		
		System.out.println("-------------- for loop-------------------");
		
		for(c1=0;c1<c2;c1++)
		{
			System.out.println("value inside for loop of c1 is "+ c1);
		}
		
		System.out.println("-------------- while loop-------------------");
		
		int w1=10;
		
		while(w1<=20)
		{
			System.out.println("value inside while loop of w1 is "+ w1);
			w1++;
		}
		
		System.out.println("-------------- do while loop-------------------");
		int dw1=10;
		
		do
		{
			System.out.println("value inside do while loop of dw1 is "+ dw1);
			dw1++;
		}while(dw1<=15);
		
		
		System.out.println("-------------- odd and even numbers-------------------");
		int num1=10;
		int num2=15;
		
		if(num1 % 2== 0)
		{
			System.out.println("the number is even");
		}
		else
		{
			System.out.println("the number is odd");
		}
		
		int even=(num1%2==0)?num1:num2;
		System.out.println("the number is even in ternary operator 	"+ even);
		
		
		
		System.out.println("-------------- leap year-------------------");
	//	int dw1=10;
		

	}

}
