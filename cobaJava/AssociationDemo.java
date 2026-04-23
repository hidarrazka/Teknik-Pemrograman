class Bank{
    private String name;
    public Bank (String name){
        this.name = name;
    }
    public String getBankName(){
        return name;
    }
}
class Employee{
    private String name;
    public Employee(String name){
        this.name = name;
    }
    public String getEmployeeName(){
        return name;
    }
}
public class AssociationDemo {
    public static void main(String[] args) {
        Bank bank = new Bank("BRI");
        Employee emp = new Employee("Haidar");
        System.out.println(emp.getEmployeeName() + " adalah karyawan dari " + bank.getBankName());
    }
}
