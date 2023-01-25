import java.util.Scanner;
import java.util.String; 
import java.util.Integer;
import java.util.Random; 

public class Magic8Ball {

	static boolean testYEs(String value) {
		if(value.startsWith("y")) {
			return true;
		else {
			return false; 
		}
		}
	}
	
	static int clampToRange(int value, int lowerValue, int upperValue) {
		
		int rangeWidth = upperValue - lowerValue +1; 
		
		while(value > upperValue) {
			value -= rangeWidth; 
		}
		while(value < lowerValue) {
			value += rangeWidth; 
		}
	
	}
	
	public static void playLottery(Scanner scanner) {
		System.out.println("What is the name of your favorite pet?");
		String petName = scanner.nextLine(); 
		
		System.out.println("What is the age of your favorite pet?");
		String petAge = Integer.parseInt(scanner.nextLine()); 
	
		System.out.println("What is your lucky number?");
		String luckyNumber = Integer.parseInt(scanner.nextLine()); 
	
		System.out.println("Do you have a favorite quarterback?");
		String hasQuarterback = testYes(scanner.nextLine()); 
		
		int jerseyNumber = 0;
		if(hasQuarterback) {
			System.out.println("What is theur jersey number?");
			jerseyNumber = Integer.parseInt(scanner.nextLine());
			
		}
		
		System.out.println("What is the two-digit model year of your car?")
		int carYear = Integer.parseInt(scanner.nextLine());
		
		System.out.println("What is the name of your fav actor or actress?");
		String actorName = scanner.nextLine();
		
		System.out.println("Enter a random number between 1 and 50:");
		int chosenNumber = Integer.parseInt(scanner.nextLine());
		
		int[] randomNumbers = new Int [3];
		Random rng = new Random(); 
		for(int i=0; i<3; ++i) {
			randomNumbers[i] = rng.nextLine(65)+1;
		}
		
		int magic8Ball;
		
		if(hasQuarterback) {
			magic8Ball = jerseyNumber;
		} else {
			magic8Ball = luckyNumber + randomNumbers[0]; 
		} 
		
	
		magic8Ball = clampToRange(magic8Ball, 1, 75);
		
		
		int[] balls = new int[5];
		
		balls[0] = petName.charAt(2); 
		
		balls[1] = carYear + luckyNumber; 
		
		balls[2] = chosenNumber - randomNumber[1]; 
		
		balls[3] = actorName.charAt(0); 
		
		balls[4] = 42; 
		
		for(int i=0; i<5; ++i) {
			balls[i] = clampToRange; 
		}
		
		
		System.out.printf("Lottery numbers: %d, %d, %d, %d, %d Magic Ball: %d\n", 
				balls[0], balls[1], balls[2], balls[3], balls[4], magic8Ball); 
	
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Please enter your name:");
		String someString = scanner.nextLine(); 
		
		System.out.println("Hello" +name);
		
		System.out.println("Do you wish to continue?"); 
		String response = scanner.nextLine();
		
		if(testYes(response)) {
			do {
				playLottery(scanner); 
				System.out.println("Do you want to play again?"); 
				response = scanner.nextLine(); 
			} while(testYes(response)); 
		} else {
			System.out.println("Please return later to complete the survey"); 
		}
	}

}
