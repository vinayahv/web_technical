package oops;
abstract class Geometry{
	
	 abstract double calculatearea(int a);
	 abstract double calculatearea(int a, int b); 
	void display() {
		System.out.println("Prints the dimensions of geometric figure");
	}
}
class Circle extends Geometry{
	double calculatearea(int radius) {
		return 3.1415*radius*radius;
	}
	double calculatearea(int a, int b) {
		return 0.0;
	}
	
}
 class Square extends Geometry{
	 double calculatearea(int side) {
		 return side*side;
	 }
	 double calculatearea(int a, int b) {
			return 0.0;
 }
 }
 class Triangle extends Geometry{
	 double calculatearea(int base, int height) {
		 return 0.5*base*height;
	 }
	 double calculatearea(int a) {
			return 0.0;
 }
 }
public class Abstract_Class_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1=new Circle();
		System.out.println(c1.calculatearea(10));
		c1.display();
		Square s1=new Square();
		System.out.println(s1.calculatearea(10));
		s1.display();
		Triangle t1=new Triangle();
		System.out.println(t1.calculatearea(5,10));
		t1.display();
		//Geometry g1=new Geometry();  //no object for abstract class
		Geometry g2=new Circle();
		System.out.println(g2.calculatearea(3));
		g2.display();

	}
		
}
 
