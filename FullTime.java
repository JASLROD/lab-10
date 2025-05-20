
/**
 * Represents a full-time employee with a fixed annual salary.
 * Inherits basic employee details from the Employee class.
 * Adds salary-specific behavior.
 *
 * @author Jasmin Leonrodriguez, jleonrodriquez@student.sdccd.edu
 * @version v1.0
 * @since 5/13/2025
 */
public class FullTime extends Employee
{
    private double salary;

    /**
     * Default constructor that initializes the FullTime employee with default values:
     * name and ID set by superclass, salary set to 0.0.
     */
    public FullTime()
    {
        super();
        salary = 0.0;
    }
    
    /**
     * Constructs a FullTime employee with a specified name, hire year,
     * employee ID number, and salary.
     *
     * @param name   The employee's name.
     * @param year   The year the employee was hired.
     * @param idNum  The employee's ID number.
     * @param salary The annual salary of the employee.
     */
    public FullTime(String name, int year, String idNum, double salary)
    {
        super(name, year, idNum);
        this.salary = salary;
    }

    /**
     * Sets the salary for the full-time employee.
     *
     * @param salary The new annual salary to assign.
     */
    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    /**
     * Retrieves the full-time employee's salary.
     *
     * @return The current annual salary.
     */
    public double getSalary()
    {
        return salary;
    }

    /**
     * Returns a string representation of the FullTime employee,
     * including details from the superclass and salary information.
     *
     * @return A formatted string with full-time employee details.
     */
    public String toString()
    {
        String str = super.toString() + String.format("\nSalary: $%,.2f", salary);
        return str;
    }

}
