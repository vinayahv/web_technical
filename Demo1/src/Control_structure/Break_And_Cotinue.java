package Control_structure;

public class Break_And_Cotinue {

	public static void main(String[] args) {
		// Break statement makes the program flow to exit
		int k=0;
		for(;;) {
			k+=4;
			if(k%6==0) {
				continue;
			}
				System.out.println(k);
				if(k%7==0) {
					break;
				}
			}
		System.out.println("out of the loop");
		}
		

	}


