package file_read;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Buffered_Reader_Example {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			BufferedReader bufread=new BufferedReader(new FileReader("D:/sample.txt"));
			String str=bufread.readLine();
			System.out.println(str);
			str=bufread.readLine();
			System.out.println(str);
			
			while((str=bufread.readLine())!=null) {
				System.out.println(str);
			}

	}

}
