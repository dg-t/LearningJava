import javax.swing.JOptionPane;

public class MainLearningJava {

	public static void main(String[] args) {
		// Comment class methods not needed to use
		
		// UNIT 1
		// written
		//SuperPower.power();
		
		// UNIT 2
		// written
		//Quiz.quizQuestion();
		// discussion
		//Loops.loopsExamples();
		
		// UNIT 3
		// discussion
		/* 
		 * Optional: declare the age variable. 
		 * It could also be hard-coded as actual parameter in the adult method() call, 
		 * or calculated as an expression. Example: currentYear - birthYear.
		 */
		// int actualAge = 30;
		
		// call the adult() method passing the actual parameter.
		// Params.adult(actualAge, "Mai", actualAge >= 21);
		
		// UNIT 3
		// written
		// Ask three different question with three different correct answers
		QuizUnitThree.check("What is the second letter of the alphabet?\n", "B");
		QuizUnitThree.check("What is the first letter of the alphabet?\n", "A");
		QuizUnitThree.check("What is the fourth letter of the alphabet?\n", "D");
		
		// Show number of correct answer out of total answer
		JOptionPane.showMessageDialog(null, QuizUnitThree.nCorrect + " correct out of " + QuizUnitThree.nQuestions + " questions");		
		
	}

}
