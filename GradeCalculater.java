import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your score (0-100): ");
        double score = scanner.nextDouble();

        
        if (score < 0 || score > 100) {
            System.out.println("Invalid score! Please enter a number between 0 and 100.");
        } else {
           
            char grade;

            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            } else if (score >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            
            System.out.println("Your grade is: " + grade);
        }

        scanner.close();
    }
}
