
public class Human extends PlayerPiece
{
    // instance variables - replace the example below with your own
    private int maxSpirit = 50;
    private int currentSpirit = 50;

    /**
     * Constructor for objects of class Human
     */
    public Human()
    {
        // initialise instance variables
        
    }
    // Getters
    public int getMaxSpirit(){
        return maxSpirit;
    }
    
    public int getCurrentSpirit(){
        return currentSpirit;
    }
    // Setters
    public void setMaxSpirit(int maxS){
        maxSpirit = maxS;
    }
    
    public void setCurrentSpirit(int currS){
        currentSpirit = currS;
    }
}
