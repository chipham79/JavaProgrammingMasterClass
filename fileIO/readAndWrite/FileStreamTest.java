package FileIO.readAndWrite;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStreamTest {
	public static void main(String[] args) {
		try {
			byte bWrite [] = {1, 2, 3, 4, 5};
			OutputStream os = new FileOutputStream("test.txt");
			for(int i = 0; i < bWrite.length; i++) {
				os.write(bWrite[i]);
			}
			os.close();
			
			InputStream is = new FileInputStream("test.txt");
			int size = is.available();
			for( int i = 0; i < size; i++) {
				System.out.println( is.read() + " ");
			}
			is.close();
		}
		catch (IOException e) {
			System.out.println("Exception");
		}
	}
}
