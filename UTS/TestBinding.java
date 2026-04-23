package UTS;
class Employee { 
    static void companyPolicy() { 
        System.out.println("General company policy for all employees."); 
    } 
    void work() { 
        System.out.println("Employee works in a generic way."); 
    } 
} 
class Manager extends Employee { 

    static void companyPolicy() { 
        System.out.println("Company policy specific for managers."); 
    } 
    @Override 
    void work() { 
        System.out.println("Manager manages the team."); 
    } 
} 
public class TestBinding { 
public static void main(String[] args) { 
Employee e1 = new Manager(); 
    e1.companyPolicy(); // static binding 
    e1.work();          
} 
} 