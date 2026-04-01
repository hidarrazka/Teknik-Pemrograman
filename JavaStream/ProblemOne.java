import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    String nama;
    int gaji;

    Employee(String nama, int gaji){
        this.nama = nama;
        this.gaji = gaji;
    }
    public String getNama(){
        return nama;
    }
    @Override
    public String toString() {
        return "Employee{name='" + nama + "', salary=" + gaji + "}";
    }

}

public class ProblemOne {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee("Alice", 50000));
        list.add(new Employee("bob", 70000));
        list.add(new Employee("rob", 40000));
        list.add(new Employee("john", 10000));

        // Melakukan proses filtering/sorting menggunakan Stream API
        List<Employee> sortedEmp = list.stream()
                // Mengurutkan employee berdasarkan nama
                .sorted((e1, e2) -> e1.getNama().compareTo(e2.getNama()))
                // Mengumpulkan hasil akhir
                .collect(Collectors.toList());

        for(Employee e : sortedEmp){
            System.out.println(e);
        }
    }
}

// Asumsikan class Employee sudah memiliki getter getName() dan getSalary()
