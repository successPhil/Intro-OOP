
/**
 * This class represents a Student with test scores
 *
 * @author Phil
 * @version 09/22/2024
 */
public class Student
{
    // instance variables
    private String name;
    private double totalQuizScore;
    private int numberOfQuizzes;

    /**
     * Constructor for objects of class Student
     * @param name String representing name of student
     */
    public Student(String name)
    {
        // initialise instance variables
        this.name = name;
        this.totalQuizScore = 0.0;
        this.numberOfQuizzes = 0;
        
    }
    
    // Getters / Accessors
    
    /**
     * Gets the Students name
     * @return students name
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * Gets the total quiz score (cumulative)
     * @return double value for total quiz score
     */
    public double getTotalScore(){
        return this.totalQuizScore;
    }
    
    /**
     * Gets the average quiz score
     * @return average quiz score
     */
    public double getAverageScore(){
        // Handle the case of dividing by 0;
        if (this.numberOfQuizzes == 0){
            return 0;
        }
        return this.getTotalScore() / this.getNumberOfQuizzes();
    }
    
    public int getNumberOfQuizzes(){
        return this.numberOfQuizzes;
    }
    
    // Mutators / Setters
    
    /**
     * Adds a quiz to the total quiz score and increments the number of quizzes by 1
     * @param score value to be added to total quiz score
     */
    public void addQuiz(double score){
        this.totalQuizScore = this.totalQuizScore + score;
        this.numberOfQuizzes ++;
    }

}

