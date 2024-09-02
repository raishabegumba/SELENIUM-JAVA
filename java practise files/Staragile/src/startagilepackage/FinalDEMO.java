package startagilepackage;


class Test
{
	final int i;
	Test(int x)
	{
		i=x;
	}
}


public class FinalDEMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t1= new Test(10);
		System.out.println(t1.i);
		
		
		Test t2= new Test(20);
		System.out.println(t2.i);

	}

}
