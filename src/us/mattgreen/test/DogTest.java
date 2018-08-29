package us.mattgreen.test;


import junit.framework.*;
import us.mattgreen.Dog;

public class DogTest extends TestCase {

    Dog dog1;
    public DogTest(){}

    protected void setUp(){
        dog1 = new Dog(true, "Spot");
    }

    public void testIsFriendly(){
        assertTrue(dog1.isFriendly());
    }

    public void testTalk(){
        assertSame("Bark", dog1.talk());
    }


}
