
public class Student extends Person {
	
	// instance variables
	boolean isLearning;
	String work = "student";
	String hairColor = "blond";
	
	// Student constructor inheriting from Person constructor
	Student(String name, int age, boolean isLearning) {
		super(name, age);
		this.isLearning = isLearning;
	}
	
	// define method and print the work from this same Student subclass
	public void work() {
		System.out.println("I am a " + this.work);
	}
	
	// define method and print the hairColor from the Person superclass
	public void hairColor() {
		System.out.println("My hair is " + super.hairColor);
	}
}
