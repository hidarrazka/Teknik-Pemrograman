package id.ac.polban.service;

import id.ac.polban.employee.model.*;



public class Main {
    public static void main(String[] args){
        Department itDept = new Department("IT");
        Department hrDept = new Department("HR");
        Department cnsltnDept = new Department("CS");
        EmploymentType fulltime = new EmploymentType("FUll TIME");
        EmploymentType partime = new EmploymentType("PART TIME");
        EmploymentType contract = new EmploymentType("CONTRACT");

        
        Employee emp1 = new Employee(1,"Haidar", itDept,fulltime ,45000000 );
        // Membuat Service
        EmployeeService service = new EmployeeService();

        // Menambahkan Employee
        service.addEmployee(emp1);

        System.out.println("=== Data Awal Employee ===");
        service.displayAllEmployees();

        // Naikkan gaji
        service.raiseSalary(1, 10);

        System.out.println("=== Setelah Kenaikan Gaji 10% untuk ID 1 ===");
        service.displayAllEmployees();
        service.raiseSalary(2,150);
    }
}
