package id.ac.polban.employee.model;

public class Employee {
    private int id;
    private String name;
    private Department department;
    private EmploymentType type;
    private double salary;

    // Static field untuk hitung jumlah employee
    private static int totalEmployees = 0;
    
    public Employee(int ids, String names, Department departments, EmploymentType types, double salarys) {
        this.id = ids;
        this.name = names;
        this.department = departments;
        this.type = types;
        this.salary = salarys;
        totalEmployees++;
    }
    // Static method untuk mendapatkan total employee
    public static int getTotalEmployees() {
        return totalEmployees;
    }
 
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    public EmploymentType getType() {
        return type;
    }
    public void setType(EmploymentType type) {
        this.type = type;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public EmploymentType gEmploymentType(){
        return type;
    }
   
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nama: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department.getName());
        System.out.println("Employment Type: " + type.getType());
        System.out.println("---------------------------");
    }
}
