package inheritance;

class Grandparent
{
	public void print()
	{
		System.out.println(" THIS IS GRANDPARENT");
	}
}

class Parent extends Grandparent
{
	public void print()
	{
		System.out.println(" THIS IS PARENT");
	}
}

class Child extends Parent
{
	public void print()
	{
		//super.super.print();
		System.out.println(" THIS IS CHILD");
	}	
}
public class supersuperdemo {

	public static void main(String[] args) {
		Child C1= new Child();
		C1.print();
		
  
	}

}
