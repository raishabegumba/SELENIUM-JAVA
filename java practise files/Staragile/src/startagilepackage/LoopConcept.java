package startagilepackage;

public class LoopConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("====================break=================");
		for(int i=1;i<=10;i++)
		{
			if (i==3)
			{
				break;
			}
			System.out.println("the value of i "+ i);
		}
		
		System.out.println("====================continue=================");
		for(int i=1;i<=10;i++)
		{
			if (i==3)
			{
				continue;
			}
			System.out.println("the value of i "+ i);
		}
	}

}
