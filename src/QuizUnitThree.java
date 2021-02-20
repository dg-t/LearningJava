import javax.swing.JOptionPane;

public class QuizUnitThree {
	
	// static member variables
	static int nQuestions = 0;
	static int nCorrect = 0;
	
	// Define method to ask a question until user input a valid answer
	static String ask(String question) {
		
		while (true) {
			// Store answer in upper case
			String answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();
			boolean valid = (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E"));
			
			// Check if answer is valid or not. If valid return answer
			if (valid) return answer;
			JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D, or E.");
			}
		}
	
	
	// Define method to check if answer is correct
	static void check(String question, String correctAnswer) {
		
		// Increment number of question for each question asked
		nQuestions++;
		// Get returned valid answer from the ask method
		String answer = ask(question);
		
		// Check if answer is correct
		if (answer.equals(correctAnswer)) {
			JOptionPane.showMessageDialog(null,"Correct!");
			// Increment number of correct answers
			nCorrect++;
			} 
		else {
			JOptionPane.showMessageDialog(null,"Incorrect. The correct answer is "+correctAnswer+".");
			}
		}
	
	public static void main(String[] args) {
		
		}
	}