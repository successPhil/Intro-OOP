
/**
 * This is the StudentTester class used to test the Student class
 *
 * @author Phil
 * @version 09/22/2024
 */
public class StudentTester
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        // Entry point for test program
        
        // Create an instance of Student
        // params - name (string)
        Student testStudent = new Student("Phil");
        // Expected to initialize a Student with:
        // name: "Phil", totalScore: 0.0, numberOfQuizzes: 0
        System.out.println("****************************************");
        System.out.println("    Running tests for Student class...");
        System.out.println("****************************************");
        System.out.println("Testing getName()");
        System.out.println("expected: Phil" +", actual: "+ testStudent.getName());
        
        System.out.println();
        System.out.println("****************************************");
        System.out.println("Testing getTotalScore()");
        System.out.println("expected: 0.0, actual: "+testStudent.getTotalScore());
        
        System.out.println();
        System.out.println("****************************************");
        System.out.println("Testing getAverageScore()");
        System.out.println("expected: 0.0, actual: "+testStudent.getAverageScore());
        
        System.out.println();
        System.out.println("****************************************");
        System.out.println("Testing addQuiz(double score)");
        System.out.println("Adding a quiz score of 90 to Student");
        System.out.println();
        testStudent.addQuiz(90);
        System.out.println("Getting total quiz score...\n expected: 90.0, actual: "+testStudent.getTotalScore());
        System.out.println("Getting total number of quizzes...\n expected: 1, actual: " + testStudent.getNumberOfQuizzes());
        System.out.println("Getting averagescore...\n expected: 90.0, actual: "+testStudent.getAverageScore());
        
        System.out.println();
        System.out.println("****************************************");
        System.out.println("Testing getAverageScore() with 2 quizzes");
        System.out.println("Adding a quiz score of 100 to Student");
        System.out.println();
        testStudent.addQuiz(100);
        System.out.println("Getting total quiz score...\n expected: 95.0, actual: "+testStudent.getTotalScore());
        System.out.println("Getting total number of quizzes...\n expected: 2, actual: " + testStudent.getNumberOfQuizzes());
        System.out.println("Getting averagescore...\n expected: 95.0, actual: "+testStudent.getAverageScore());
        
        
    }
}

