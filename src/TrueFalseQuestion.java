import javax.swing.JOptionPane;

public class TrueFalseQuestion extends Question {
	
	// Add ask() method for TRUE or FALSE questions
	@Override
	String ask() {
		
		while (true) {
			// Store answer in upper case
			String answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();
			boolean valid = (answer.equals("F") || answer.equals("FALSE") || answer.equals("N") || answer.equals("NO") || 
								answer.equals("T") || answer.equals("TRUE") || answer.equals("Y") || answer.equals("YES"));
					
			// Check if answer is valid or not. If valid return answer
			if (valid) {
				if (answer.equals("F") || answer.equals("FALSE") || answer.equals("N") || answer.equals("NO")) {
					answer = "FALSE";
				}
				else {
					answer = "TRUE";
				}
				return answer;
			}
			JOptionPane.showMessageDialog(null,"Invalid answer. Please enter TRUE or FALSE.");
		}
		
		
	}
	
	// constructor
	TrueFalseQuestion (String question, String answer) {
		this.question = "TRUE or FALSE: " + question;
		answer = answer.toUpperCase();
		
		if (answer.equals("T") || answer.equals("TRUE") || answer.equals("Y") || answer.equals("YES")) {
			this.correctAnswer = "TRUE";
		} else {
			this.correctAnswer = "FALSE";
		}
	}
}
