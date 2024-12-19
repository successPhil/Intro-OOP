
/**
 * Write a description of class PlayerPiece here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerPiece
{
    //comments to the right of each instance variable indicate the
    //initial values that you will set in the no argument constructor
    // instance variables
    private String pieceName; //"no name"
    private String pieceType; //"human"
    
    private int currentHealth; //100
    private int maxHealth; //100
     
    private int locX;  //7
    private int locY;  //8
    
    private int attackPower; //25
    private int defensePower; //20
    
    private int currentSpecialPower; //50
    private int maxSpecialPower; //50

    /**
     * No Argument constructor for objects of class PlayerPiece
     */
    public PlayerPiece()
    {
        // initialise instance variables
        //Use the values listed in the comments
        //above that are next to each instance variable
        
       
    }
    
    public PlayerPiece(String name, String type, int curH, int maxH, int x, int y, 
                            int atkP, int defP, int curSP, int maxSP) {
        pieceName = name;
        //fill in the rest of the values here
    }
    

    public int getMaxHealth() {
        return maxHealth;
    }
    public int getCurrentHealth() {
        return currentHealth;
    }
    public int getLocX() {
        return locX;
    }
    public int getLocY() {
        return locY;
    }
    public int getAttackPower() {
        return attackPower;
    }
    public int getDefensePower() {
        return defensePower;
    }
    
    public void moveUp() {
        
    }
    public void moveDown() {
        
    }
    public void moveLeft() {
        
    }
    public void moveRight() {
        
    }
    public void setMaxSpecialPower(int maxS) {
        maxSpecialPower= maxS;
    }
    
    public void setCurrentSpecialPower(int curS) {
        currentSpecialPower = curS;
    }
    public int getMaxSpecialPower() {
        return maxSpecialPower;
    }
    
    public int getCurrentSpecialPower() {
        return currentSpecialPower;
    }
    
    public String getPieceType() {
        return pieceType;
    }
    
    public String getPieceName() {
        return pieceName;
    }
    
    public void setPieceType(String type) {
        pieceType = type;
    }
    
    public void setPieceName(String name) {
        pieceName = name;
    }
}

