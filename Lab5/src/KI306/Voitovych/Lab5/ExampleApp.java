/**
 * 
 */
package KI306.Voitovych.Lab5;

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
					Writer wr = new Writer(eq.calculate());
					wr.wrBin("Res.bin");
					System.out.println("Res bin: "+wr.rdBin("Res.bin")); 
					wr.wrTxt("Res.txt");
					System.out.println("Res txt: "+wr.rdTxt("Res.txt")); 
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
