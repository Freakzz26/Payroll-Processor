import java.util.Scanner;

class Employee {
    void CalculatePay(String name, double salary) {
        salary = salary * 30;
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
    void CalculatePay(String name, int hourly_rate, int hours_worked) {
        System.out.println("Name: "+name);
        System.out.println("Hourly Salary: "+hourly_rate*hours_worked);
    }
}
public class payroll {
    public static void main(String[] args) {
        Employee employee=new Employee();
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();
        double salary=scanner.nextInt();
        int hourlyrate=scanner.nextInt();
        int hours_worked=scanner.nextInt();
        System.out.println("YOUR SALARY");
        employee.CalculatePay(name,salary);
        System.out.println("YOUR HOURLY SALARY");
        employee.CalculatePay(name,hourlyrate,hours_worked);

    }
}
