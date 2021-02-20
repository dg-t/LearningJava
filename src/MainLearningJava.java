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
		String question = "What is a quiz?\n";
		question += "A. a test of knowledge, especially a brief informal test given to students\n";
		question += "B. 42\n";
		question += "C. a duck\n";
		question += "D. to get to the other side\n";
		question += "E. To be or not to be, that is the question.";
		QuizUnitThree.check(question,"A");
		
		question = "When is a quiz?\n";
		question += "A. a long, long ago\n";
		question += "B. right now\n";
		question += "C. the best of times\n";
		question += "D. the worst of times\n";
		question += "E. nevermore";
		QuizUnitThree.check(question,"B");
		
		question = "Where is a quiz?\n";
		question += "A. a galaxy far, far away\n";
		question += "B. under the sea\n";
		question += "C. right here\n";
		question += "D. there and back again\n";
		question += "E. the other side of the mountain";
		QuizUnitThree.check(question,"C");
		
		JOptionPane.showMessageDialog(null, QuizUnitThree.nCorrect + " correct out of " + QuizUnitThree.nQuestions + " questions");	
		
	}

}
