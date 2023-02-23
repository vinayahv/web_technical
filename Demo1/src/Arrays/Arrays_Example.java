package Arrays;

import java.util.Scanner;

public class Arrays_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] ar1 = {12,34,11,35,47,27};// array is declared and initialized with values
		
		int ar2[] = {11,22,33,44,55,66,77,88,}; //array is declared and initialized with values
		
		int[] ar3 = new int[7]; //this is an integer array that can hold 7 elements
		
		ar3[0] =1; ar3[1]=2; ar3[2]=3; ar3[3]=4; ar3[4]=5; ar3[5]=6; ar3[6]=7;
		
		//ar3[7]=8; //gives runtime error as out of the bounds
		System.out.println(ar1[0]);
		System.out.println(ar2[3]);
		System.out.println(ar3[5]);
		System.out.println("***************");
		System.out.println(ar1.length);
		System.out.println(ar2.length);
		System.out.println(ar3.length);
		for(int i=0; i<ar1.length; i++) {
			System.out.println(ar1[i]+" ");
}
		
		//System.out.println(ar1);  gives junk
		
		System.out.println("\n********* 2");
		Scanner sc = new Scanner(System.in);
		
		int[] ar4;
		
		System.out.println("Enter the number of students in the class");
		
		int num = sc.nextInt();
		
		ar4 =  new int[num];
		
		System.out.println("Enter the scores of the students");
		
		for(int i = 0; i<ar4.length; i++) {
			System.out.println("Please Enter The Score Of Student "+ (i+1) +": ");
			ar4[i]=sc.nextInt();
		}
		
		System.out.println("The scores entered are: ");
		
		for(int i = 0; i<ar4.length; i++) {
			System.out.println(ar4[i]);
		}
		
		System.out.println("\n********* 3");
		for(int score: ar4) {              // for each loop
			System.out.println(score);
		}  
	}
}
		
		

	


