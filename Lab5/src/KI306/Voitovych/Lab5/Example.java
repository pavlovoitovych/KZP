/**
 * Lab5
 */
package KI306.Voitovych.Lab5;


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
}
