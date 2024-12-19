
public class Troll extends PlayerPiece
{
    // instance variables - replace the example below with your own
    private int maxHate = 50;
    private int currentHate = 50;

    /**
     * Constructor for objects of class Troll
     */
    public Troll()
    {
        // initialise instance variables
        
    }

    // Getters
    public int getMaxHate(){
        return maxHate;
    }
    
    public int getCurrentHate(){
        return currentHate;
    }
    
    // Setters
    public void setMaxHate(int maxH){
        maxHate = maxH;
    }
    
    public void setCurrentHate(int currH){
        currentHate = currH;
    }
}

