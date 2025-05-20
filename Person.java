
/**
 * Represents a Person with a name.
 * Provides methods to set and retrieve the person's name.
 * Also includes a constant for the current year.
 * 
 * @author Jasmin Leonrodriguez, jleonrodriquez@student.sdccd.edu
 * @version v1.0
 * @since 5/13/2025
 */
public class Person
{
    private String name;//- name: String
    public final static int CURRENT_YEAR = 2025;//+ CURRENT_YEAR: int //set to 2025 (Is final and static)

    /**
     * Default constructor that initializes the person's name to "No name yet".
     */
    public Person() 
    {

        name = "No name yet";// name set to "No name yet"
    }

    /**
     * overloaded constructor
     * Constructs a Person object with a specified name.
     *
     * @param name The name to assign to the person.
     */
    public Person(String name)
    {

        this.name = name;
    }

    /**
     * Sets the person's name to the specified value.
     *
     * @param name The new name for the person.
     */
    public void setName(String name)
    {

        this.name = name;
    }

    /**
     * Retrieves the person's name.
     *
     * @return The current name of the person.
     */
    public String getName()
    {

        return name;
    }

    /**
     * Returns a string representation of the Person object.
     *
     * @return A formatted string containing the person's name.
     */
    public String toString()
    {
        String str = String.format("Name: %s", name);
        return str;
    }
}
