package exceptioDemo;

public class ArithmeticExeceptionDemo {

	public static void main(String[] args) {

     try
     {
		int num=10/0;
		System.out.println(num);
     }
     catch (ArithmeticException e) {
		System.out.println("ArithmeticException found"+e.getMessage());
	 }

	}

}
