package FileIO.buffered;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Write {
	private static final Path file = Paths.get("C:\\Users\\chi.pham\\JavaBasic\\JavaProgrammingMasterClass\\test2.txt");

	public static void main(String[] args) {
		Charset charset = Charset.forName("US-ASCII");
		String s = "This is test";
		
		try (BufferedWriter writer = Files.newBufferedWriter(file, charset)) {
		    writer.write(s, 0, s.length());
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}

	}
}
