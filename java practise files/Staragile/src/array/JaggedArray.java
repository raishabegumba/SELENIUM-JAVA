package array;

public class JaggedArray {

	public static void main(String[] args) {
		
		char jaggedArray[][]= {{'a','b','c'},{'d'},{'e','f','g'}};
		for(int i=0;i<jaggedArray.length;i++)
		{
			for(int j=0;j<jaggedArray[i].length;j++)
			{
				System.out.print(jaggedArray[i][j] +" ");
			}
			System.out.println();
		}

	}

}
