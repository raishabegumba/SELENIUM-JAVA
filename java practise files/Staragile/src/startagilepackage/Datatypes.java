package startagilepackage;

public class Datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//approach 1 to declare variable and assign value 
		int num1=100;
		int num2=200;
		int num3=300;
		System.out.println("the value of num1:"+num1);
		System.out.println("the value of num2:"+num2);
		System.out.println("the value of num3:"+num3);
		
		//second approach first declare and then assign
		int num4,num5,num6;
		num4=400;
		num5=500;
		num6=600;
		
		
		/*third approach define  declare and assign in
		single statement if all variable are of same datatype*/
		int num7=700,num8=800,num9=900;
		System.out.println("the value of num7:"+num1 +" the value of num8:" +num8+" the value of num9:"+num9);
		
		//byte type -128....127
		byte b1=-128;
		byte b2= 127;
		System.out.println("value of b1 is " + b1);
		System.out.println("value of b2 is " + b2);
		
		//short type
		short s1= 128;		short s2= 12313;
		System.out.println("value of s1 is " + s1);
		System.out.println("value of s2 is " + s2);
		
		int i1=754789456;
		
		float f1= 2.345f;
		char c1= 'c';
		boolean status1=true;
		boolean status2=false;
	//	boolean status3="true";  NOT VALID
	//	boolean status4="FALSE"; NOIT VALID
		double d1=6.78875465;
		
		System.out.println("value of i1 is " + i1);
		System.out.println("value of f1 is " + f1);
		System.out.println("value of c1 is " + c1);
		System.out.println("value of status1 is " + status1);
		System.out.println("value of status2 is " + status2);
		System.out.println("value of d1 is " + d1);
				
		System.out.println("=================================string======================");
		//char c='abc';//not valid
		//String s1='r'; not valid
		//String s2='abc'; not valid
	//	String s3= true; not valid
		String name= "raisha"; // VALID
		
						
	}

}
