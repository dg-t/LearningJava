import java.util.Scanner;

/**
 * Give an example of a while loop, then provide the equivalent do-while loop and for loop.  
 * Then give a different example of a do-while loop, along with the equivalent while loop and for loop. 
 * Finally, give an example of a for loop, along with the equivalent while loop and do-while loop. 
 * Use your examples to illustrate the advantages and disadvantages of each looping structure, and describe those advantages and disadvantages.
 * 
 * TODO: if needed, comment all loops that do not need to run.
 * @author kakashi
 *
 */

public class Loops {

	public static void loopsExamples() {
		
		// EXAMPLE ONE
		// WHILE >> DO-WHILE >> FOR
		
		/*
		 * In this example, we want to loop through 6 random numbers until we get the value 6.
		 * Please, the code repetition for the variable dice in the while loop is there only to show that if the dice would be 6 from the first moment, the loop would never start. The variable could only be declared, and not initialized, or hard coded.
		 * */
		
		// WHILE LOOP
		
		int diceOne = (int) Math.ceil(Math.random() * 6);
		while (diceOne != 6) {
			diceOne = (int) Math.ceil(Math.random() * 6);
			if (diceOne == 6) {
				System.out.println("Your number is: " + diceOne + ". You win.");
			}
			else {
				System.out.println("Your number is: " + diceOne + ". You loose.");
			}			
		}
		
		
		// For the DO- WHILE loop I did not initialized the value of the dice as the DO code block will anyway always run at least once. Therefore, I choose to initialize the variable inside the DO block.
		// DO - WHILE LOOP
		
		int diceTwo;
		do {
			diceTwo = (int) Math.ceil(Math.random() * 6);
			if (diceTwo == 6) {
				System.out.println("Your number is: " + diceTwo + ". You win.");
			}
			else {
				System.out.println("Your numbner is: " + diceTwo + ". You loose.");
			}	
		}
		while (diceTwo != 6);
		
		
		/* For the FOR LOOP, we need to specify a counter. Therefore, the loop will not run forever until a condition is met, instead, will run a specific number of time. However, we do can exit the loop if a certain condition is met.
		 * In the follow example, for instance, we give three opportunity to to a player the get the number 6. If the player does not get the value of 6 in any of the three opporunity, the loop will exit and the player looses.
		 * However, if the player get the value of 6, the loop wil
		 * */
		// FOR LOOP
		
		int diceThree;
		for (int i = 0; i < 3; i++) {
			diceThree = (int) Math.ceil(Math.random() * 6);
			if (diceThree == 6) {
				System.out.println("Your number is: " + diceThree + ". You win.");
				break;
			}
			else {
				System.out.println("Your number is: " + diceThree + ". You lose.");
			}	
		}
		
		
		
		
		
		
		// EXAMPLE TWO
		// DO-WHILE >> WHILE >> FOR
		
		/**
		 * For this example I choose to use a String instead of an integer, and ask for some input from the console to a user.
		 * The code inside the DO block will always run.
		 */
		
		// DO - WHILE LOOP
		
		Scanner messageOne = new Scanner(System.in);
		String favouriteColorOne = "green";
		String answerOne;
		
		do {
			System.out.println("What is my favourite colour? Red, blue, or green?");
			answerOne = messageOne.nextLine();	
		}
		while (!answerOne.equals(favouriteColorOne));
		
		System.out.println("That's correct. Exiting the loop.");
		messageOne.close();
		
		
		/* With the WHILE LOOP below, if the user get th answer correct in the first attempt, the WHILE loop will never be entered.
		 * However, if the first attempt is incorrect, the program will enter the while loop until the user unput the correct answer.
		 */
		// WHILE LOOP
		
		System.out.println("What is my favourite colour? Red, blue, or green?");
		Scanner messageTwo = new Scanner(System.in);
		String favouriteColourTwo = "green";
		String answerTwo = messageTwo.nextLine();
		
		if (answerTwo.equals(favouriteColourTwo)) System.out.println("That's correct. No loop needed.");
		
		while(!answerTwo.equals(favouriteColourTwo)) {
			System.out.println("What is my favourite colour? Red, blue, or green?");
			answerTwo = messageTwo.nextLine();
			if (answerTwo.equals(favouriteColourTwo)) {
				System.out.println("That's correct. Exiting the loop.");
			}
		}
		messageTwo.close();
		
		
		
		/* For the FOR LOOP we need to have a fixed number of times for the user to enter the correct answer. 
		 * Below, I choose to give the user a maximum of 3 attempt. If the answer is correct before the 3 attempt are ended, the loop will exit automatically. However, if the answer are not correct after three attempt, the user will loose.
		 */
		// FOR LOOP
		
		for (int i = 0; i < 3; i++) {
			System.out.println("What is my favourite colour? Red, blue, or green?");
			Scanner messageThree = new Scanner(System.in);
			String favouriteColourThree = "green";
			String answerThree = messageThree.nextLine();
			
			if (answerThree.equals(favouriteColourThree)) {
				System.out.println("That's correct. Exiting the loop.");
			}
			else if (i == 2) {
				System.out.println("No more chances. The loop has finished.");
			}
			messageThree.close();
		}
		
		
		
		
		
		
		// EXAMPLE THREE
		// FOR >> WHILE >> DO-WHILE
		
		// Below a backward counter as example for a FOR LOOP. The counter counts from 10 to 1, and once get to the value 1, it prints out GO GO GO.
		// FOR LOOP
		
		for (int counterOne = 10; counterOne > 0; counterOne--) {
			System.out.println(counterOne);
			if (counterOne == 1) {
				System.out.println("Go Go Go");
			}
		}
		
		
		// The below while loop works exactly as the above for loops as the condition has a fixed number of iterations, just the syntax is a little different.
		// WHILE LOOP
		
		int counterTwo = 10;
		while (counterTwo > 0) {
			System.out.println(counterTwo);
			if (counterTwo == 1) {
				System.out.println("Go Go Go");
			}
			counterTwo--;
		}
		
		
		// The DO WHILE LOOP below also works exactely as the FOR and the WHILE LOOPS above. The only difference is the syntax, and the fact that even if the variable i would be initialized with value 0 for example, the DO block will still run once.
		// DO - WHILE LOOP
		
		int counterThree = 0;
		do {
			System.out.println(counterThree);
			if (counterThree == 1) {
				System.out.println("Go Go Go");
			}
			counterThree--;
		}
		while (counterThree > 0);
		
		
		
		
		/*
		 * Bottom line, I would use the WHILE LOOP if I do not know the number of times a loop needs to run.
		 * I would use the DO-WHILE LOOP if I do not know the number of time the loop need to run, and I need to ensure that the code inside the loop will run at least once.
		 * I would use the FOR LOOP if I know in advance how many time, maximum, I need to run the loop.
		 * */
	}
}

