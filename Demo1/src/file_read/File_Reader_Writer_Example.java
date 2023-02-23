package file_read;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_Reader_Writer_Example {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fin=new FileReader("D:/sample.txt");
		FileWriter fout=new FileWriter("D:/FileWriteTest2.txt");
		int ch;
		while((ch=fin.read())!=-1) {
			fout.write(ch);
		}
		fout.write(" The Lion is the king of Jungle");
		String str=" Always the morning star/evening star is venus";
		fout.write(str);
		
		fin.close();
		fout.close();
		}
}
