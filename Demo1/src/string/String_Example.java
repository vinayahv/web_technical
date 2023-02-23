package string;

public class String_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String();
		String str1=new String("Amarendranath");
		System.out.println(str+" "+str1);
		String str3=" ";
		String str4="There was a king";
		//System.out.println(str4[0]); never treate as an array
		System.out.println(str4.charAt(0));
		char ch1=str4.charAt(3);
		System.out.println(ch1);
		for(int i=0;i<str4.length();i++) {
			System.out.print(str4.charAt(i)+" "); // println
		}
			String str5="there";
			System.out.println(str4.contains(str5));
			System.out.println(str4.contains("There"));
			System.out.println(str4.toLowerCase());
			System.out.println(str4.toUpperCase());
			if(str4.toLowerCase().contains(str5.toLowerCase())) {
				System.out.println("found");
			}
			else {
				System.out.println("Not found");
			}
			String str6="  MyHouse  ";
			String str7=str6.trim();  //Removes beginnig & ending spaces
			System.out.println(str6);
			System.out.println(str7);
			str4="There was a king called as Maurya i";
			int wordcount=0;
			for(int i=0;i<str4.length()-1;i++) {
				 if(str4.charAt(i)==' '&& str4.charAt(i+1)!=' '&& (i+1)==str4.length()-1) {
					wordcount++;
				 }
				else if(str4.charAt(i)==' ') {
					continue;
				}
				else if(str4.charAt(i+1)==' ') {
					wordcount++;
				}
				else if((i+2)==str4.length()) {
					wordcount++;
				}
			}
			
			System.out.print(wordcount);
				
			}
		}

	


