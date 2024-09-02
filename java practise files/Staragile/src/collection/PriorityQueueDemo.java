package collection;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<String> queue= new PriorityQueue ();
		queue.add("cherry");
		queue.add("apple");
		queue.add("mango");
		System.out.println("before peek "+queue);
	 
		//retrieves and display first element 
		System.out.println("peek "+ queue.peek());
	
		System.out.println("after peek" +queue);
		//removes first element out
		
		System.out.println("========================");
		System.out.println("before element "+queue);
		//retrieves and display first element
		System.out.println("element "+ queue.element());
		
		System.out.println("AFTER ELEMENT" +queue);
		
		System.out.println("========================");
		System.out.println("Before remove" +queue);
		//removes first element out
		queue.remove();
		System.out.println("after remove"+queue);
		System.out.println("========================");
		//removes first element and display remaining elements
		System.out.println("Before poll" +queue);
		queue.poll();
		System.out.println("after poll"+queue);
		
	}

}
