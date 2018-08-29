package us.mattgreen.test;

import junit.framework.*;
import us.mattgreen.Student;

public class StudentTest extends TestCase{
    Student student1;
    protected void setUp(){
        student1 = new Student(12, "Timmy" );
    }

    public void testGetAge(){
        assertTrue(12 == student1.getAge());
    }

    public void testTalk(){
        assertSame("Can we talk about my grade.", student1.talk());
    }

}
