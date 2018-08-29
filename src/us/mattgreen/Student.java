package us.mattgreen;

/**
 * A class representing a student
 * @author Matt Green
 * @version 1.0.0
 */
public class Student extends Person implements Talkable {
    private int age;

    /**
     * A constructor to create a new instance of student
     * @param age the age of the student in years
     * @param name the name of the student
     */

    public Student(int age, String name) {
        super(name);
        this.age = age;
    }

    /**
     * method to get age of student
     * @return the age of the student as an integer
     */
    public int getAge() {
        return age;
    }

    /**
     * Assign a new age to Student
     * @param age the age to be assigned to Student
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * method to return the sound a student makes
     * @return "Can we talk about my grade."
     */
    @Override
    public String talk() {
        return "Can we talk about my grade.";
    }
}
