
/**
 * This class represents a Employee
 *
 * @author Phil
 * @version 09/22/2024
 */
public class Employee
{
    // instance variables - replace the example below with your own
    private String name;
    private String jobTitle;
    private double salary;
    private int sickDays;
    

    /**
     * Constructor for objects of class Employee
     * @param name Name of the Employee
     * @param jobTitle Job title of the Employee
     * @param salary Salary of the Employee
     * @param sickDays Number of sick days
     */
    public Employee(String name, String jobTitle, double salary, int sickDays)
    {
        // initialise instance variables
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.sickDays = sickDays;
    }
    
    // Getters
    
    /**
     * @return gets employee name
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * @return job title of Employee
     */
    
    public String getJobTitle(){
        return this.jobTitle;
    }
    
    /**
     * @return salary of Employee
     */
    
    public double getSalary(){
        return this.salary;
    }
    
    /**
     * @return number of sick days for Employee
     */
    
    public int getSickDays(){
        return this.sickDays;
    }
    
    // Setters
    
    /**
     * Increases salary by percentage value passed as param
     * @param percent amount to increase salary by
     */
    public void increaseSalary(double percent){
        this.salary = this.salary + (this.salary * percent/100);
        // We multiply the salary by the percentage
        // and add it to the original salary
    }
    
    /**
     * Decreases salary by percentage value passed as param
     * @param percent amount to decrease salary by
     */
    public void decreaseSalary(double percent){
        this.salary = this.salary - (this.salary * percent/100);
        // Original salary minus salary * percentage
    }
    
    /**
     * Adds a sick day
     */
    public void addSickDay(){
        this.sickDays = this.sickDays + 1;
    }
    
    /**
     * Removes a sick day
     */
    public void removeSickDay(){
        this.sickDays = this.sickDays - 1;
    }
    
    /**
     * Changes job title to value passed as param
     * @param newTitle Job title to be updated
     */
    public void changeJobTitle(String newTitle){
        this.jobTitle = newTitle;
    }

   
}

