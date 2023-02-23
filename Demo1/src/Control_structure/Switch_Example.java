package Control_structure;

import java.util.Scanner;

public class Switch_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int day;
		for(;;){
			System.out.println("Enter the choice of your number between 1&7 inclusive");
			System.out.println("Enter zero to exit");
			day=sc.nextInt();
			switch(day) {
			case 0:
				System.out.println("Good bye");
				break;
				case 1:
					System.out.println("it is Monday");
					break;
				case 2:
					System.out.println("it is Tuesday");
					break;
				case 3:
					System.out.println("it is Wensday");
					break;
				case 4:
					System.out.println("it is Thursday");
					break;
				case 5:
					System.out.println("it is Friday");
					break;
				case 6:
					System.out.println("it is Saturday");
					break;
				case 7:
					System.out.println("it is Sunday");
					break;
				default:
					System.out.println("Sorry out of Range");
					break;
			}
			if(day==0)
			break;
		}

		
	}

}
