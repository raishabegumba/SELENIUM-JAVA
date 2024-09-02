package exceptioDemo;

public class NullPointerExceptionDemo {

	public static void main(String[] args) {

      int a[]= null;
      try
      {
      System.out.println(a.length);
      }
      catch (Exception e) {
		System.out.println(e.getMessage());	}

	}

}
