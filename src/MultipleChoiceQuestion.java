import javax.swing.JOptionPane;

public class MultipleChoiceQuestion {
	
	// class variables
	static int nQuestions = 0;
	static int nCorrect = 0;
	
	// instance variable
	String question;
	String correctAnswer;
	
	// Constructor
	MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
		
		// initialize the question 
		question = query+"\n";
		question += "A. " + a + "\n";
		question += "B. " + b + "\n";
		question += "C. " + c + "\n";
		question += "D. " + d + "\n";
		question += "E. " + e + "\n";
		
		// initialize the correct answer
		correctAnswer = answer.toUpperCase();
	}
	
	// Define instance method of MultipleChoiceQuestion to ask a question until user input a valid answer
	
	String ask() {
				
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
	
	// Define instance method of MultipleChoiceQuestion to check if answer is correct
	void check() {
				
		// Increment number of question for each question asked
		nQuestions++;
		// Get returned valid answer from the ask method
		String answer = ask();
				
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
	
	// Define class method to display number of questions and correct answers
	public static void showResults() {
		JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + " questions");	
	}
}
