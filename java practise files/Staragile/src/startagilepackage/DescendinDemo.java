package startagilepackage;

public class DescendinDemo {

	public static void main(String[] args) {
		
		//print number from 10 to 1 in descending order
		System.out.println("====================================");
		System.out.println("DESCENDING WITH WHILE LOOP APPREOACH 1");
		int i=10;
		while(i>=1)
		{
			System.out.println(i);
			i--;	
		}

		System.out.println("====================================");
		System.out.println("DESCENDING WITH WHILE LOOP APPRROACH 2");
		int i1=10;
		while(true)
		{
			System.out.println(i1);
			i1--;	
			if(i1==0)
				break;
		}

	}

}
