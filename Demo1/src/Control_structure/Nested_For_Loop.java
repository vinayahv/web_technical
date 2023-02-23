package Control_structure;

import java.util.Scanner;

public class Nested_For_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter number of rows: ");
		int row=sc.nextInt();
		//int j=1;
		for(int i=1;i<=row;i++){
	int j=1;
			for(int col=1;col<=i;col++) {
				System.out.print(j+" ");
				j++;
			}
			System.out.println();
		sc.close();	
		}
		}

	

	}


