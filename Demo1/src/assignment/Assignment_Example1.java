package assignment;

import java.util.Scanner;

class B2{
	double amount;
	String designation;
	String department;
	String name;
    B2(double amt,String design,String edept,String name){
    	amount=amt;	
    	designation=design;
    	department=department;
    	name=name;
    }
    void display() {
      if(amount==15000) {
    	  double salary=amount+(0.50*amount)+5000*2;
    	  System.out.println("Name:"+name);
	      System.out.println("SE:"+salary);
	      System.out.println("Designation:"+designation);
	      System.out.println("Department"+department);
	      System.out.println("**********");
      }
      else if(amount==25000) {
    	  double salary=amount+(0.50*amount)+5000*2;
    	  System.out.println("Name:"+name);
    	  System.out.println("SSE:"+salary);
    	  System.out.println("Designation:"+designation);
	      System.out.println("Department"+department);
	      System.out.println("**********");
      }
      
	  if(amount==50000) {
		  double salary=amount+(0.50*amount)+5000*2;
		  System.out.println("Name:"+name);
		  System.out.println("Manager:"+salary);
		  System.out.println("Designation:"+designation);
	      System.out.println("Department"+department);
	      System.out.println("**********");
	  }
	  if(amount==75000) {
		  double salary=amount+(0.50*amount)+5000*2;
		  System.out.println("Name:"+name);
		  System.out.println("Director:"+salary);
		  System.out.println("Designation:"+designation);
	      System.out.println("Department"+department);
	      System.out.println("**********");
	  }
		
	}
    }
public class Assignment_Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number of employees");
		 int n=sc.nextInt();
		 B2 emp[]=new B2[n];
		 for (int i=0;i<emp.length;i++) {
	     System.out.println("Name of an employee");
	     String name=sc.next();
	     System.out.println("Enter the designation");
	     String designation=sc.next();
	     sc.nextLine();
	     System.out.println("Enter the basic salary amount");
	     Double amount=sc.nextDouble();
	     System.out.println("Enter your department");
	     String department=sc.next();
	     emp[i]=new B2(amount,designation,department,name);
	     B2 ob1=new B2(amount,designation,department,name);
		 }
		 
	     //ob1.display();
		 
	}
 }
