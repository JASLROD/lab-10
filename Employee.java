
/**
 * Represents an Employee who is also a Person.
 * Includes additional attributes like hire year and employee ID number.
 * Provides methods to retrieve service years and employee-specific information.
 *
 * @author Jasmin Leonrodriguez, jleonrodriquez@student.sdccd.edu
 * @version v1.0
 * @since 5/13/2025
 */
public class Employee extends Person //create an Employee class that extends Person
{

    private int hireYear;//- integer called hireYear
    private String idNum;//- String called idNum

    /**
     * Default constructor that initializes the employee with default values:
     * name set by Person, hire year set to 0, and ID set to "Onboarding".
     */
    public Employee()
    {
        super();
        hireYear = 0;
        idNum = "Onboarding";
    }

    /**
     * overloaded conctructor
     * Constructs an Employee with the specified name, hire year, and ID number.
     *
     * @param name     The name of the employee.
     * @param hireYear The year the employee was hired.
     * @param idNum    The employee's ID number.
     */
    public Employee(String name, int hireYear, String idNum)
    {
        super(name);
        this.hireYear = hireYear;
        this.idNum = idNum;
    }

    /**
     * Compares this employee to another object for equality based on ID number.
     *
     * @param o The object to compare to.
     * @return true if the object is an Employee and has the same ID number (case-insensitive), false otherwise.
     */
    public boolean equals (Object o)//use hint in directions
    {
        boolean isEqual = false;
        if (o != null && getClass() ==o.getClass())
        {
            Employee copy = (Employee)o;
            if(idNum.equalsIgnoreCase(copy.idNum))
                isEqual = true;
        }
        return isEqual;
    }

    /**
     * Calculates the number of years the employee has been with the company.
     *
     * @return The difference between the current year and the hire year.
     */
    public int getServiceYears()
    {
        return(CURRENT_YEAR - hireYear);
    }

    /**
     * Sets the hire year for the employee.
     *
     * @param hireYear The year the employee was hired.
     */
    public void setHireDate(int hireYear)
    {
        this.hireYear = hireYear;
    }  

    /**
     * Retrieves the employee's hire year.
     *
     * @return The year the employee was hired.
     */
    public int getHireDate()
    {
        return hireYear;
    }  

    /**
     * Sets the employee's ID number.
     *
     * @param idNum The new ID number to assign to the employee.
     */
    public void setIdNum(String idNum)
    {
        this.idNum = idNum;
    }   

    /**
     * Retrieves the employee's ID number.
     *
     * @return The ID number of the employee.
     */
    public String getIdNum()
    {
        return idNum;
    }   

    /**
     * Returns a string representation of the Employee object, including
     * name, ID number, hire year, and years of service.
     *
     * @return A formatted string with employee details.
     */
    public String toString()
    {
        String str = super.toString()+ String.format("\nID Number: %s", idNum) + String.format("\nYear Hired: %d,", hireYear)+ String.format("\tYears of Service: %d,", getServiceYears());
        return str;
    }   
}

