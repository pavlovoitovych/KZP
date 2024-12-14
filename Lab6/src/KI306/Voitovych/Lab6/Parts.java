package KI306.Voitovych.Lab6;

/**
* Parts implements a part
*/

public class Parts implements Item {
    private String object;
    private int size;

    /**
     * Constructor
     * @param <code>object</code> object
     * @param <code>size</code> size
     */

    public Parts(String object, int size) {
        this.object = object;
        this.size = size;
    }
    /**
     * Method returns the size parts
     */

	@Override
	public int getSize() {
		return size;
	}
    /**
     * Method returns the info about object
     */
	
    @Override
    public String info() {
        return "Parts: object='" + object + "', price=" + size;
    }
}
