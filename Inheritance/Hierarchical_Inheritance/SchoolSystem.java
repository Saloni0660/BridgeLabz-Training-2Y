public class SchoolSystem {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Alice Johnson", 35, "Mathematics");
        Student student = new Student("Bob Smith", 16, 10);
        Staff staff = new Staff("Carol White", 42, "Library");

        teacher.displayRole();
        teacher.displayDetails();

        System.out.println();

        student.displayRole();
        student.displayDetails();

        System.out.println();

        staff.displayRole();
        staff.displayDetails();
    }
}

// Superclass
class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass 1: Teacher
class Teacher extends Person {
    public String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println("Role: Teacher");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }
}

// Subclass 2: Student
class Student extends Person {
    public int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        System.out.println("Role: Student");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Grade: " + grade);
    }
}

// Subclass 3: Staff
class Staff extends Person {
    public String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void displayRole() {
        System.out.println("Role: Staff");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}
