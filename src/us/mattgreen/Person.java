package us.mattgreen;

/**
 * Abstract class representing a person
 * @author Matt Green
 * @version 1.0.0
 */
public abstract class Person {
    private String name;

    /**
     * Constructor to create a new instance of person
     * @param name the name of the person
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     * Get the name of the Person
     * @return the name of Person as a string
     */
    public String getName() {
        return name;
    }

    /**
     * Assigns a new name to person
     * @param name the name to be assigned to person
     */

    public void setName(String name) {
        this.name = name;
    }


}