package us.mattgreen;

/**
 * This Class represents a Dog
 * @author Matt Green
 * @version 1.0.0
 */
public class Dog extends Pet implements Talkable {
    private boolean friendly;

    /**
     * Constructor to create a new dog
     * @param friendly whether or not the dog is friendly
     * @param name the name to be assigned to the dog
     */
    public Dog(boolean friendly, String name) {
        super(name);
        this.friendly = friendly;
    }

    /**
     * Tests whether a dog is friendly or not
     * @return whether or not the dog is friendly
     */
    public boolean isFriendly() {
        return friendly;
    }

    /**
     * Returns the sound that the dog makes
     * @return "Bark"
     */
    @Override
    public String talk() {
        return "Bark";
    }

    /**
     * Formats information about the dog to a string
     * @return the name of the dog and whether it is friendly
     */
    @Override
    public String toString() {
        return "Dog: " + "name=" + name + " friendly=" + friendly;
    }


}