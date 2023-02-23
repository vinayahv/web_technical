package oops;

import java.util.Scanner;

class A5{
	private String name;
	//name = "Myname";
	void setName(String n) {
		name=n;
		}
	String getName() {
		return name;
	}

}

public class Encapsulation_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A5 ob1=new A5();
		//ob1.name="Sameera"; name cannot access private
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name");
		ob1.setName(sc.nextLine());
		System.out.println(ob1.getName());
		

	}

}
