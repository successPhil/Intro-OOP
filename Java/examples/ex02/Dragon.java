
public class Dragon extends PlayerPiece
{
    // instance variables - replace the example below with your own
    private int maxFire = 50;
    private int currentFire = 50;

    /**
     * Constructor for objects of class Dragon
     */
    public Dragon()
    {
        // initialise instance variables
    
    }
    // Getters
    public int getMaxFire(){
        return maxFire;
    }
    
    public int getCurrentFire(){
        return currentFire;
    }
    // Setters
    public void setMaxFire(int maxF){
        maxFire = maxF;
    }
    
    public void setCurrentFire(int currF){
        currentFire = currF;
    }
}

