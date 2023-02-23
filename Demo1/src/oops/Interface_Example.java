package oops;
interface Bank{
public double rateofinterest();
public double amount(int a, int b, double c);
}
interface RBI{
	public double maxlimit();
}

class ICICI implements Bank,RBI{
	public double rateofinterest() {
		return 9.5;
	}
	public double amount(int principal,int years,double rateofinterest) {
		
			return (principal*years*rateofinterest)/100;
		}

public double maxlimit() {
	return 2000000;
}
}
	class SBI implements Bank{
		public double rateofinterest() {
			return 9.75;
		}
		public double amount(int principal,int years,double rateofinterest) {
			
			return (principal*years*rateofinterest)/100;
		}

		}
public class Interface_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICICI acc1=new ICICI();
		System.out.println(acc1.amount(10000,5,acc1.rateofinterest()));
		System.out.println(acc1.maxlimit());
		SBI acc2=new SBI();
		System.out.println(acc2.amount(10000,5,acc2.rateofinterest()));
	

	}

}
