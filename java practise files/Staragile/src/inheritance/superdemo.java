package inheritance;


class Parent1
{
	int a;
	//parent constructor 
	Parent1( int a)
	{
		System.out.println("i am parent constructor");
		this.a=a;
	}
	public int GetA()
	{
		return a;
	}
	
	public void parentDisplay()
	{
		System.out.println(this.GetA());
	}
}

class Child1 extends Parent1
{
	int a;
	//child constructor
	Child1(int a)
	{
        super(10);//mandatory to invoke parent parameterised constructor before child constructor
		this.a=a;
		System.out.println("i am child constructor");
	}
	
	//super.parentDisplay();
}

public class superdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent1 p1= new Parent1(30);
		p1.parentDisplay();
		Child1 c1= new Child1(20);
		c1.parentDisplay();
	}

}
