package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<Integer> intList= new LinkedList<Integer>();
		//Add Elements to arraylist
		intList.add(10);
		intList.add(20);
		intList.add(30);
		intList.add(40);
		intList.add(50);
		intList.add(5);
		intList.add(10);//allows duplicate value
		System.out.println(intList);

	}

}
