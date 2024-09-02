package startagilepackage;

public class EvenOdd1 {

	public static void main(String[] args) {

		System.out.println("EVEN WITH WHILE LOOP APPROACH 1");
		int i1=2;
		while(i1<=10)
		{
			System.out.println(i1);
			i1+=2;
		}
		
		System.out.println("====================================");
		System.out.println("EVEN WITH WHILE LOOP APPROACH 2");
		int i2=1;
		while(i2<=10)
		{
			if(i2 %2==0)
			{
			System.out.println(i2);
			}
			i2++;
			
		}
		
		System.out.println("====================================");
		System.out.println("EVEN WITH for LOOP APPROACH 1");
		for(int i3=2;i3<=10;i3+=2)
		{
			System.out.println(i3);
		}
		
		System.out.println("====================================");
		System.out.println("EVEN WITH for LOOP APPROACH 2");
		for(int i4=1;i4<=10;i4++)
		{
			if(i4%2==0)
			{
			System.out.println(i4);
		}
		}
		

	}

}
