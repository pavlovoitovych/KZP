/**
 * 
 */
package KI_306.Voitovych.Lab3;

import java.io.FileWriter;
import java.io.IOException;
/**
 * Class <code>Cat</code> implements cat
 */
public abstract class Cat {

	protected String name;
	protected Breed breed;
	protected Master number, nameMaster;
	protected Collar collar;
	protected int energy;
	protected int food;
	protected String location;


    /**
     * Constructor
     */
    public Cat() {
        this.collar = new Collar();
        this.breed = new Breed();
        this.number = new Master();
        this.nameMaster = new Master();
        logActivity("Cat's name: None "
        		+ "Cat's bread: None"+
        		"Cat's master: None, None"+
        		"Cat's colar: None");
    }

    /**
     * Constructor
     * @param <code>name</code> name cats
     * @param <code>breed</code> breed cats
     * @param <code>number</code> number master
     * @param <code>nameMaster</code> name master
     * @param <code>info_collar</code> info_collar
     */
    public Cat(String name, String breed, String number, String nameMaster, boolean info_collar, String location) {
        this.collar = new Collar();
        this.breed = new Breed();
        this.number = new Master();
        this.nameMaster = new Master();
        
    	this.name = name; 
    	this.energy = 5;
    	this.food = 5;
    	this.location = location;
    	this.collar.setPresence(info_collar);
        this.breed.setBreed(breed);
        this.number.setNumber(number);
        this.nameMaster.setNameMaster(nameMaster);
        logActivity("Cat's name: "+name
        		+ ", Cat's bread: "+ breed +
        		", Number master: "+number + ", Name master: "+nameMaster+
        		", Cat's colar: " + info_collar);
    }

	/**
    * Method gets the name cat
    */

    public String getName() {
        return name;
    }
    
    /**
    * Method sets the name cat
    * @param <code>name</code> name cat
    */

    public void setName(String name) {
        this.name = name;
        logActivity("New name for cat's: " + name);
    }
    
    /**
    * Method action cat play
    * @param <code>game</code> game for cat
    */

    public void play(String game) {
    	if (game == "mouse") {
    		this.energy = this.energy - 1;
    		this.food = this.food + 1;
            logActivity(name+ " plays with mouse: energy-1, food+1");
    	}
    	else if(game == "bug") {
    		this.energy = this.energy + 1;
    		this.food = this.food - 1;
    		this.location = "bugs";
    		logActivity(name+ " plays in bug: energy+1, food-1");
    	}
    	else {
    		this.energy = this.energy - 2;
    		this.food = this.food - 1;
    		this.location = "outside";
    		logActivity(name+ " plays in outside: energy-2, food-1");
    	}
    }
    
    /**
    * Method action cat sleep
    */

    public void sleep() {
    	this.energy = this.energy +1;
        logActivity(name + " sleeps: energy+1");
    }
    
    /**
    * Method action cat clean
    */

    public void clean() {
    	this.energy = this.energy - 1;
        logActivity(name + " cleans: energy-1");
    }
    
    /**
    * Method action cat night_vision
    * @param <code>visor</code> on or off night vision
    */

    public void night_vision(boolean visor) {
    	this.energy = this.energy - 1;
        logActivity(name + " night vision "+visor+": energy-1");
    }
    
    /**
    * Method action cat mew
    */

    public abstract void mew();
    
    /**
    * Method location cat
    */

    public void setPlace() {
        logActivity(name + " in " + location);
    }
        
   
    /**
    * Method action cat eat
    */

    public void eat(String food) {
    	if (food == "fish") {
    		this.food = this.food + 1;
            logActivity(name+ " eats fish: food+1");
    	}
    	else if(food == "meat") {
    		this.food = this.food + 2;
    		logActivity(name+ " eats meat: food+2");
    	}
    	else {
    		this.food = this.food - 1;
    		logActivity(name+ " don't want to eat candy: food-1");
    	}
    }
    
    /**
    * Method cat status
    */

    public void status() {
    	if (this.energy == 5 && this.food == 5) {
    		logActivity("Status: Nice");
    	}
    	else if (this.energy < 5 || this.food < 5) {
    		logActivity("Status: "+name+" need to sleep or eat");
    	}
    	else {
    		logActivity("Status: "+name+" want to play");
    	}
    	logActivity("Level energy: " + this.energy+ ", Level food: " + this.food);
    }
    
    
    /**
    * Method information about cat
    */

    public void info_cat() {
        logActivity("Cat's name: "+name
        		+ ", Cat's bread: "+ breed.getBreed() +
        		", Number master: "+ number.getNumber() + ", Name master: "+nameMaster.getNameMaster()+
        		", Cat's colar: " + collar.getPresence() + ", Cat's energy: " + energy);
    }
        
    /**
    * Method logging info
    */

    public void logActivity(String message) {
        try (FileWriter fw = new FileWriter("cat_activity.log", true)) {
            fw.write(message + "\n");
            System.out.println(message); 
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

/**
 *  Class describing a breed of cat's
 */
class Breed {
    private String breed;
    
    /**
    * Method gets the name of breed
    */

    public String getBreed() {
        return breed;
    }
    /**
    * Method sets the name of room
    * @param <code>breed</code> name of room
    */
    public void setBreed(String breed) {
        this.breed = breed;
    }
}

/**
 *  Class describing a collar of cat's
 */
class Collar {
    private boolean collar;
    
    /**
    * Method gets the presence of a collar
    */

    public boolean getPresence() {
        return collar;
    }
    /**
    * Method sets the presence of a collar
    * @param <code>collar</code> the presence of a collar
    */

    public void setPresence(boolean collar) {
        this.collar = collar;
    }
}

/**
 *  Class describing a master of cat's
 */
class Master {
    private String nameMaster;
    private String number;
    
    /**
    * Method sets the presence of a collar
    * @param <code>collar</code> the presence of a collar
    */

    public String getNameMaster() {
        return nameMaster;
    }
    
    /**
    * Method sets the presence of a collar
    * @param <code>collar</code> the presence of a collar
    */

    public void setNameMaster(String nameMaster) {
        this.nameMaster = nameMaster;
    }
    
    /**
    * Method gets the number master
    */
    
    public String getNumber() {
        return number;
    }
    
    /**
    * Method sets the number master
    * @param <code>number</code> number master
    */

    public void setNumber(String number) {
        this.number = number;
    }
}
