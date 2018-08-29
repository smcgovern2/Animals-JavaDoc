package us.mattgreen.test;

import junit.framework.*;
import us.mattgreen.FileInput;

public class FileInputTest extends TestCase{
    FileInput input;


    protected void setUp(){
        input = new FileInput("Test.txt");
    }

    public void testFileReadLine(){
        assertEquals("Test result 0", input.fileReadLine());
    }



}
