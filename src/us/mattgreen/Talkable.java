package us.mattgreen;

/**
 * an interface to be implemented by objects that can make noise/speak through a talk method
 * @author Matt Green
 * @version 1.0.0
 */
public interface Talkable {
    /**
     * A method to return the sound the talkable object makes
     * @return the sound the talkable makes as a string
     */
    String talk();

    /**
     * A method to get the name of a talkable object
     * @return the name of the talkable object
     */
    String getName();
}
