package us.mattgreen;

/**
 * an abstract class representing a pet
 * @author Matt Green
 * @version 1.0.0
 */
public abstract class Pet {
    protected String name;

    /**
     * Constructor to create a new instance of Pet
     * @param name The name of the pet
     */
    public Pet(String name) {
        this.name = name;
    }

    /**
     * Method to get the name of a Pet
     * @return the name of Pet as a string
     */
    public String getName() {
        return name;
    }


}