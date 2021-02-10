
import javax.swing.JOptionPane;

public class SuperPower {
	
	public static void power() {
		/**
		 * Ask input to a user, and show message with the input in upper case.
		 */
		// Get user input SuperPower
		String power = JOptionPane.showInputDialog("What is your super power?");
		power = power.toUpperCase();
		
		// Celebrate user input SuperPower
		JOptionPane.showMessageDialog(null,power + " TO THE RESCUE!");
	} 
}