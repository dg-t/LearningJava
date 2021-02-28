import javax.swing.JOptionPane;

public class MultipleChoiceQuestion extends Question {
	
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
}
