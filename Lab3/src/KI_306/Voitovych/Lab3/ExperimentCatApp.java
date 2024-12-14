/**
 * 
 */
package KI_306.Voitovych.Lab3;


/**
 * ExperimentCatApp is main Class
 */
public class ExperimentCatApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ExperimentCat ShredingCat = new ExperimentCat("Shred", "british", "0987654321", "Shreding", true, "room");
		
		ShredingCat.status();
		ShredingCat.mew();
		ShredingCat.setPlace();
		
		ShredingCat.putPoison();
		ShredingCat.checkExperiment();
		ShredingCat.Box();
		ShredingCat.outPoison();
		ShredingCat.checkExperiment();
		ShredingCat.putPoison();
		ShredingCat.checkExperiment();

	}

}
