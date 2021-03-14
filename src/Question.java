import java.awt.*;
import javax.swing.*;

public abstract class Question {
	
	// Add ask() method for TRUE or FALSE questions
	String ask() {
		
		// set the question to visible
		question.setVisible(true);
		
		// return the answer
		return question.answer;
	}
	
	// class variables
	static int nQuestions = 0;
	static int nCorrect = 0;
		
	// instance variable
	QuestionDialog question;
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
	
	
	// Constructor
	Question(String question) {
		
		// Instantiate QuestionDialog
		this.question = new QuestionDialog();
		// set layout for the dialog box
		this.question.setLayout(new GridLayout(0,1));
		// Add the "question" String to the window as a "JLabel" and center it
		this.question.add(new JLabel(" " + question + " ", JLabel.CENTER));
	}
	
	// Complete question instance variable initialization
	void initQuestionDialog() { 
		// Make dialog box modal
		this.question.setModal(true);
		// Resize dialog box based on content
		this.question.pack();
		// center dialog box
		this.question.setLocationRelativeTo(null);
	}

}
