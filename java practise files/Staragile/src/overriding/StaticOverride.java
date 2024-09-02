package overriding;

class OverrideParent
{
	static void display()
	{
		System.out.println(" i am parent static");
	}
}

class OverrideaChild extends OverrideParent
{
	static void display()
	{
		System.out.println(" i am child static");
	}
}

public class StaticOverride {

	public static void main(String[] args) {

		// child statuc meythod hides parent display cos static method belongs to class and not to objects
	      
		OverrideaChild.display();
	}

}
