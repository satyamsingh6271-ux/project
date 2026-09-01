# Student-grade-system
import java.util.Scanner;

public class StudentGradeSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Student details
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollNo = sc.nextInt();

        // Marks
        System.out.print("Enter marks in English: ");
        double english = sc.nextDouble();

        System.out.print("Enter marks in Maths: ");
        double maths = sc.nextDouble();

        System.out.print("Enter marks in Science: ");
        double science = sc.nextDouble();

        System.out.print("Enter marks in Computer: ");
        double computer = sc.nextDouble();

        System.out.print("Enter marks in Hindi: ");
        double hindi = sc.nextDouble();

        // Total and percentage
        double total = english + maths + science + computer + hindi;
        double percentage = total / 5;

        // Grade calculation
        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        // Result
        System.out.println("\n===== STUDENT RESULT =====");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Total Marks: " + total + " / 500");
        System.out.println("Percentage : " + percentage + "%");
        System.out.println("Grade      : " + grade);

        if (grade == 'F') {
            System.out.println("Result     : FAIL");
        } else {
            System.out.println("Result     : PASS");
        }

        sc.close();
    }
}
