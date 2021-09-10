package fileIO.standardStreams;

import java.io.IOException;
import java.io.InputStreamReader;

public class ReadConsole {
	public static void main(String[] args) throws IOException {
		InputStreamReader cin = null;
		
		try {
			cin = new InputStreamReader(System.in);
			System.out.println("Enter characters, 'q' to quit" );
			char c = 0;
			while ( c != 'q') {
				c = (char) cin.read();
				System.out.println(c);
			} 
		} finally {
			if ( cin != null) {
				cin.close();
			}
		}
	}
}
