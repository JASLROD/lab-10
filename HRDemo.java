
/**
 * Demonstrates the use of the Person, Employee, FullTime, and Adjunct classes.
 * Creates several employee objects, stores them in arrays, prints their details,
 * and compares objects using the equals method.
 * This class serves as a test driver for the employee management system.
 * It uses polymorphism to manage an array of mixed object types.
 *
 * @author Jasmin Leonrodriguez, jleonrodriquez@student.sdccd.edu
 * @version v1.0
 * @since 5/13/2025
 */
public class HRDemo
{
    /**
     * The entry point of the program.
     * Creates and manipulates employee objects, demonstrates object comparison,
     * and displays employee data using polymorphism and toString() overrides.
     *
     * @param args Command-line arguments (not used in this demo).
     */
    public static void main(String[] args)
    {
        int index;
        boolean flag = false;

        //create objects
        FullTime fred = new FullTime("Flintstone, Fred", 2013,"BR-1", 75000.1234);
        Adjunct barney = new Adjunct("Rubble, Barney", 2014, "BR-2", 320, 60.55);
        //default object
        FullTime wilma = new FullTime();
        wilma.setName("Flintstone, Wilma");
        wilma.setIdNum("BR-3");
        wilma.setHireDate(2016);
        wilma.setSalary(78123.2468);
        Employee betty = new Employee("Rubble, Betty", 2020, "BR-4");
        FullTime wilma2 = new FullTime("Slate, Wilma", 2016, "BR-3", 78123.2468);

        //create array called staff
        Person[] staff = {fred, barney, wilma, betty, wilma2};
        index = 0;
        for(Person object: staff)
        {
            System.out.print("\nEmployee" + (index+1));
            System.out.print("\n" + object + "\n");
            index++;

        }

        flag = wilma.equals(wilma2);
        if(flag){
            wilma.setName("Slate, Wilma");
            System.out.print("\nwilma and wilma2 are the same person:true\n");

        }

        Person[] staff2 = {fred, barney, wilma, betty};
        index = 0;
        for(Person object: staff2){
            System.out.print("\nEmployee" + (index+1));
            System.out.print("\n" + object + "\n");
            index++;

        }
    }
}
