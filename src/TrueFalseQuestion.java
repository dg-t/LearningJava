import javax.swing.*;

public class TrueFalseQuestion extends Question {
	
	// constructor
	TrueFalseQuestion (String question, String answer) {
		
		// Call Question constructor
		super(question);
		
		// Create a new "JPanel" to organize the true/false buttons
		JPanel buttons = new JPanel();
		// Add TRUE button
		addButton(buttons,"TRUE");
		// Add FALSE button
		addButton(buttons,"FALSE");
		// Add button to the dialog box
		this.question.add(buttons);
		
		// Call initQuestionDialog to make the question modal, set its size, and set its position
		initQuestionDialog();
		
		// make answer to uppercase to facilitate validation
		answer = answer.toUpperCase();
		
		if (answer.equals("T") || answer.equals("TRUE") || answer.equals("Y") || answer.equals("YES")) {
			this.correctAnswer = "TRUE";
		} else {
			this.correctAnswer = "FALSE";
		}
	}
	
	void addButton(JPanel buttons, String label) { 
		// Create new button
		JButton button = new JButton(label);
		// Add listener to connect button with the question
		button.addActionListener(question);
		// Add button to panel
		buttons.add(button);
	}
}
