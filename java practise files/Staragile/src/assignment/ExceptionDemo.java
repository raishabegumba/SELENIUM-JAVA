package assignment;

public class ExceptionDemo {

	public static void main(String[] args) {
	
		  String array[]= {"c", "c++","java","python"};
		  System.out.print("Printing string array values: ");
		     try {
		    	 for (int i = 0; i <= array.length; i++) {
		    			
		    		 System.out.print(array[i] + " " );
		    	} 
		    	 
		     }
		     catch (ArrayIndexOutOfBoundsException e) {
		    	System.out.println("\nCaught an ArrayIndexOutOfBoundsException: " + e.getMessage());
			}
		  
		   char arr[]=null;
		   try
		    {
		    	 System.out.println(arr.length);
		    }
		   catch (NullPointerException e) 
		   {
			   System.out.println("Caught an NullPointerException: " + e.getMessage());
		   }
		   
			   
	}
		     
} 



