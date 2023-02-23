package collections;

import java.util.PriorityQueue;

public class Queue_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pp1=new PriorityQueue<String>();
		pp1.add("noOne");
		pp1.add("anyOne");
		pp1.add("someOne");
		pp1.add("everyOne");
		pp1.add("anyBody");
		
		System.out.println(pp1);
		
		System.out.println(pp1.peek());
		System.out.println(pp1.poll());
		System.out.println(pp1.poll());
		System.out.println(pp1.poll());

	}

}
