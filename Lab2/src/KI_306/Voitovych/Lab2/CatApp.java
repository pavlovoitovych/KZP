package KI_306.Voitovych.Lab2;
import java.util.Random;

/**
 * Клас CatDriver для тестування класу Cat.
 */
public class CatApp {
	
	/**
	 * @param args
	 */
    public static void main(String[] args) {
    	Random random = new Random();
    	int randomNumber = random.nextInt(3); 
        String food[] = {"fish", "meat", "candy"};
        String game[] = {"mouse", "bug", "village"};
        
        
        Cat myCat = new Cat("Ben", "british", "0987654321", "John", true, "home");

        myCat.play(game[randomNumber]);
        myCat.sleep();
        myCat.clean();
        myCat.eat(food[randomNumber]);
        myCat.setName("Raccon");
        myCat.night_vision(true);
        myCat.info_cat();
        myCat.status();
        myCat.mew();
        myCat.setPlace();
    }
}
