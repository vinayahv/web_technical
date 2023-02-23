package Arrays;

import java.util.Scanner;

public class Check_If_Perfect_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// say example :given number is 120  
				// Algorithm - if a number is divided by it square root, then the quotient is same as the divisor and the remainder is zero
				//  make i = 1; 
				//  check i* i is <= given number , divide by 1 check if quotient is also 1  and remainder is zero
				// check i* i is <= given number , divide by 2 , check if quotient is also 2 and remainder is zero   
				
				Scanner sc = new Scanner(System.in);
				
				for(;;) {
					System.out.println("Enter a number of your choice");
				
					int given_number = sc.nextInt();
				
					int flag = 0;
				
					for(int i=1; i*i<=given_number; i++) {
						if(given_number/i ==i && given_number%i==0) {                       // checking the algorithm said above
							System.out.println("The given number is a perfect square");
							System.out.println("It is the square of the numner: "+i);
							flag =1;                                                       // sets flag indicating the a perfect square 
							break;                                                         // comes out the present for loop
						}
					}
				
					if(flag==0) {
						System.out.println("The given number is not a perfect square");
					}
					
					System.out.println("Press 0 to exit Or anyother other number to continue");
					
					int exit_number = sc.nextInt();
					
					if(exit_number == 0) {                 // condition to check wheter to exit the loop or to continue the loop
						System.out.println("Good Bye");
						break;            // comes out of the main for loop
					}
				
				}
			}
		

	}


