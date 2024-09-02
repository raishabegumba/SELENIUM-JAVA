package collection;

import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
	    //hash set display elements in random order
		HashSet<Integer> hs= new HashSet<Integer>();
		hs.add(10);
		hs.add(30);
		hs.add(40);
		hs.add(10);//this duplicate value will not be accepted
		System.out.println(hs);
		
		//add values at specific index not allowed in set so as get method is not available
		System.out.println("hashset contains value 10?: "+hs.contains(10));
		System.out.println("hashset has value 30?: "+hs.equals(30));
		hs.remove(10);//remove 10
		
		//print hashset value after remove
		System.out.println(hs);
		// to display items in order format we go for tree set
		
		TreeSet<Integer> ts= new TreeSet<Integer>();
		ts.add(10);
		ts.add(30);
		ts.add(40);
		ts.add(10);//this duplicate value will not be accepted
		System.out.println(ts);
		System.out.println("TREESET has value 30?: "+ts.equals(10));

	}

}
