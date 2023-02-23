package file_read;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_Output_Stream_Example1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fout=new FileOutputStream("D:/FileWriteTest1.txt");
		fout.write(98);fout.write('b');
		String str="I am always the best man in the whole world";
		byte[] br=str.getBytes();
		fout.write(br);
		fout.close();

	}

}
