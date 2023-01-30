import java.util.Scanner;

public class AskTechie {
	public static void main (String[] args) {
		try (Scanner console = new Scanner (System.in)) {
			String choice;
			char command;
			
				printMenu();
				Techie myTechie = new Techie("Einstein"); //stating new class with name
				do {
					System.out.println("\nPlease enter a command or type ?");
					choice = console.next().toLowerCase();
					command = choice.charAt(0); //uses lower case characters for menu
					
					switch (command) {
					case 'a': 
						System.out.println(myTechie.getName());//calls get name method
					break;
					case 'b':
						System.out.println(myTechie.getNumberOfQuestions());//calls number of questions method
					break;
					case 'c':
						System.out.print("Enter a number: ");
						int num = console.nextInt();
						if (myTechie.isOdd(num)) { //calls odd or even method
							System.out.println(num + " is odd");
						} else {
							System.out.println(num + " is not odd");
						}
					break;
					case 'd':
						System.out.print("Enter a String: ");
						String input = console.next();
						
						System.out.println(myTechie.reverse(input));//calls string reverse method
					break;
					case 'e':
						System.out.print("Enter an Integer: ");
						num = console.nextInt();
						
						System.out.println(num + "! is: " + myTechie.factorial(num));//calls factorial method
					break;
					case 'f':
						System.out.println("Enter a character: ");
						input = console.next();
						char letter = input.charAt(0);
						if (myTechie.isAlpha(letter)) {//calls alphabetic method
							System.out.println("It is an alphabet");
						} else {
							System.out.println("It is NOT an alphabet");
						}
					break;
					case 'g':
						System.out.println("Enter 3 integers: ");
						int a = console.nextInt();
						int b = console.nextInt();
						int c = console.nextInt();
						System.out.println("The smallest integer is: " + myTechie.smallest(a, b, c));//calls comparison of 3 numbers method
					break;
					case 'h':
						System.out.println("Enter an integer: ");
						num = console.nextInt();
						if (myTechie.isPrime(num)) { // calls prime method
							System.out.println(num + " is prime");
						} else {
							System.out.println(num + " is not prime");
						}
					break;
					case '?':
						printMenu();
					break;
					case 'q':
					break;
					
					default:
						System.out.println("Invalid input");//error message
					}
				} while (command != 'q'); //while loop facilitates menu
		}
	}
	
	public static void printMenu() { //menu options
		System.out.print("\nCommand Options\n"
						+"-----------------------------------\n"
						+"a: get name\n"
						+"b: number of questions asked\n"
						+"c: is Odd\n"
						+"d: reverse\n"
						+"e: factorial\n"
						+"f: is Alphabetic\n"
						+"g: smallest\n"
						+"h: Is Prime\n"
						+"?: display the menu again\n"
						+"q: quit this program\n\n");
	}
}
