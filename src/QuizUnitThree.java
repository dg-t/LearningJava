import javax.swing.JOptionPane;

public class QuizUnitThree {

	// static member variables
	public static int nQuestions = 0;
	public static int nCorrect = 0;
	
	// Define method to ask a question until user input a valid answer
	static String ask(String question) {
		
		while (true) {
					
			// Store answer in upper case
			String answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();
				
			// Check if answer is valid or not. If valid return answer
			if (answer.equals("A") || answer.equals("B") || answer.contentEquals("C") || answer.contentEquals("D") || answer.contentEquals("E")) {
				return answer;
					}
			else {
				JOptionPane.showMessageDialog(null, answer + " is an invalid answer. Please enter A, B, C, D, or E.");
			}
		}
	}
	
	
	// Define method to check if answer is correct
	static void check(String question, String correctAnswer) {
		
		// Get returned valid answer from the ask method
		String answer = ask(question);
		// Increment number of question for each question asked
		nQuestions++;
		
		// Check if answer is correct
		if (answer.equals(correctAnswer)) {
			JOptionPane.showMessageDialog(null,"Correct!");
			// Increment number of correct answers
			nCorrect++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + correctAnswer);
		}
	}
}































