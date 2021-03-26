import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int inputlenght = readPositiveInt("Enter lenght, must be positive : ");
		int inputBound = readPositiveInt("Enter bound, must be positive : ");
		
		RandomSequence test1 = new RandomSequence(inputlenght, inputBound );
		test1.printSequence();
		System.out.println("Max: " + test1.findMax());
		System.out.println("Min: " + test1.findMin());
		
		System.out.println("Generated new sequence");
		test1.generateSequence();
		test1.printSequence();
		System.out.println("Max: " + test1.findMax());
		System.out.println("Min: " + test1.findMin());
		
		System.out.println();
		System.out.println("Program ending.");
	}
	
	private static int readPositiveInt(String message) {
		Scanner sc = new Scanner(System.in);
		
		int value;
		while(true) {
			System.out.print(message);
			value = sc.nextInt();
			if (value <= 0) {
				System.out.println("Invalid, Please try again.");
			} else 
				break;
		}
		System.out.println();
		return value;
	}

}
