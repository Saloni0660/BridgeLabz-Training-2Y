class Student {
    public int rollNumber;     
    protected String name;     
    private double CGPA;       

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double cgpa) {
        CGPA = cgpa;
    }

    public void display() {
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Name   : " + name);
        System.out.println("CGPA   : " + CGPA);
    }
}

class PostgraduateStudent extends Student {

    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    public void showProtectedName() {
        System.out.println("PG Student Name: " + name);
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        Student student = new Student(101, "Alice", 3.5);
        student.display();

        System.out.println();

        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Bob", 3.8);
        pgStudent.display();
        pgStudent.showProtectedName();

        // Change CGPA using setter
        pgStudent.setCGPA(4.0);
        System.out.println("Updated CGPA: " + pgStudent.getCGPA());
    }
}
