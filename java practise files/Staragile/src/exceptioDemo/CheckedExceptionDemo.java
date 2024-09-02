package exceptioDemo;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		
		
		//arrayindexoutof bound exception
		try
		{
			int a=0/2;
			System.out.println("going to divide by 0");    
		}catch(ArithmeticException e)
		{
			System.out.println(e);  
			
		}
		finally
		{
			System.out.println("execute final block");
		}
	

	}

}
