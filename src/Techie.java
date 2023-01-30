public class Techie {
	private String name;
	private int questionsAsked;
	
	public Techie (String name) {
		this.name = name;//invokes string name
	}
	
	public String getName() {
		return name; //returns name specified in code
	}
	
	public int getNumberOfQuestions() {
		return questionsAsked; //Prints questions asked when called
	}
	
	public void askQuestion() {
		questionsAsked++; //keeps track of when each method is called
	}
	
	public boolean isOdd(int num) {
		askQuestion();//increments questions asked
		return num % 2 != 0;//returns equation to find if number is odd
	}
	
	public String reverse(String text) {
		askQuestion();
		String result = "";//stores string variable
		for(int i = text.length() - 1; i >= 0; i--) {//loop statement for reversing a string
			result += text.charAt(i);
		}
		return result; //prints result
	}
	
	public int doFactorial(int num) {
		return num == 0 ? 1 : (num * doFactorial(num - 1));//uses tertiary statement to get the sum for factorial equation and returns it
	}
	
	public int factorial(int num) {
		askQuestion();
		return doFactorial(num);//calls the doFactorial method and returns sum here to prevent counting extra questions during the loop.
	}
	
	public boolean isAlpha(char letter) {
		askQuestion();
		return letter >= 'a' && letter <= 'z' || letter >= 'A' && letter <= 'Z';//finds if entered character is within the given parameters
	}
	
	public int smallest(int num1, int num2, int num3) {
		askQuestion();
		int smallest = 0;//this method uses boolean to determine the lesser of 3 numbers
		if (num1 < num2 && num1 < num3) {
			smallest = num1;
		} else if (num2 < num1 && num2 < num3) {
			smallest = num2;
		} else if (num3 < num1 && num3 < num2) {
			smallest = num3;
		}
		return smallest;
	}
	
	public boolean isPrime(int num) {
		askQuestion();
		boolean flag = true;
		for (int i = 2; i <= num; ++i) {//uses boolean and loop to determine whether number is prime or not
			if (num % i == 0) {
				flag = true;
			} else {
				flag = false;
			}
		}
		return flag; //returns answer
	}
}