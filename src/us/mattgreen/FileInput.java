package us.mattgreen;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * This class receives input from a file
 * @author Matt Green
 * @version 1.0.0
 */
public class FileInput {

    private BufferedReader in = null;
    private String fileName;

    /**
     * constructor to create a new instance of FileInput
     * @param fileName the file to be read
     * @throws FileNotFoundException when fileName cannot be located
     */
    public FileInput(String fileName) {
        this.fileName = fileName;
        try {
            in = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("File Open Error: " + fileName + " " + e);
        }
    }

    /**
     * Prints all lines of the file until a blank line is reached
     * @throws Exception when method is unable to write
     */
    public void fileRead() {
        String line;
        try {
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("File Write Error: " + fileName + " " + e);
        }
    }

    /**
     * Returns a single line of the input file
     * @return a string containing the contents of a line up to any line termination or null characters
     * @throws Exception when method is unable to write
     */

    public String fileReadLine() {
        try {
            String line = in.readLine();
            return line;
        } catch (Exception e) {
            System.out.println("File Write Error: " + fileName + " " + e);
            return null;
        }
    }

    /**
     * closes the input file
     */
    public void fileClose() {
        if (in != null) {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}