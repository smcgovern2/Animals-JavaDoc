package us.mattgreen.test;


import junit.framework.*;
import us.mattgreen.Cat;

public class CatTest extends TestCase {

    Cat cat1;
    public CatTest(){}

    protected void setUp(){
            cat1 = new Cat(0, "Tom");
    }

    public void testAddMouse(){
        assertTrue(cat1.getMousesKilled() == 0);
        cat1.addMouse();
        assertTrue(cat1.getMousesKilled() == 1);
    }

    public void testTalk(){
        assertEquals("Meow", cat1.talk());
    }


}
