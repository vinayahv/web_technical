package file_read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File_Read_Example1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream filein=new FileInputStream("D:\\Sample.txt");
		 int ch;//int ch=filein.read();   
		//System.out.println((char)ch);
		//ch=filein.read();
	//	System.out.println((char)ch);
		while((ch=filein.read())!=-1){            //(-1) = end of file
			System.out.print((char)ch);
		}
	}
}
