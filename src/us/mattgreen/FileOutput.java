package us.mattgreen;

import java.io.*;

/**
 * Class to write to a file
 * @author Matt Green
 * @version 1.0.0
 */
public class FileOutput {

    Writer out = null;
    private String fileName;

    /**
     * Constructor to create a new instance of FileOutput
     * @param fileName The name of the file to be written to
     * @throws FileNotFoundException when fileName cannot be located
     */
    public FileOutput(String fileName) {
        this.fileName = fileName;
        try {
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));
        }
        catch(FileNotFoundException e) {
            System.out.println("File Open Error: " + fileName + " "  + e);
        }
    }

    /**
     * Method to write string to file
     * @param line the string to be written to the file
     * @throws Exception when the file cannot be written to
     */
    public void fileWrite(String line) {
        try {
            out.write(line+"\n");
        }
        catch(Exception e) {
            System.out.println("File Write Error: " + fileName + " "  + e);
        }
    }

    /**
     * Closes the output file
     */
    public void fileClose() {
        if (out != null) {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}