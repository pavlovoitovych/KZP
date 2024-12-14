/**
 * Lab5
 */
package KI306.Voitovych.Lab5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Writer is class for write and read result in .txt or .bin file
 */
public class Writer {
	
	private double result;
	
	/**
	 * Constructor
	 */
	
	public Writer() {
		
	}
	
	/**
	 * Constructor
	 * @param <code>result</code> result
	 */
	
	public Writer(double result) {
		this.result = result;
	}
	
	/**
	 * Method sets for result
	 */
	
	public void setResult(double result) {
		this.result = result;
	}
	
	/**
	 * Method gets for result
	 */
	
	public double getResult() {
		return this.result;
	}
	/**
	 * Method for write result in text file
	 */
	
	public void wrTxt(String fName) throws FileNotFoundException{
		PrintWriter f = new PrintWriter(fName);
		f.printf("%f ",result);
		f.close();
	}
	/**
	 * Method for read result in text file
	 */
	public double rdTxt(String fName){
		try{
			File f = new File (fName);
			if (f.exists()){
				Scanner s = new Scanner(f);
				result = s.nextDouble();
				s.close();
				return result;
			}
			else throw new FileNotFoundException("File " + fName + "not found");
		}
		catch (FileNotFoundException ex){
			System.out.print(ex.getMessage());
		}
		return result;
	}
	/**
	 * Method for write result in bin file
	 */
	
	public void wrBin(String fName) throws FileNotFoundException, IOException{
		DataOutputStream f = new DataOutputStream(new FileOutputStream(fName));
		f.writeDouble(result);
		f.close();
	}
	/**
	 * Method for read result in bin file
	 */
	
	public double rdBin(String fName) throws FileNotFoundException, IOException{
		DataInputStream f = new DataInputStream(new FileInputStream(fName));
		result = f.readDouble();
		f.close();
		return result;
	}

}
