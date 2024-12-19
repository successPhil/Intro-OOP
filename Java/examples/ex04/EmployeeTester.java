
/**
 * This class is used to test the Employee class
 *
 * @author Phil
 * @version 09/22/2024
 */
public class EmployeeTester
{
   public static void main(String[] args){
       System.out.println("**************************************");
       System.out.println("    Beginning Employee tests...");
       System.out.println("**************************************");
       
       // Creating instance of Employee for testing
       Employee testEmployee = new Employee("Coji", "Prince", 100.0, 99);
       // From this we expect:
       // name: Coji, jobTitle: Prince, salary: 100.0, and sickDays: 99
       
       System.out.println();
       System.out.println("**************************************");
       System.out.println("Testing getName...");
       System.out.println("expected: Coji, actual: "+ testEmployee.getName());
       System.out.println("**************************************");
       
       System.out.println();
       System.out.println("**************************************");
       System.out.println("Testing getJobTitle...");
       System.out.println("expected: Prince, actual: "+ testEmployee.getJobTitle());
       System.out.println("**************************************");
       
       System.out.println();
       System.out.println("**************************************");
       System.out.println("Testing getSalary...");
       System.out.println("expected: 100.0, actual: " + testEmployee.getSalary());
       System.out.println("**************************************");
       
       System.out.println();
       System.out.println("**************************************");
       System.out.println("Testing getSickDays...");
       System.out.println("expected: 99, actual: " + testEmployee.getSickDays());
       System.out.println("**************************************");
       
       System.out.println();
       System.out.println("**************************************");
       System.out.println("Testing increaseSalary...15 percent");
       testEmployee.increaseSalary(15);
       System.out.println("expected: 115.0, actual: " + testEmployee.getSalary());
       System.out.println("**************************************");
       
       System.out.println();
       System.out.println("**************************************");
       System.out.println("Testing decreaseSalary...15 percent");
       testEmployee.decreaseSalary(15);
       System.out.println("expected: 97.75, actual: " + testEmployee.getSalary());
       System.out.println("**************************************");
       
       System.out.println();
       System.out.println("**************************************");
       System.out.println("Testing addSickDay...");
       testEmployee.addSickDay();
       System.out.println("expected: 100, actual: " + testEmployee.getSickDays());
       System.out.println("**************************************");
       
       System.out.println();
       System.out.println("**************************************");
       System.out.println("Testing removeSickDay...");
       testEmployee.removeSickDay();
       System.out.println("expected: 99, actual: " + testEmployee.getSickDays());
       System.out.println("**************************************");
       
       System.out.println();
       System.out.println("**************************************");
       System.out.println("Testing changeJobTitle...");
       testEmployee.changeJobTitle("King");
       System.out.println("expected: King, actual: " + testEmployee.getJobTitle());
       System.out.println("**************************************");
       
       
   }
    
   
}

