package Collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<String> pq1 = new PriorityQueue<String>();
		pq1.add("Pune");
		pq1.add("Pimpri");
		pq1.add("Chinchwad");
		
		//pq1.add(null);
		
		System.out.println(pq1);
		
		pq1.peek();
		//for last element
		System.out.println("Last Element " + pq1.peek());
		
		//for First Element
		System.out.println("First Element " + pq1.poll());
		System.out.println(pq1);
		
		//This will print the values that are added
		ArrayDeque<String> dq1 = new ArrayDeque<String>();
		dq1.add("Pune");
		dq1.add("Pimpri");
		dq1.add("Chinchwad");
		//dq1.add(null);
		dq1.add("Chinchwad");
		
		
		System.out.println(dq1);
		
		System.out.println(dq1.peek());
		
		System.out.println(dq1.peekFirst());
		
		System.out.println(dq1.peekLast());
		
		
		System.out.println("************");
		System.out.println(dq1.poll());
	
		//System.out.println(dq1.pollFirst());
		
		System.out.println(dq1.pollLast());
		
		System.out.println(dq1);
	}

}
