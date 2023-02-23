package Control_structure;

public class While_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* int i=0;
		while(i<50) {
			System.out.println(i);
			i+=5;
		}*/
		int a=12, b=15,c=8;
		int big=15;
		int lcm=big;
		int i=1;
				while(lcm%a!=0 || lcm%b!=0 || lcm%c!=0) {
					i++;
					lcm=big*i;
					
				}
				System.out.println(lcm);
	}

}
