
/**
 * Write a description of class Person here.
 *
 * @author Jasmin Leonrodriguez, jleonrodriquez@student.sdccd.edu
 * @version v1.0
 * @since 5/13/2025
 */
public class Person
{
    // instance variables - replace the example below with your own
    private String name;//- name: String
    public final static int CURRENT_YEAR = 2025;//+ CURRENT_YEAR: int //set to 2025 (Is final and static)


    /**
     * Constructor for objects of class Person
     */
    public Person() 
    {
        // initialise instance variables
        name = "No name yet";// name set to "No name yet"
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Person(String name)
    {
        // put your code here
        this.name = name;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setName(String name)
    {
        // put your code here
        this.name = name;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public getName()
    {
        // put your code here
        return x + y;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String toString()
    {
        String str;
        str = "Name" +  + "\nID Number: " + +"Years Of Service: "+ +"\nSalary: " + ;// put your code here
        return str;
    }
}
