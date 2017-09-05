/**
 * Represents an example class. It reads in a number and displays its square.
 *
 * <p>
 * If your description requires multiple paragraphs, put a blank line and then 
 * include the <p> tag on its own line.  End the tag with a /</p> tag 
 * </p>
 *
 * @author Mrs. Terri Kelly
 * @see	   Use this tag to refer to a closely related class 
 */

import java.util.Scanner;
public class Numbers {

	/**
	 * Reads in the double from the user and displays the square of that number,
	 * Does not iterate.
	 *
	 * @param  args unused, but required
	 *  
	 */
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.printf("Please enter a number: ");
		double num = keyboard.nextDouble();
		
		System.out.printf("\n%.2f squared is %.4f\n\n",num,Math.pow(num, 2));
		keyboard.close();
	}

}
