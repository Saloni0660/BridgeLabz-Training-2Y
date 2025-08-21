public class PenDistribution {
    public static void main(String[] args) {
        // Given values
        int totalPens = 14;
        int students = 3;

        // Using division operator to find pens per student
        int pensPerStudent = totalPens / students;

        // Using modulus operator to find remaining pens
        int remainingPens = totalPens % students;

        // Output
        System.out.println("The Pen Per Student is " + pensPerStudent +
                           " and the remaining pen not distributed is " + remainingPens);
    }
}
