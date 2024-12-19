
public class PlayerPiece extends BoardPiece
{
    // instance variables
    private int currentHealth = 100;
    private int maxHealth = 100;
    private int locX = 15;
    private int locY = 13;
    private int attackPower = 12;
    private int defensePower = 10;
    

    /**
     * Constructor for objects of class PlayerPiece
     */
    public PlayerPiece()
    {
        // initialise instance variables
        
    }
    // Getters
    public int getCurrentHealth(){
        return currentHealth;
    }
    
    public int getMaxHealth(){
        return maxHealth;
    }
    
    public int getLocX(){
        return locX;
    }
    
    public int getLocY(){
        return locY;
    }
    
    public int getAttackPower(){
        return attackPower;
    }
    
    public int getDefensePower(){
        return defensePower;
    }
    
    // Setters without code
    public void moveUp(){
        // no code
    }
    
    public void moveDown(){
        // no code
    }
    
    public void moveLeft(){
        // no code
    }
    
    public void moveRight(){
        // no code
    }

}

