package FileIO.readAndWrite;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderExample {
	public static void main(String[] args) throws IOException {
		File file = new File("HelloWord.txt");
		
		//Create a file
		file.createNewFile();
		
		//Creates a FileWriter Object
		FileWriter fileWriter = new FileWriter(file);
		
		//Write content to the file
		fileWriter.write("It's an example");
		fileWriter.flush();
		fileWriter.close();
		
		
		//Create a FileReader Object
		FileReader fReader = new FileReader(file);
		char[] a = new char[30];
		fReader.read(a); //reads the content to the array
		
		for ( char c : a) {
			System.out.println(c); // prints the characters one by one
		}
		fReader.close();
		
	}
}
