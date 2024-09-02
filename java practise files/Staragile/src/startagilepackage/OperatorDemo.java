package startagilepackage;

public class OperatorDemo {

	public static void main(String[] args) {
		
		subclass s1= new subclass();
		OperatorDemo o1 = new OperatorDemo();
		if(s1 instanceof subclass)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		System.out.println(o1 instanceof subclass);
		
			
	
	}

}

class subclass extends OperatorDemo {
	
    

}
	