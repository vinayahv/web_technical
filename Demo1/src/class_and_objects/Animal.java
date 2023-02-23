package class_and_objects;

public class Animal {
	int legs;
	int tail;
	String sound,food;
	void makesSound() {
		System.out.println("Does"+sound);
	}
	void eats() {
		System.out.println("eats"+food);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal cow=new Animal();
		cow.legs=4;
		cow.tail=1;
		cow.sound="MOOS";
		cow.food="GROSS";
		cow.makesSound();
		cow.eats();
		
		Animal tiger=new Animal();
		tiger.legs=4;
		tiger.tail=1;
		tiger.sound="ROAR";
		tiger.food="MEAT";
		tiger.makesSound();
		tiger.eats();
	}

}
