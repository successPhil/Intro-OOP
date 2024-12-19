
public class Dwarf extends PlayerPiece
{
    // instance variables - replace the example below with your own
    private int maxStrength = 50;
    private int currentStrength = 50;

    /**
     * Constructor for objects of class Dwarf
     */
    public Dwarf()
    {
        // initialise instance variables
        
    }
    // Getters
    public int getMaxStrength(){
        return maxStrength;
    }
    
    public int getCurrentStrength(){
        return currentStrength;
    }
    
    // Setters
    public void setMaxStrength(int maxS){
        maxStrength = maxS;
    }
    
    public void setCurrentStrength(int currS){
        currentStrength = currS;
    }
}

