package collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionShuffle {

	public static void main(String[] args) {
		ArrayList<Integer> newArray= new ArrayList<Integer>();
		newArray.add(1);
		newArray.add(2);
		newArray.add(3);
		newArray.add(4);
		newArray.add(5);
		newArray.add(6);
		newArray.add(7);
		newArray.add(8);
		System.out.println("before shuffle contents are: " +newArray);
		Collections.shuffle(newArray);
		System.out.println("after shuffle contents are: " +newArray);
	}

}
