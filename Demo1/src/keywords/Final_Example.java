package keywords;
class Final1{
	Final1(){
		}
	String name;
	final String college="My college";
	Final1(String name){
		this.name=name;
	}
	Final1(String name,String college){
		this(name);
		//this.college=college; - Shows error declared as final
		}
	void display() {
		System.out.println(this.name+" "+this.college);
	}
	final void mymethod()
{
	System.out.println("This is parent method");
}

}
class Final2 extends Final1{
	//String college1="Our college";
	//Final2(){
	//}
	//Final2(String name,String college){
	//void mymethod() {
	//	System.out.println("This is child method ");// not allowed to override
		void calculate(final int a,int b) {
			//a+=10;
			b=a+b;
			System.out.println(b);
		}
	}

public class Final_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final1 f1=new Final1("Amit","His college");
		f1.display();
		//f1.college="His college"; //shows error
	System.out.println((new Final2()).college);
	(new Final2()).calculate(10,15);
		
	}

}
