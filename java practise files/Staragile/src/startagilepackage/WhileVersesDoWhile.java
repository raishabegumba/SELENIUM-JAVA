package startagilepackage;

public class WhileVersesDoWhile {

	public static void main(String[] args) {

        int i1=10;
        System.out.println("while execution");
        while(i1<=5)
        {
        	System.out.println(i1);//this will not be printed in while 
        	i1++;
        }

        System.out.println("do while execution");
        int i2=10;
         do {
        	 System.out.println(i2); 
        	 i2++;
				
			}while(i2<=5);
         
	}

}
