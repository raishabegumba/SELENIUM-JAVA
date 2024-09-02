package collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionCopy {

	public static void main(String[] args) {

		ArrayList<Integer> newArray1= new ArrayList<Integer>();
		newArray1.add(10);
		newArray1.add(20);
		newArray1.add(30);
		newArray1.add(40);
		System.out.println("array1 contents are: " +newArray1);
		
		ArrayList<Integer> newArray2= new ArrayList<Integer>();
		newArray2.add(1);
		newArray2.add(2);
		newArray2.add(3);
		newArray2.add(4);
		newArray2.add(5);
		newArray2.add(6);
		newArray2.add(7);
		newArray2.add(8);
		System.out.println("before copy contents are: " +newArray2);
		
		//copy one list to other list
		//arrayindexoutofboudexception since destination arraylist size < source arraylist
	//	Collections.copy(newArray1, newArray2); 
		
		Collections.copy(newArray2, newArray1); 
		/*when destination size is greater than source list,
		 * then copy method copies first list content into second list , value of additional 
		 * index remains the same 
		 */
		System.out.println("after copying"+newArray2  );
		


	}

}
