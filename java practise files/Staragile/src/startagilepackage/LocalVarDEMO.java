package startagilepackage;

 class DEMO
{
	int a=30;//global
	
	DEMO(int a)
	{
	a=20;//local variable a=20/10
	}
}

public class LocalVarDEMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println(new DEMO(10).a);
	}

}
