package oops;

class Animal{
	String name;
	int legs;
	String food;
	void eat() {
		System.out.println("Eats "+food);
	}
		void display() {
			System.out.println("My "+name+" is very good");
		}
	}
class Dog extends Animal{ //Dog inherits Animal
	void duty() {
		System.out.println("To bark stranger & guard at night");
	}
	
}
class Cow extends Animal{ //Cow inherits Animal
	void gives() {
		System.out.println(" Holy cow gives milk");
		
	}
}

public class Inheritance_Example {
	

		public static void main(String[] args) {
		// TODO Auto-generated method stub
			Animal a1=new Animal();
			a1.name="Animal";
			a1.legs=4;
			a1.food="some food";
			a1.eat();
			a1.display();
			
			Dog d1=new Dog();
			d1.name="Pummy";
			d1.legs=4;
			d1.food="Meat";
			d1.eat();
			d1.display();
			d1.duty();
			
			Cow c1=new Cow();
			c1.name="Lakshmi";
			c1.legs=4;
			c1.food="Grass";
			c1.eat();
			c1.display();
			c1.gives();
		}	
	}


