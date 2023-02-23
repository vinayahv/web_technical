package Datatypes;

public class Enum_Example {
	
	enum Days{Monday,Tuesday,Wensday,Thursday,Friday,Saturday}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Days d=Days.Monday;
		System.out.println(d);
		System.out.println(d.values());
		System.out.println(d.valueOf("Tuesday"));
		for(Days d1:Days.values()) {
			System.out.println(d1);
		}
	}

}
