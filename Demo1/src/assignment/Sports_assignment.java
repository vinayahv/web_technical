package assignment;
import java.util.*;
public class Sports_assignment {
	String s_name;
	int S_size;
	double S_duration;
	Sports_assignment(String name,int size,double duration){
		s_name=name;
		 S_size=size;
		 S_duration=duration;
	}
	void display() {
		System.out.println("Name of a game:\n"+s_name+"Size of a team\n"+S_size+"Game duration\n"+S_duration);
	}
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of team required");
	int num=sc.nextInt();
	Sports_assignment sa[]=new Sports_assignment[num];
	for(int i=0;i<num;i++) {
		System.out.println("Enter a game name");
		String name=sc.next();
		System.out.println("Enter a team size");
		int size=sc.nextInt();
		System.out.println("Enter a game duration");
		double duration=sc.nextDouble();
		sa[i]=new Sports_assignment("name",size,duration);
	}
	for(Sports_assignment SA:sa) {
		
		SA.display();
	}

	}

}
