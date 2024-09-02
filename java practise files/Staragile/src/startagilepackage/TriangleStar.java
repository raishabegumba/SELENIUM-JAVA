package startagilepackage;

public class TriangleStar {

	public static void main(String[] args) {

        /*
         * 
         *     *
         *     **
         *     ***
         *     ****
         *     *****
         */
		
		System.out.println("print * in triangle format");
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
         * 
         *     *****
         *     ****
         *     ***
         *     **
         *     *
         */
		System.out.println("print * in triangle format");
		int length=5;
		for(int i=1;i<=length;i++)
		{
			for(int j=length;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
