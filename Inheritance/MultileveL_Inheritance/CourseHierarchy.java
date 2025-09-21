public class CourseHierarchy {
    public static void main(String[] args) {
        Course course = new Course("Mathematics", 40);
        OnlineCourse onlineCourse = new OnlineCourse("Physics", 30, "Udemy", true);
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Computer Science", 50, "Coursera", false, 500, 10);

        System.out.println("=== Course ===");
        course.displayDetails();

        System.out.println("\n=== Online Course ===");
        onlineCourse.displayDetails();

        System.out.println("\n=== Paid Online Course ===");
        paidCourse.displayDetails();
    }
}

// Base class
class Course {
    protected String courseName;
    protected int duration; // in hours

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}

// Subclass
class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass of OnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    public double fee;
    public double discount; // percentage discount

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Fee after discount: $" + (fee - (fee * discount / 100)));
    }
}
