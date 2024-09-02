package startagilepackage;

public class StaticDemo {

	static int a=10;
	int b;
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StaticDemo s1= new StaticDemo();
		System.out.println(a);//using static member wihout using class name
		System.out.println(StaticDemo.a); //using static member wihout using class name
		//StaticDemo s2= new StaticDemo();
		StaticDemo1();//call static method
		StaticDemo s1= new StaticDemo();
		
		s1.StaticDemo2();//calling non static method inside static method using object
}
	
	static void StaticDemo1()//static method
	{
		a=20;//using static member wihout using class name , using directly
		System.out.println(a);
		StaticDemo.a=20;//using static member using class name 
		System.out.println(StaticDemo.a);
		StaticDemo s1= new StaticDemo();
		System.out.println("before value " +s1.b);// non static members can be used only tho=rough reference variable
		s1.b=30;
		System.out.println("after value "+s1.b);
	}
	
	void  StaticDemo2()//non static method
	{
				a=30;
				System.out.println("this is non static member : value of a here is " + a);
				StaticDemo s2= new StaticDemo();
			    s2.b=30;				
			    System.out.println("this is non static member : value of b here is " +s2.b);
	}

	
}


