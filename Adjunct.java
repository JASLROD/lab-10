
/**
 * Represents an Adjunct employee, a type of part-time employee paid by the hour.
 * Inherits common employee attributes from the Employee class and adds
 * hourly-specific fields and salary calculation.
 *
 * @author Jasmin Leonrodriguez, jleonrodriquez@student.sdccd.edu
 * @version v1.0
 * @since 5/13/2025
 */
public class Adjunct extends Employee
{
    private double hours, hrRate;

    /**
     * Default constructor that initializes the Adjunct employee with default values:
     * name and ID set by the superclass, hours set to 0.0, and hourly rate left uninitialized.
     */
    public Adjunct()
    {
        super();
        hours = 0.0;
    }

    /**
     * Constructs an Adjunct employee with the specified name, hire year,
     * employee ID number, number of hours worked, and hourly rate.
     *
     * @param name   The name of the adjunct.
     * @param year   The year the adjunct was hired.
     * @param idNum  The ID number of the adjunct.
     * @param hours  The number of hours worked.
     * @param hrRate The hourly pay rate.
     */

    public Adjunct(String name, int year, String idNum,double hours, double hrRate)
    {
        super(name, year, idNum);
        this.hours = hours;
        this.hrRate = hrRate;
    }

    /**
     * Calculates the salary for the adjunct employee based on hours worked and hourly rate.
     *
     * @return The calculated salary (hours × hourly rate).
     */
    public double getSalary()
    {
        return (hours*hrRate);
    }

    /**
     * Returns a string representation of the Adjunct employee,
     * including inherited fields and adjunct-specific details like hours,
     * hourly rate, and computed salary.
     *
     * @return A formatted string with adjunct employee details.
     */
    public String toString()
    {
        String str = super.toString() + String.format("\nHours: %.2f,", hours)+ String.format("\tHourly Rate: %.2f,", hrRate)+ String.format("\tSalary: $%,.2f", getSalary());
        return str;
    }
}
