import java.util.Scanner;

public class StudentGradeCalculator {
    
    public static void main(String[] args) {
        
        // Initialize scanner for user input
        Scanner sc = new Scanner(System.in);

        // Take input for the number of subjects
        System.out.println("Enter the number of subjects: ");
        int numberOfSubjects = sc.nextInt();

         // Array to store marks for each subject
         int marks[] = new int[numberOfSubjects];

        // Take input for marks in each subject
        for( int i =0; i<numberOfSubjects; i++) {
            System.out.println("Enter marks for subject " + (i+1) + " : ");
            marks[i] = sc.nextInt();
        }
 
        // Calculate the total marks
        int totalMarks = 0;
        for(int studentsMark : marks){
            totalMarks = totalMarks + studentsMark;
        }

        // Calculate the average percentage
        double averagePercentage = (double ) (totalMarks / numberOfSubjects);

        //Grade Calculation
        char grade;

        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        //Display Results
        System.out.println("Total marks : " + totalMarks);
        System.out.println("Avarage Percentage : " + averagePercentage);
        System.out.println("Grade : " + grade);

        //close the scanner
        sc.close();
    }

}
