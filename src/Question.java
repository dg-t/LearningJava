import javax.swing.JOptionPane;

public abstract class Question {
	
	// Abstract declaration for the ask() method
	abstract String ask();
	
	// class variables
	static int nQuestions = 0;
	static int nCorrect = 0;
		
	// instance variable
	String question;
	String correctAnswer;
	
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
			JOptionPane.showMessageDialog(null,"Incorrect. The correct answer is " + correctAnswer + ".");
		}
	}
	
	// Define class method to display number of questions and correct answers
	public static void showResults() {
		JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + " questions");	
	}	

}
