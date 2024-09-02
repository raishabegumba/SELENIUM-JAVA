package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
	
		// define ArrayList without data type, can hold any data type
		ArrayList a1= new ArrayList();
		a1.add(10);
		a1.add(434.89);
		a1.add("hello");
		a1.add('a');
		System.out.println(a1);
		
		ArrayList<Integer> intList= new ArrayList<Integer>();
		//Add Elements to arraylist
		intList.add(10);
		intList.add(20);
		intList.add(30);
		intList.add(40);
		intList.add(50);
		intList.add(5);
		intList.add(10);//allows duplicate value
		
		//print arraylist size
		System.out.println(intList.size());
		//print arraylist content
		System.out.println(intList);
		//fetch element of a specific index
		System.out.println(intList.get(2));
		
		intList.addFirst(1);//add to first 
		intList.addLast(70);//add to last
		
		//search specific element the arraylist 
		System.out.println(intList.contains(30));
		System.out.println("equals:"+ intList.equals(50));	
				
		//add new element to the arraylist
		intList.set(2, 45);
		
		System.out.println("before:" +intList);
		intList.remove(3);
		intList.removeFirst();
		//print arraylist content
		System.out.println("after:" +intList);
		System.out.println("class name is: " +intList.getClass());
		
		ArrayList<Integer> newArray1= new ArrayList<Integer>();
		newArray1.addAll(intList);
		System.out.println("new array contents are: " +newArray1);
		
		
		//clear arraylist content
		intList.clear();
		//print arraylist content
				System.out.println(intList);
		
		
		
		
		
		
		
		
		

	}

}
