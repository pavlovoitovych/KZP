/**
 * 
 */
package KI_306.Voitovych.Lab3;

import java.util.Random;

/**
 * ExperimentCat implements Experiment
 */
public class ExperimentCat extends Cat implements Experiment {
	private int poison = 0;
    /**
     * Constructor
     */
    public ExperimentCat() {
    	this.name = null; 
    	this.energy = 0;
    	this.food = 0;
    	this.location = null;
    	this.collar.setPresence(false);
        this.breed.setBreed("");
        this.number.setNumber("");
        this.nameMaster.setNameMaster("");
        logActivity("ExperimentCat's name: None "
        		+ "ExperimentCat's bread: None"+
        		"ExperimentCat's master: None, None"+
        		"ExperimentCat's colar: None");
    }

    /**
     * Constructor
     * @param <code>name</code> name cats
     * @param <code>breed</code> breed cats
     * @param <code>number</code> number master
     * @param <code>nameMaster</code> name master
     * @param <code>info_collar</code> info_collar
     */
    public ExperimentCat(String name, String breed, String number, String nameMaster, boolean info_collar, String location) {
    	super(name, breed, number, nameMaster, info_collar, location);
    	this.name = name; 
    	this.energy = 5;
    	this.food = 5;
    	this.location = location;
    	this.collar.setPresence(info_collar);
        this.breed.setBreed(breed);
        this.number.setNumber(number);
        this.nameMaster.setNameMaster(nameMaster);
        logActivity("ExperimentCat's name: "+name
        		+ ", ExperimentCat's bread: "+ breed +
        		", Number master: "+number + ", Name master: "+nameMaster+
        		", ExperimentCat's colar: " + info_collar);
    }
    
    /**
    * Method action put cat in the box
    */

	@Override
	public void Box() {
		// TODO Auto-generated method stub
		this.location = "Box";
        logActivity(name + " in " + location);
	}
    /**
    * Method action put poison 
    */


	@Override
	public void putPoison() {
		// TODO Auto-generated method stub
		poison = 1;
		logActivity("Poison in Box");
	}
    /**
    * Method action out poison
    */

	
	public void outPoison() {
		// TODO Auto-generated method stub
		poison = 0;
		logActivity("Poison out Box");
	}
    /**
    * Method check result experiment about Shreding Cat`s
    */

	@Override
	public void checkExperiment() {
		// TODO Auto-generated method stub
    	Random random = new Random();
    	int randomNumber = random.nextInt(2); 
    	if (poison == 1 && location=="Box") {
    		if (randomNumber == 0) {
    			logActivity(name + " is dead in experimet");
    		}
    		else {
    			logActivity(name + " is live in experiment");
    		}
    	}
    	else {
    		logActivity("Conditional for experiment is not done");
    	}
	}
	
    /**
    * Method mew() from abstract class Cat 
    */
	
	public void mew() {
		logActivity(name+" said mew");
	}

}
