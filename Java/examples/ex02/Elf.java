
public class Elf extends PlayerPiece
{
    // instance variables - replace the example below with your own
    private int maxMagic = 50;
    private int currentMagic = 50;

    /**
     * Constructor for objects of class Elf
     */
    public Elf()
    {
        // initialise instance variables
        
    }
    // Getters
    public int getMaxMagic(){
        return maxMagic;
    }
    
    public int getCurrentMagic(){
        return currentMagic;
    }
    // Setters
    public void setMaxMagic(int maxM){
        maxMagic = maxM;
    }
    
    public void setCurrentMagic(int currM){
        currentMagic = currM;
    }
}

