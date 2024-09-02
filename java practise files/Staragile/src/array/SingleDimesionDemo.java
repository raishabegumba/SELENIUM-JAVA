package array;

public class SingleDimesionDemo {

	public static void main(String[] args) {
		
		// Different ways to declare array
		int arr1[];
		arr1=new int[5];//declare 
		
		int value=1;
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]= value;
			value=value+1;
			System.out.print(arr1[i]);
			
		}
		System.out.println();
		System.out.println("the length of array is: "+ arr1.length);
		//float array
		float [] arr2= new float[5];
		arr2[0]=11.5f;
		arr2[1]=12.8f;
		arr2[2]=13.78f;
		arr2[3]=14.98f;
		arr2[4]=15.66f;
	//	arr2[5]=16; array out of bound exception
		
		//char array
		char arr3[]= {'a','b','c','d','e'};//declare and initialize 
		
		System.out.println("printing character array");
		for(char a:arr3)
		{
			System.out.print(a);
			System.out.print(" ");
		}
		String arr4[]=new String[] {"raisha","begum", "zaeem", "zahan"," jabbar"};//declare and initialize 
		System.out.println();
		System.out.println("array address is :" +arr4);//print array address
		System.out.println("printing string array");
		for(String a:arr4)
		{
			System.out.print(a);
			System.out.print("  ");
		}
		
		
		
				
		

	}

}
