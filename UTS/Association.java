package UTS;
class Bank{
    private String name;
    Bank(String name){
        this.name = name;
    }
    public String getBankName(){
        return name;
    }
}
class Employee{
    private String name;
    Employee(String name){
        this.name = name;
    }
    public String getEmployeeName(){
        return name;
    }
}
public class Association {
    public static void main(String[] args) {
        Bank bank = new Bank( "BRI");
        Employee emp = new Employee("Ujang");
        bank.getBankName();
        emp.getEmployeeName();
    }
}
