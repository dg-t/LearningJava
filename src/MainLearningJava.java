import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MainLearningJava {

	public static void main(String[] args) {
		// Comment class methods not needed to use
		
		////////////////////////
		// UNIT 1
		////////////////////////
		
		// WRITTEN ASSIGNMENT
		
		//SuperPower.power();
		
		
		////////////////////////
		// UNIT 2
		////////////////////////
		
		// WRITTEN ASSIGNMENT
		//Quiz.quizQuestion();
		
		// DISCUSSION ASSIGNMENT
		//Loops.loopsExamples();
		
		
		////////////////////////
		// UNIT 3
		////////////////////////
		
		// DISCUSSION ASSIGNMENT
		
		/* 
		 * Optional: declare the age variable. 
		 * It could also be hard-coded as actual parameter in the adult method() call, 
		 * or calculated as an expression. Example: currentYear - birthYear.
		 */
		// int actualAge = 30;
		
		// call the adult() method passing the actual parameter.
		// Params.adult(actualAge, "Mai", actualAge >= 21);
		

		// WRITTEN ASSIGNMENT
		
		// Ask three different question with three different correct answers
		// String question = "Who is a lion?\n";
		// question += "A. The king of the jungle\n";
		// question += "B. The king of the forrest\n";
		// question += "C. The king of the lake\n";
		// question += "D. The king of the world\n";
		// question += "E. A prince.";
		// QuizUnitThree.check(question,"A");
		
		// question = "Who is the biggest mammal in the world?\n";
		// question += "A. Blue whale.\n";
		// question += "B. Hamster.\n";
		// question += "C. Elephant\n";
		// question += "D. Tiger\n";
		// question += "E. Seagle";
		// QuizUnitThree.check(question,"A");
		
		// question = "What is Java\n";
		// question += "A. A chocolate box\n";
		// question += "B. A programming language\n";
		// question += "C. A laptop\n";
		// question += "D. Some kind of food\n";
		// question += "E. The name of a city.";
		// QuizUnitThree.check(question,"B");
		
		// JOptionPane.showMessageDialog(null, QuizUnitThree.nCorrect + " correct out of " + QuizUnitThree.nQuestions + " questions");	
		
		
		////////////////////////
		// UNIT 4
		////////////////////////
		
		// WRITTEN ASSIGNMENT
		
		// construct and use "MultipleChoiceQuestion" object.
		// Question One
		/*MultipleChoiceQuestion question = new MultipleChoiceQuestion(
				"What is a lion?",  
				"The king of the forrest.", 
				"The king of the lake.", 
				"The king of the world.", 
				"The king of the jungle.",
				"A prince.", 
				"d");
		question.check();
		*/
		
		// Question Two
		/*
		question = new MultipleChoiceQuestion(
				"Who is the biggest mammal in the world?", 
				"Blue whale.", 
				"Hamster.", 
				"Elephant.", 
				"Tiger.", 
				"Seagle.", 
				"a");
		question.check();
		*/
		
		// Question Three
		/*
		question = new MultipleChoiceQuestion(
				"What is Java?", 
				"A chocolate box.", 
				"A programming language.", 
				"A laptop.", 
				"Some kind of food.", 
				"The name of a city.", 
				"b");
		question.check();
		*/
		
		// Question Four
		/*
		question = new MultipleChoiceQuestion(
				"Who is James Gosling?", 
				"A doctor.", 
				"A chef.", 
				"The founder of Java.", 
				"A detective.", 
				"The name of a car.", 
				"c");
		question.check();
		*/
		
		// Question Five
		/*
		question = new MultipleChoiceQuestion(
				"Who was Plato?", 
				"A philosopher.", 
				"An actor.", 
				"A singer.", 
				"A football player.", 
				"A movie director.", 
				"a");
		question.check();
		*/
		
		// Show correct answer result
		/*
		MultipleChoiceQuestion.showResults();
		*/
		
		
		
		////////////////////////
		// UNIT 5
		////////////////////////
		
		// DISCUSSION ASSIGNMENT
		
		// Create a student object from the Student subclass with the inherited information from the Person superclass
		/*
		Student studentOne = new Student("Robert", 25, true);
		*/
		
		// Show work output from the subclass with the information from the subclass
		/*
		studentOne.work();
		*/
		// Show hairColor output from the subclass with the information from the superclass
		/*
		studentOne.hairColor();
		*/
		

		// WRITTEN ASSIGNMENT
		
		// construct and use "MultipleChoiceQuestion" object.
		// Question One
		/*
		Question question = new MultipleChoiceQuestion(
				"What is a lion?",  
				"The king of the forrest.", 
				"The king of the lake.", 
				"The king of the world.", 
				"The king of the jungle.",
				"A prince.", 
				"d");
		question.check();
		
		
		// Question Two
		question = new MultipleChoiceQuestion(
				"Who is the biggest mammal in the world?", 
				"Blue whale.", 
				"Hamster.", 
				"Elephant.", 
				"Tiger.", 
				"Seagle.", 
				"a");
		question.check();
		
		
		// Question Three
		question = new MultipleChoiceQuestion(
				"What is Java?", 
				"A chocolate box.", 
				"A programming language.", 
				"A laptop.", 
				"Some kind of food.", 
				"The name of a city.", 
				"b");
		question.check();
		
		
		// Question Four
		question = new MultipleChoiceQuestion(
				"Who is James Gosling?", 
				"A doctor.", 
				"A chef.", 
				"The founder of Java.", 
				"A detective.", 
				"The name of a car.", 
				"c");
		question.check();
		
		// Question Five
		question = new MultipleChoiceQuestion(
				"Who was Plato?", 
				"A philosopher.", 
				"An actor.", 
				"A singer.", 
				"A football player.", 
				"A movie director.", 
				"a");
		question.check();
		*/
		
		// construct and use "TrueFalseQuestion" object.
		// Question One
		/*
		Question booleanQuestion = new TrueFalseQuestion("Is Java fun?", "True");
		booleanQuestion.check();
		
		// Question Two
		booleanQuestion = new TrueFalseQuestion("Is learning bad?", "FALSE");
		booleanQuestion.check();
		
		// Question Three
		booleanQuestion = new TrueFalseQuestion("Are kttiens cute?", "t");
		booleanQuestion.check();
		
		// Question Four
		booleanQuestion = new TrueFalseQuestion("Is the sun green?", "n");
		booleanQuestion.check();
				
		// Question Five
		booleanQuestion = new TrueFalseQuestion("Is the universe big?", "yes");
		booleanQuestion.check();
		
		
		// Show correct answer result
		Question.showResults();
		*/
		
		
		
		////////////////////////
		// UNIT 6
		////////////////////////
		
		// DISCUSSION ASSIGNMENT
		/*
	     * In the main method we are simply creating a new MouseWhisperer object. 
	     * This will automatically run the class constructor, and as the MouseListener interface is in the constructor, 
	     * it will run the mouse methods above depending on the mouse action performed.
	     */
		
		/*
		new MouseWhisperer();
		*/
		
		
		////////////////////////
		// UNIT 7
		////////////////////////
		
		// DISCUSSION ASSIGNMENT
		
		// Autoboxing
		/*
		ArrayList<Integer> ages= new ArrayList<Integer>();   
		int age = 31;   
		// ages.add(Integer.valueOf(age)); 
		ages.add(age); 

		System.out.println(ages); 
				

		// Unboxing
		ArrayList<Integer> weights = new ArrayList<Integer>();   
		int myweight = 75;   
		weights.add(myweight);   
		// int retriveMyWeight = weights.get(0).intValue();  
		int retriveMyWeight = weights.get(0); 

		System.out.println(retriveMyWeight); 
		*/
		
		
		// WRITTEN ASSIGNMENT
		
		// construct and use "MultipleChoiceQuestion" object.
		// Question One
		Question question = new MultipleChoiceQuestion(
				"What is a lion?",  
				"The king of the forrest.", 
				"The king of the lake.", 
				"The king of the world.", 
				"The king of the jungle.",
				"A prince.", 
				"d");
		question.check();
		
		
		// Question Two
		question = new MultipleChoiceQuestion(
				"Who is the biggest mammal in the world?", 
				"Blue whale.", 
				"Hamster.", 
				"Elephant.", 
				"Tiger.", 
				"Seagle.", 
				"a");
		question.check();
		
		
		// Question Three
		question = new MultipleChoiceQuestion(
				"What is Java?", 
				"A chocolate box.", 
				"A programming language.", 
				"A laptop.", 
				"Some kind of food.", 
				"The name of a city.", 
				"b");
		question.check();
		
		
		// Question Four
		question = new MultipleChoiceQuestion(
				"Who is James Gosling?", 
				"A doctor.", 
				"A chef.", 
				"The founder of Java.", 
				"A detective.", 
				"The name of a car.", 
				"c");
		question.check();
		
		// Question Five
		question = new MultipleChoiceQuestion(
				"Who was Plato?", 
				"A philosopher.", 
				"An actor.", 
				"A singer.", 
				"A football player.", 
				"A movie director.", 
				"a");
		question.check();
		
		
		// construct and use "TrueFalseQuestion" object.
		// Question One
		Question booleanQuestion = new TrueFalseQuestion("Is Java fun?", "True");
		booleanQuestion.check();
		
		// Question Two
		booleanQuestion = new TrueFalseQuestion("Is learning bad?", "FALSE");
		booleanQuestion.check();
		
		// Question Three
		booleanQuestion = new TrueFalseQuestion("Are kttiens cute?", "t");
		booleanQuestion.check();
		
		// Question Four
		booleanQuestion = new TrueFalseQuestion("Is the sun green?", "n");
		booleanQuestion.check();
				
		// Question Five
		booleanQuestion = new TrueFalseQuestion("Is the universe big?", "yes");
		booleanQuestion.check();
		
		
		// Show correct answer result
		Question.showResults();
		
	}

}
