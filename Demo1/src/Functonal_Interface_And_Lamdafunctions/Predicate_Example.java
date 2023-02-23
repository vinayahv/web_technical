package Functonal_Interface_And_Lamdafunctions;

import java.util.function.Predicate;
class Xyz implements Predicate<Integer>{
	public boolean test(Integer aa) {
		if(aa<6)
		{
			return true;
			}
		else{
			return false;
		}
		}
		}


public class Predicate_Example {
	
	static boolean checkHeight(Integer n) {
		return n>175?true:false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> aa= new Xyz();
		System.out.println("Answer from usual method:"+aa.test(5));
		
		Predicate<Integer> a = age->(age<6);  // Actually I wrote a lambda method for the abstract method test(T,t)
		System.out.println("Answer from lambda:"+a.test(5));
		
		int age = 6;
		if(a.test(age)) {
			System.out.println("Play as you wish");
		}
		else {
			System.out.println("go to school");
		}
		
		Predicate<Integer> length = Predicate_Example::checkHeight;
		int height = 167;
		 if(length.test(height)) {
			 System.out.println("Wellcome to Airforce");
		 }
		 else {
			 System.out.println("Join Engneering");
		 }
		 Predicate<Integer> bb = (vayas)->{
			 if(vayas<6) {
				 return true;
			 }
			 else {
				 return false;
			 }
			 };
			 System.out.println(bb.test(3));
		 }
	}
