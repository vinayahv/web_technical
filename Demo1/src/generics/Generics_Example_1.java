package generics;

import java.util.Arrays;
import java.util.List;

/*
 *  '?' - represents wild char in the parameters/arguments of a method. it helps to take  data of any generic types
 *  T  -  Type
 *  E  - Element
 *  N  - Number
 *  K - Key
 *  V - Value
 */


class Animal{
	
}
class Tiger extends Animal{
	
}
class Cat extends Tiger{
	
}
	
		public class Generics_Example_1 {
			
			static void func1(List<?>  l1) {       // here '?' is wild char, it will be ready to take any of the data of Generic types
				
				System.out.println(l1);
				
			}
			
			static <E> void func2(List<E>  l1) {       // this was already explained
				
				System.out.println(l1);
				
			}
			
			static void func3(List<? extends Tiger > l1) {       // arguments can be either objects of Tiger or objects of its sub class //  referred as upper bound
				                                                  // this method will not take objects list of super class of tiger
				System.out.println(l1);
				System.out.println("Can take object list of Tiger class or of sub class");
				
			}
			
			static void func4(List<? super Tiger > l1) {       // arguments can be either objects of Tiger or objects of its super class //  referred as lower bound
		        	                                           // this method will not take objects list of sub class of tiger
				System.out.println(l1);
				System.out.println("Can take object list of Tiger class or of super class");

		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				List<Integer> a1 = Arrays.asList(11,22,33,44,55);  // think as array coverted as list
//				System.out.println(a1);
				
//				a1.add(66);         // a1 is created by Arrays.asList method so we cannot add or modify .. so gives  exception
//				a1.remove(2);       // a1 is created by Arrays.asList method so we cannot add or modify .. so gives  exception
//				System.out.println(a1);
//				
//				List<Integer> a2 = new ArrayList<Integer>();       // a2 is created through ArrayList class , so allows additions
//				a2.add(12);
//				a2.add(23);
//				System.out.println(a2);
//				a2.add(34);
//				System.out.println(a2);
				
				func1(a1);      // here func1(0n is taking Integer list as argument
				
				List<String> str1 = Arrays.asList("abc","def","ghi","jkl");
				
				func1(str1);      // here func1() is taking string list as argument
				
				func2(a1);
				func2(str1);
				
				Animal aa1 = new Animal(); Tiger tt1 = new Tiger(); Cat cc1 = new Cat();
				
				List<Animal> an = Arrays.asList(aa1); List<Tiger> tg = Arrays.asList(tt1); List<Cat> ct = Arrays.asList(cc1);
				
			//	func3(an);                           // func3 cannot take objects list of super class of tiger .. it gives compiler error (upper bound)
				func3(tg);                           // func3 takes objects list of tiger class or its sub class
				func3(ct);                           // func3 takes objects list of tiger class or its sub class
				
				func4(an);                           // func4 takes the objects of tiger class and super class of tiger class
				func4(tg);                           // func4 takes the objects of tiger class and super class of tiger class
			//	func4(ct);                           // func3 cannot take objects list of sub class of tiger .. it gives compiler error (lower bound)

			}

		}

	