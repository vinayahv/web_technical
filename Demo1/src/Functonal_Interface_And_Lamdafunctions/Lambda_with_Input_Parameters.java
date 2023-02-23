package Functonal_Interface_And_Lamdafunctions;

@FunctionalInterface
interface GamePlayable{
	void playgame(String game);
	
}
@FunctionalInterface
interface MathsWorkable{
	void workout(int a,int b);
}

@FunctionalInterface
interface Mathable{
	int calculate(int a,int b);
}

public class Lambda_with_Input_Parameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GamePlayable gp = (games)->{
			System.out.println("Playing the game: "+games);
		};
		gp.playgame("Hockey");
		GamePlayable gp1 = (games)->{
			System.out.println("Coaching the game: "+games);
		};
		gp1.playgame("cricket");
		
		MathsWorkable mw = (x,y)->{
			int c= x+y;
			System.out.println(c);
		};
		mw.workout(23,12);
		
		MathsWorkable mw1 = (x,y)->{
			int c= x*y;
			System.out.println(c);
		};
		mw1.workout(20,12);
		mw.workout(20, 12);
		
		Mathable m =(x,y)->{
			return x+y;};
			
		int b = m.calculate(33,44);
		System.out.println(b);
		
		Mathable m1 =(x,y)->(x-y);
		
		b = m1.calculate(33,44);
		System.out.println(b);

	}
		
		

	}

