package com.promineotech;

public class Week4Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

	
		
		
	//a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. 			do not use ages[7] in your code). Print the result to the console.  
	/*
	 * I subtracted 1 from the length of the array to get the last element and used index 0 to get the first element.
	 */
		int result = ages[8-1] - ages[0]; 
		System.out.println(result);
				
	
		
	
	//b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements). 
		
		int[] ages2 = {27, 4, 6, 13, 11, 84, 62, 14, 55};

	
		
	
	//i. Make sure that there are 9 elements of type int in this new array.  

	
		
	
	//ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the 		last element of ages2). 

		int result2 = ages2[9-1] - ages2[0];
		System.out.println(result2);
		
	
		
	
	//iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).

	
		
	
	//c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
	/*
	 * 
	 * I created the variable double sum and set it equal to 0. 
	 * Then I created a for loop to iterate over the length of the ages2 array and add each element in the array to the sum.
	 * After the loop, I then created the double average variable and printed the average.
	 * 
	 */
		double sum = 0;
		
		for (int i = 0; i < ages2.length; i++) {
			sum += ages2[i];	
		}
		double average = sum / ages2.length;
		System.out.println(average);

	
		
		
	//2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

	
		
		
	//a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
	/*
	 * 
	 * used for loops to iterate over the length of names in names array and calculate the average length.
	 * 	 
	 */
		double sum1 = 0;
		for (String name : names) {
		for (int i = 0; i < names.length; i++) {
		}
			sum1 += name.length();	
		}
		double average1 = sum1 / names.length;
		System.out.println(average1);
		 
		
		
	
		//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the 				result to the console.
		/*
		 * 
		 *  I used an enhanced for loop to iterate over the names array and concatenate the names together.
		 */
		String longString = "";
		for (String name : names) {
			int counter = name.length();
			System.out.print(name + " " + longString);
		}
		
	
		
		
	//3. How do you access the last element of any array?
		
		//[length of array - 1]

	
		
		
	//4. How do you access the first element of any array?
		
		//[0]

	
		
		
	//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the 		length of each name to the nameLengths array.
		
		int[] nameLengths = new int[6];
			for (int i = 0; i < names.length; i++) {
				nameLengths[i] = names[i].length();
				System.out.print(nameLengths[i] + " ");
				}
			
				
	
			
			
	//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to 			the console.

			int sum2 = 0;
			for (int i = 0; i < nameLengths.length; i++) {
				sum2 += nameLengths[i];
			}
			System.out.println(sum2);
			
	
			
			
	//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of 			times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).

		System.out.println(repeatWord("turtle", 7));
		
	
		
		
	//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the 		last name as a String separated by a space).

		System.out.println(createName("Alex", "Freeman"));
		
	
		
		
	//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		
		int[] array = {4, 7, 9, 83, 2, 7};
		System.out.println(isSumGreaterThan100(array));
		
	
		
		
	//10. Write a method that takes an array of double and returns the average of all the elements in the array.
		
		double[] array1 = {77, 42, 13, 9, 91, 3};
		System.out.println(calculateAverage(array1));
		
	
		
		
	//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater 			than the average of the elements in the second array.

		double[] arrayA = {33, 8, 12, 4, 10};
		double[] array2 = {24, 13, 18, 3, 6};
		
		System.out.println(isArrayAAverageGreater(arrayA, array2));
		
	
		
		
	//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot 		outside and if moneyInPocket is greater than 10.50.

		boolean isHotOutside = false;
		double moneyInPocket = 11.00;
		
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
	
		
		
	//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		
		double testosteroneTotal = 817;
		double SHBG = 53;
		System.out.println(calculateFreeTestosterone(testosteroneTotal, SHBG));
		
		// I work in a hospital laboratory and we have do this manual calculation almost every day in chemistry because the equation is 				not set up to calculate on its own.
		
	
		
	//-------------------------------------------------------------Methods-------------------------------       
	
	
	}
	//7
	public static String repeatWord(String word, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += word;	
		}
		return result;	
	}
	
	//8
	public static String createName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	//9
	public static boolean isSumGreaterThan100(int[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];	
			if (sum > 100) {
			}
		}
		return true;
	}
	
	//10
	public static double calculateAverage(double[] array1) {
		double sum = 0;
		for (int i = 0; i < array1.length; i++) {
			sum += array1[i];
		}
		double average = sum / array1.length;
		return average;
	}
	
	//11
	public static boolean isArrayAAverageGreater(double[] arrayA, double[] array2) {
		double sum = 0;
		for (int i = 0; i < arrayA.length; i++) {
			sum += arrayA[i];
		}
		double average1 = sum / arrayA.length;
		for (int i = 0; i < array2.length; i++) {
			sum += array2[i];
		}
		double average2 = sum / array2.length;
		if (average1 > average2) {
			
		}
		return true;
	}
	
	//12
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.50) {	
			return true;
		} else {
			return false;
		}	
	}
	
	//13
	public static double calculateFreeTestosterone(double testosteroneTotal, double SHBG) {
		double freeTestosterone = ((testosteroneTotal / 28.84) / SHBG) * 100;
		return freeTestosterone;
	}
		
}


	

	
