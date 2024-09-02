package assignment;

import java.util.ArrayList;

public class ArrayListAscendingWithLoop {

	public static void main(String[] args) {

		ArrayList<Integer> intList= new ArrayList<Integer>();
		intList.add(10);
		intList.add(40);
		intList.add(30);
		intList.add(20);
		intList.add(5);
        System.out.println("Before list value: "+intList);

        System.out.print("After list value: ");
		for (int i = 0; i < intList.size(); i++) 
		   {
			ArrayList<Integer> sortedList= new ArrayList<Integer>();
		
			for (int j = i+1; j < intList.size(); j++) 
			{
		
			   if(intList.get(i) intList.get(j))
			   {
				   sortedList.add(intList.get(i));
				   //System.out.print(intList);
				  			   	  		   
			   }
			   
			  			
			}
			 System.out.print(sortedList);


	}

	}
}

