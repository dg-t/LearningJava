
public class Params {
	
	// Define the adult() method passing the formal parameter.
	public static void adult(int formalAge, String formalName, boolean formalIsAdult) {
		
		String output;
		
		if (formalIsAdult) {
			output = "is an adult.";
		}
		else {
			output = "is not an adult";
		}
		
		System.out.println(formalName + " is " + formalAge + " years old.\n" + formalName + " " + output);
	}
}
