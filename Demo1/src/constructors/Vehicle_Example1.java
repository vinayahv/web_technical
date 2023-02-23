package constructors;

import java.util.Scanner;

class Vehicle{
	String Vname;
	int Vmakeyear;
	String Vmanufacturer;
	Vehicle(String name,int year,String manufacturer){
		Vname=name;
		Vmakeyear=year;
		Vmanufacturer=manufacturer;
	}
	void displayVehicleDetails() {
		System.out.println("Details of Vehicle:"+"\n Name="+Vname+"\n Year of make= "+Vmakeyear+"\n manufactures= "+Vmanufacturer);
	}

}

public class Vehicle_Example1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Vehicle v1=new Vehicle("Swift",2015,"Maruti");
		Vehicle v2=new Vehicle("Creta",2019,"hyudai");
		v1.displayVehicleDetails();
		v2.displayVehicleDetails();
*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Vehicles");
		int num=sc.nextInt();
		Vehicle[] V=new Vehicle[num];
		for(int i=0; i<V.length;i++) {
			System.out.println(" Enter Vehicle name");
			String name=sc.next();
			System.out.println("Enter Vehicle make year");
			int year=sc.nextInt();
			System.out.println("Enter manufacturer");
			String manufacturer=sc.next();
			V[i]=new Vehicle(name,year,manufacturer);
		}
		for(Vehicle veh:V) {
			veh.displayVehicleDetails();
			
		
			
		}
		}
	}


