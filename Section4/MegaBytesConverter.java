package Section4;

public class MegaBytesConverter {
	public static void main(String[] args) {
		printMegaBytesAndKiloBytes(5000);
		printMegaBytesAndKiloBytes(-1000);
		printMegaBytesAndKiloBytes(2500);
	}
	
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		if ( kiloBytes < 0 ) {
			System.out.println("Invalid Value");
		}
		else {
			// 1 MB = 1024 KB
			int megaBytes = ( kiloBytes /  1024 );
			int remainingKiloBytes = (kiloBytes - (megaBytes * 1024)); // or (kiloBytes % 1024)
			System.out.println(String.format("%s KB = %s MB and %s KB", kiloBytes, megaBytes, remainingKiloBytes));
			
		}
	}
}
