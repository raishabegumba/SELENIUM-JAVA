package array;

public class MultiDimension {

	public static void main(String[] args) {
		//Different way to declare multi dimension array
		int array1[][]= new int [2][4];
		
		array1[0][0]=10;
		array1[0][1]=20;
		array1[0][2]=30;
		array1[1][0]=40;
		array1[1][1]=50;
		array1[1][2]=60;
		//print array using for loop
		for(int i=0;i<array1.length;i++)// OR i<=`array1.length-1
		{
			for(int j=0;j<array1[i].length;j++)
			{
				System.out.print(array1[i][j]+ " ");
			
			}
			System.out.println();
		}
		System.out.println("print array using for each loop");
		for(int arr[]:array1)
		{
			for(int a:arr)
			{
				System.out.print(a+ " ");
				
			}
			System.out.println(" ");
		}
				
	}

}
