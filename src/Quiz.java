import javax.swing.JOptionPane;

public class Quiz {

		
		/**
		 * Create a single question quiz, with multiple possible answers.
		 * Keep asking the user to input some answer until the answer is correct, and display a message depending on the user answer.
		 */
		
	public static void quizQuestion() {
		// Create a question
		String question = "Who is the creator of Java?\n";
		
		// Set possible answers for the question
		question += "A. James Gosling.\n";
		question += "B. Guido van Rossum.\n";
		question += "C. Brendan Eich\n";
		question += "D. Tom Hanks\n";
		question += "E. Dennis Ritchie\n";
		
		// Ask user the question until the answer is correct
		while (true) {
			
			// Store answer in upper case
			String answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();
			
			// Check if answer is correct or not, and display specific message 
			if (answer.equals("A")) {
				 JOptionPane.showMessageDialog(null,"Correct!");
				 break;
				}
			else if (answer.equals("B") || answer.contentEquals("C") || answer.contentEquals("D") || answer.contentEquals("E")) {
				JOptionPane.showMessageDialog(null,"\"Incorrect. Please try again.");
			}
			else {
				JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D, or E.");
			}
		}
	}
}
