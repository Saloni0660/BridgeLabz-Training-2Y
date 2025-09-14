public class Student {
   
    String name;
    int rollNumber;
    int marks;
    char grade;

    void calculateGrade() {
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else if (marks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Marks       : " + marks);
        System.out.println("Grade       : " + grade);
        System.out.println();
    }

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "Alice";
        student1.rollNumber = 101;
        student1.marks = 85;

        student1.calculateGrade();
        student1.displayDetails();

        Student student2 = new Student();
        student2.name = "Bob";
        student2.rollNumber = 102;
        student2.marks = 72;

        student2.calculateGrade();
        student2.displayDetails();
    }
}
