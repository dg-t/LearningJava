import java.awt.*;
import javax.swing.*;

public class MultipleChoiceQuestion extends Question {
	
	// Constructor
	MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
		
		// Call Question constructor
		super(query);
		
		// Call addChoice() method
		addChoice("A",a);
		addChoice("B",b);
		addChoice("C",c);
		addChoice("D",d);
		addChoice("E",e);
		
		// Perform the rest of the initialization of the dialog box
		initQuestionDialog();
				
		// initialize the correct answer
		correctAnswer = answer.toUpperCase();
	}
	
	// Create answers choices
	void addChoice(String name, String label) { 
		// Create panel for the button and label
		JPanel choice = new JPanel(new BorderLayout());
		// Create a button
		JButton button = new JButton(name);
		
		// Add listener to connect button with the question
		button.addActionListener(question);
		// Add button to the left of the panel
		choice.add(button,BorderLayout.WEST);
		
		// Add answer label to the center of the panel
		choice.add(new JLabel(label + " ", JLabel.LEFT),BorderLayout.CENTER);
		
		// Add this panel to the dialog boc
		question.add(choice);
	}
}
