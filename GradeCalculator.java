import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input number of subjects
        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();  
        
        int[] marks = new int[numberOfSubjects];
        int totalMarks = 0;
        
        // Input marks for each subject
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }
        
        // Calculate average percentage
        double averagePercentage = (double) totalMarks / (numberOfSubjects * 100) * 100;
        
        // Grade calculation
        char grade;
        if (averagePercentage >= 90) {
            grade = 'O';
        } else if (averagePercentage >= 80) {
            grade = 'A';
        } else if (averagePercentage >= 70) {
            grade = 'B';
        } else if (averagePercentage >= 60) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        
        // Display results
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}
