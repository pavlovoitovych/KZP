/**
 * 
 */
package KI306.Voitovych.Lab4;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * ExampleApp is class-driver
 */
public class ExampleApp{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Example eq = new Example();
		    System.out.println("Enter x: "); 
			try (Scanner in = new Scanner(System.in)) {
				eq.setX(in.nextInt());
				try{	
					eq.logActivity("Result: "+String.valueOf(eq.calculate()));	
				}
				catch (ArithmeticException ex){
					System.out.println(ex.getMessage()); 
				}
				catch (IOException ex) {
					System.out.println(ex.getMessage());
				}
			}
			catch (InputMismatchException ex) {
				System.out.println("Error: Wrong type number");
			}
	}
}
