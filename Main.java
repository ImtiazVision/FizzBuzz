import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Number: ");
		int number = scanner.nextInt(); // this line of code will make the scanner read the number

		if (number % 5 == 0) {
			if (number % 3 == 0)
				System.out.println("FizzBuzz");
		}
		// else if (number % 5 == 0)
		// System.out.println("Fizz");
		else if (number % 3 == 0)
			System.out.println("Buzz");
		else
			System.out.println(number);
	}
}