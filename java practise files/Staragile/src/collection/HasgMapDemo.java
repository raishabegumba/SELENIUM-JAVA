package collection;

import java.util.HashMap;
import java.util.Set;

public class HasgMapDemo {

	public static void main(String[] args) {

        HashMap hm= new HashMap();
        hm.put(1, 'a');
        hm.put(3, 'c');
        hm.put(2, 'b');
        hm.put(4, 'a');//duplicate value unique key is allowed
        //sort key and display content
        System.out.println(hm);
        hm.put(1, 'b');//overwrites value of key 1
        System.out.println(hm);
        
        //fetch keys into set since keys are unique
        Set setKey=hm.keySet();
        //retreive each element of map and by passing key values
        for ( Object s: setKey) {
        	System.out.print(hm.get(s) + " ");
			
		}

	}

}
