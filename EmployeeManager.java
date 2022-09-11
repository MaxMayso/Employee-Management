package Java_Programs.Employee_List;

public class EmployeeManager extends EmployeePerson {

    private int numManaged;    // Number of staff managed
 
    // Default constructor 
    public EmployeeManager() {
       numManaged = 0;
    }
 
    // Constructor with parameters
    public EmployeeManager(int nManaged) {
       numManaged = nManaged;
    } 
 
    // Get the number of people managed
    public int getNumManaged() {
       return numManaged;
    } 

 
    @Override
    public void printInfo() {
       super.printInfo();
       System.out.println(", Staff managed: " + getNumManaged());
    } 
} 
 
