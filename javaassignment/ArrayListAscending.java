package javaassignment;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAscending {

	public static void main(String[] args) {

    ArrayList<Integer> list= new ArrayList<Integer>();
	    list.add(10);
	    list.add(40);
	    list.add(30);
	    list.add(20);
	    list.add(5);
    System.out.println("Before list value: "+list);
    //sorting using sort() method of Collection class
    Collections.sort(list);
    System.out.println("After list value: "+list);
    
  }
	
}

