/**
 * 
 */
package KI306.Voitovych.Lab6;

import java.util.ArrayList;

/**
 * Conveyor is main class
 */
public class Conveyor<T extends Item> {
	private ArrayList<T> items;
	
	/**
     * Constructor
     */
    public Conveyor() {
        items = new ArrayList<>();
    }

    /**
     * Method for add item
     * @param <code>item</code> item.
     */
    public void addItem(T item) {
        items.add(item);
    }

    /**
     * Method for add item
     */
    public T removeItem() {
        if (!items.isEmpty()) {
            return items.remove(0);
        }
        return null; 
    }

    /**
     * Method for check a item
     */
    public boolean hasItems() {
        return !items.isEmpty();
    }

    /**
     * Method for find a minimum object.
     */
    public T findMin() {
        if (items.isEmpty()) {
            return null;
        }

        T min = items.get(0);
        for (T item : items) {
        	if (item.getSize() < min.getSize()) {
        		 min = item;
        	}
        }
        return min;
    }

    /**
     * Method for count object
     */
    public int getItemCount() {
        return items.size();
    }
}
