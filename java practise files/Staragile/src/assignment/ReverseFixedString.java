package assignment;

public class ReverseFixedString {

	public static void main(String[] args) {
	  
		String input="StarAgile Java";
        
        System.out.println("Printing Reverse String without reverse method");
		
		for(int i=input.length()-1;i>=0;i--)
		{
				System.out.print(input.charAt(i));
		}
	
		System.out.println();
		System.out.println("=============================");
		StringBuilder reverseString=new StringBuilder( input);
			
		System.out.println("Printing Reverse String with reverse method: ");
		System.out.println(reverseString.reverse());
			
		}
		

	}


