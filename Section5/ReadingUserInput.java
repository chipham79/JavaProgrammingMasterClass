package Section5;
import java.util.Scanner;

public class ReadingUserInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your birthday: ");
		
		boolean hasNextInt = scanner.hasNextInt();
		
		if (hasNextInt) {
			int yearsOfBirth = scanner.nextInt();
			scanner.nextLine();
			
			
			System.out.println("Enter your name: ");
			String name = scanner.nextLine();
			
			
			int age = 2021 - yearsOfBirth;
			
			if ( age >= 0 && age <= 100 ) {
				System.out.println("Your name is " + name + " Your age is " + age );
			}
			else {
				System.out.println("Invalid years of birth");
			}
		} 
		else {
			System.out.println("Can not pass birthday value");
		}


		scanner.close();
	}
}

