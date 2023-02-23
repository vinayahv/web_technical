package collections;

import java.util.Stack;

public class Stack_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> st1=new Stack<>();
		st1.push("Amar");
		st1.push("xxx");
		// peek , pop
		System.out.println(st1.peek());
		System.out.println(st1);
		System.out.println(st1.pop());
		System.out.println(st1);
		st1.add("Srinivas");
		System.out.println(st1);
		st1.push("Karthik");
		st1.add("Ganesh");
		System.out.println(st1);
		st1.add(2,"Badri");
		System.out.println(st1);
		st1.addElement("Soma");
		System.out.println(st1);
		
		System.out.println(st1.capacity());
		st1.addElement("Babu");
		st1.addElement("Ganesh");
		st1.addElement("Prasad");
		st1.addElement("Charan");
		st1.addElement("Sharan");
		st1.addElement("Gouri");
		System.out.println(st1);
		System.out.println(st1.capacity());
		
		// for(String str: st1) {System.out.println(st1.peek)}

	}

}
