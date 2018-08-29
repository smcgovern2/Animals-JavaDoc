package us.mattgreen;

/**
 * This class represents a Cat
 * @author Matt Green
 * @version 1.0.0
 */
public class Cat extends Pet implements Talkable {
    private int mousesKilled;


    /**
     * Constructor to create a new Cat
     * @param mousesKilled the number of mice the cat has killed
     * @param name the name of the cat
     */
    public Cat(int mousesKilled, String name) {
        super(name);
        this.mousesKilled = mousesKilled;
    }

    /**
     * Method to view number of mice killed by cat
     * @return number of mice killed
     */
    public int getMousesKilled() {
        return mousesKilled;
    }

    /**
     * Increases the value of mousesKilled by one
     */
    public void addMouse() {
        mousesKilled++;
    }

    /**
     * Returns the sound a cat makes
     * @return "Meow"
     */
    @Override
    public String talk() {
        return "Meow";
    }

    /**
     * Returns information about the cat
     * @return the name of the cat and number of mice killed formatted to a string
     */
    @Override
    public String toString() {
        return "Cat: " + "name=" + name + " mousesKilled=" + mousesKilled;
    }
}

