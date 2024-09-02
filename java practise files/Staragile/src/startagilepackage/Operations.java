package startagilepackage;

public class Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=5;
		int c= a+b;
		System.out.println("the sum of a and b is " + c);
		
		int d= a-b;
		System.out.println("the difference of a and b is " +d);
		int e= a*b;
		System.out.println("the product of a and b is " +e);
		int f= a/b;
		System.out.println("the qotient of a and b is " +f);
		
		int g= a%b;
		System.out.println("the modulus of a and b is " +g);
		
		 System.out.println("..............relational operators are verified............");
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		
		 System.out.println("..............Logical operators are verified.......");
		System.out.println("Logical AND all conditions are verified");
		System.out.println(a>b && c>b);//true
		System.out.println(a>b && b>c);//false
		
        System.out.println("Logical OR any of the conditions are verified");
		System.out.println(a>b || b>c); //true
		System.out.println(a>c || b>c); //False
		
		System.out.println("..............unary operators ++..................");	
		int ua=10;
		int res=a++;
		System.out.println("tha value of res is=" +res);
		System.out.println("the value of a after increment" +a);

		
		System.out.println(".......................unary operators --.............");	
		System.out.println(a--);
		System.out.println(--a);
		
		
		
		System.out.println(".......................assignment operators +=.............");
		//to increment or decrement value by more than 1 use assignement operator
		int a1=10;
		System.out.println(" before a1 is "+a1);
		a1+=5;
		System.out.println(" after c1 is " +a1);
		
		System.out.println(".......................assignment operators -=.............");	
		int b1=10;
		System.out.println(" before b1 is "+b1);
		b1-=5;
		System.out.println(" after b1 is "+b1);
		
		System.out.println(".......................assignment operators *=.............");	
		int c1=10;
		System.out.println(" before c1 is " +c1);
		c1*=5;
		System.out.println("after *= c1 is " + c1);
		
		System.out.println(".......................assignment operators /=.............");	
		int d1=10;
		System.out.println(" before d1 is " +d1);
		d1/=5;
		System.out.println("after *= d1 is " + d1);
		
		System.out.println(".......................unary operators.............");	
		int first=10;
		int second=5;
		int min;
		min=(first>second)?second:first;
		System.out.println("min is " + min);
		
		int max;
		max=(first>second)?first:second;
		System.out.println("max is " + max);
		
		int x= (1==1)?200:100;
		System.out.println("the value of x after ternary operation is :" +x);
		
		int person_age= 35;
		boolean elegible= (person_age>=18)?true:false;
		System.out.println("the person is eligible for voting "+ elegible);
		 String result=(person_age>=18)?"elegible":"not elegible";
		 System.out.println("result is "+ result);
		
	
		
		
	}

}
