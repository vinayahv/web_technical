package AssignmentPrograms;

import java.util.Scanner;

public class Assignments_Problems {
	static int big=0;
	static void biggest(int a,int b,int c) {
	big=(a>b)? (a>c)?a:c : (b>c)?b:c;
	System.out.println(big);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Assignment - 3
		
		/*int num=5;
		for(int i=1; i <= 10; i++)  
			System.out.println(num+" * "+i+" = "+num*i);
		
		// Assignment 2
		
		 for(int i=1; i<=100; i++) 
			{
			if(i%8!=0) {
				System.out.println(i);
			
			}
			}
		 
		 //Assignment - 1
		 
		int val=500;
		if(val<=1000) {
			if(val>=500) 
				System.out.println("range is between 500to 1000");
				else if(val>=100)
					System.out.println("range is between 100 to 500");
				else if(val>=10)
				System.out.println("range is between 10 to 100 ");
				else
					System.out.println("the range is between 1 to 10");
		}
			else
				System.out.println("the value is above the range");		
	

} */
	//Sorting an array
			/* Scanner sc=new Scanner(System.in);
			System.out.println("Enter a size of an array");
			int s=sc.nextInt();
			int arr[]=new int[s];
			System.out.println("Enter an element");
			for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			}
			System.out.println("the sorted Array is:");
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					int temp=0;
					if(arr[i]>arr[j]) {
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						
					}
				}
				System.out.println(arr[i]);
			}
			System.out.println("The biggest no is:"+" "+arr[arr.length-1]);
			System.out.println("The second biggest no is:"+" "+arr[arr.length-2]);
				sc.close(); */
		
		biggest(36,65,456);
		
			}
			
			}
			