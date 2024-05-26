package week04CodingProject;


public class Week04Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = {3,9,23,64,2,8,28,93};  
		
		System.out.println("1a. - First element subtracted from last = " + ( ages[ages.length-1] - ages[0]));  // subtract first element from last and print
		
		int[] ages2 = {4,23,77,34,87,14,51,42,44}; // create new 9 element int array
		
		System.out.println("1b. - The result of subtracting first element from last is: " + (ages2[ages2.length-1] - ages2[0]));	// subtract first element from last and print		
		
		// calculate average age of ages2 array elements
		int ageSum = 0; //define summation variable
		
		for(int i=0; i < ages2.length; i++) {  //index through the array and calculate sum
			ageSum += ages2[i];
			} 
		System.out.println("1c. - The average age in ages2 is: " +(ageSum / ages2.length));  // calculate average age and print
		
	// 2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally","Buck","Bob"};
		
		// calculate average number of letters per name
		double sum = 0.0;  		 // summation variable initialize
		for (int i =0; i < names.length; i++) {
			sum += names[i].length();          // calculate sum
		} System.out.println("2a. - The average numbers per name is: " + (sum / names.length));
		
		// using loop, concat all names together and print
		String longName = "";
		for(int i = 0; i< names.length; i ++){
			longName += (names[i] + " ");		    
			}
		System.out.println("2b. - The resulting concatination of names is: " + longName);
	
	// 3. How do you access the last element of any array? subtract - from the length of the string.
		
		System.out.println("3. The last element of the array is: " + names[names.length - 1]);
		
	// 4. How do you access the first element of any array?

		System.out.println("4. The first element of the array is element 0: " + names[0]);
		
	// 	5. Create a new array of int called name Lengths. Write a loop to iterate over the previously created names 
	// array and add the length of each name to the nameLengths array.
		
		int[] nameLengths = new int[names.length];   // set size equal to names[]
		System.out.print("5. The lenghts of the names in names are:");
		for(int i =0; i < names.length; i++) {
			nameLengths[i] = names[i].length();  //get the length and add to the element
			System.out.print(nameLengths[i] + " ");
			}	System.out.println();
		
	// 	6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. 
		//Print the result to the console.
		sum = 0;
		for(int i = 0; i < nameLengths.length; i++) {
			sum += nameLengths[i];
		}
		System.out.println("6. The sum of the elements is: " + sum);
		
	// 7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to 
		//itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		
		System.out.println("7. The resulting string is: " + concatWord("hippie", 3));
		
	//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should 
		// be the first and the last name as a String separated by a space).
		
		System.out.println("8. The resulting string is: " + makeFullName("Kevin", "Bladow"));
		
	// 	9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		
		System.out.println("9. The sum of all the ints in the array is greater than 100 is " + over100(ages));
		
	// 	10. Write a method that takes an array of double and returns the average of all the elements in the array.
		
		double[] inputDouble = {1.3, 4.5, 10.1, 44.2};   	// create array for input
		System.out.println("10. The average in the array is: " + averageNums(inputDouble));
		
	// 	11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is 
		//greater than the average of the elements in the second array.
		
		double[] newInputDouble = {7.1, 16.9, 9, 8.054};		// create additional array to pass in
		System.out.println("11. The average of the elements in the first array is greater than the averge of the second is: " + compareAverageTwoArrays(inputDouble, newInputDouble));
		
	// 	12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns 
		// true if it is hot outside and if moneyInPocket is greater than 10.50.
		
		System.out.println("12. I will buy a drink - " + willBuyDrink(true,9.35));
	
	// 13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		
		
		String[] groupOfSentences = new String[6];
		groupOfSentences[0] = "Help! I'm being held hostage!";
		groupOfSentences[1] = "No. I didn't eat your lunch.";
		groupOfSentences[2] = "I had no idea that was your cat!";
		groupOfSentences[3] = "Yes, I do like to eat pizza!";
		groupOfSentences[4] = "I really love coding in Java!"; 
		groupOfSentences[5]= "Is that the real you?";
		
		System.out.println("13. Make your own");		
		for( String Sentence : groupOfSentences) {
			if (isQuestion(Sentence) == true) {
				System.out.println("The sentence: “" + Sentence + "“ is a question.");
			} else {
				System.out.println("The sentence: “" + Sentence + "“ is not a question.");
			}
		}
						
		
		
	} // end main
	
	
	// Method for #7 - Generate a new string from an input that is concatinate on itself a number(n) of times 
	public static String concatWord(String word, int n) {
		String resultString = "";  		// initialize return value

		for(int i =0; i < n; i++) {
			resultString += word;       //concat the word to itself
		} return resultString;			// return when completed
	}
	
	// Method for # 8
	
	public static String makeFullName(String first, String last) {
		return (first + " " + last);	// build the name
		
	}
	
	
	// Method for #9 - Determine if the sum of the length of all string elements in a string array is greater than 100
	
	public static boolean over100(int[] inputArray) {
		int sum = 0; // initialize sum variable
		for( int i =0; i < inputArray.length; i ++) {  // loop through array
			sum += inputArray[i];			// add current element to sum
			} // end for
		if ( sum > 100) {return true;   // check if sum greater than 100
		} else {
			return false;
		} // end else
		}

	// Method for #10 - Calculate the average of all the elements in a double array
	public static double averageNums(double[] input) {
		double sum = 0.0;   // set variable to 0
		
		for(int i = 0; i < input.length; i++) {
			sum += input[i];	// add current element to sum
		} return (sum / input.length);	 // returns the calculated value
	}
	
	// Method for #11 - Compare the averages of the sums of the elements in two arrays
	public static boolean compareAverageTwoArrays(double[] input1, double[] input2) {
		 
		if (averageNums(input1) > averageNums(input2)) {  // check averages using Method averageNums
			return true;
		} else 
			return false;
	}
	
	// Method for #12 - Check if conditions warrant buying a drink
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) { 
		
		if(isHotOutside && moneyInPocket > 10.50) {   // checking for conditions 
		return true;
		} else return false;
	}
	
	// Method for #13 - Takes a string and returns true if the last character in the string is  a '?', false if not.  
		// This is used to check if the string is a question.  I wrote this because I could not think of anything else. 
		
	public static boolean isQuestion(String inputString) {
		
		if (inputString.charAt(inputString.length()-1) == '?') {  //check conditions
			return true;
			} else return false;
		}// end for
	
}// end class