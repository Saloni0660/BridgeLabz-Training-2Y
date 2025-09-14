class Employee {
    public int employeeID;         
    protected String department;   
    private double salary;         

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void display() {
        System.out.println("Employee ID : " + employeeID);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : $" + salary);
    }
}

class Manager extends Employee {

    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void showManagerAccess() {
        System.out.println("Manager ID         (public)   : " + employeeID);
        System.out.println("Manager Department (protected): " + department);
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {

        Employee emp = new Employee(101, "HR", 30000.0);
        emp.display();

        System.out.println();

        emp.setSalary(35000.0);
        System.out.println("Updated Salary: $" + emp.getSalary());

        System.out.println();

        Manager mgr = new Manager(201, "Finance", 50000.0);
        mgr.showManagerAccess();
    }
}


