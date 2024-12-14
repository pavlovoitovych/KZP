package KI306.Voitovych.Lab6;
/**
* Box implements a box
*/
public class Box implements Item {
    private int weight;

    /**
	* Constructor
	* @param <code>weight</code> weight
     */
    public Box(int weight) {
        this.weight = weight;
    }
    /**
     * Method returns the info about object
     */

    @Override
    public String info() {
        return "Box: weight=" + weight;
    }
    
    /**
     * Method returns the weight box
     */
	@Override
	public int getSize() {
		return weight;
	}
}
