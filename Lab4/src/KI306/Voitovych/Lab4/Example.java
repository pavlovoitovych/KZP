/**
 * 
 */
package KI306.Voitovych.Lab4;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Example is class implements example cos(x)/sin(x)
 */
public class Example {
	private int x;
	/**
	 * Constructor
	 */
	public Example() {
		this.x = 0;
	}
	/**
	 * Constructor
	 * @param <code>x</code> x is a radiant
	 */
	public Example(int x) {
		this.x = x;
	}
	/**
	 * Method is sets x in class
	 * @param <code>x</code> x is a radiant
	 */
	
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * Method calculation example
	 */
	
	public double calculate() throws ArithmeticException{
		if	(Math.sin(this.x) == 0) {
			throw new ArithmeticException("Error: divine to zero");
		}
		else {
			return Math.cos(this.x)/Math.sin(this.x);
		}
	}
	/**
	 * Method log the result
	 */
	
    public void logActivity(String message) throws IOException {
        try (FileWriter fw = new FileWriter("Result.txt", true)) {
            fw.write(message + "\n");
            System.out.println(message); 
        } catch (IOException e) {
        	throw new IOException("Error: check the file");
        }
    }
}
