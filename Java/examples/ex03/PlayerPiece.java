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
        this.pieceName = "no name";
        this.pieceType = "human";
        this.currentHealth = 100;
        this.maxHealth = 100;
        this.locX = 7;
        this.locY = 8;
        this.attackPower = 25;
        this.defensePower = 20;
        this.currentSpecialPower = 50;
        this.maxSpecialPower = 50;
        
       
    }
    /**
     * Constructor with arguments
     * @param name - name of piece (used for identification)
     * @param type - type of piece (e.g Human, Dwarf..etc)
     * @param curH - current health
     * @param maxH - maximum health
     * @param x - x-coordinate for piece
     * @param y - y-coordinate for piece
     * @param atkP - attack power
     * @param defP - defense power
     * @param curSP - current special power
     * @param maxSP - maximum special power
     */
    public PlayerPiece(String name, String type, int curH, int maxH, int x, int y, 
                            int atkP, int defP, int curSP, int maxSP) {
        this.pieceName = name;
        this.pieceType = type;
        this.currentHealth = curH;
        this.maxHealth = maxH;
        this.locX = x;
        this.locY = y;
        this.attackPower = atkP;
        this.defensePower = defP;
        this.currentSpecialPower = curSP;
        this.maxSpecialPower = maxSP;
        //fill in the rest of the values here
    }
    
    /**
     * Retrieves maximum health of player piece
     * @return maximum health value
     */
    public int getMaxHealth() {
        return maxHealth;
    }
    /**
     * Retrieves current health of player piece
     * @return current health value
     */
    public int getCurrentHealth() {
        return currentHealth;
    }
    /**
     * Retrieves current x location
     * @return x-coordinate value of location
     */
    public int getLocX() {
        return locX;
    }
    /**
     * Retrieves current y location
     * @return y-coordinate value of location
     */
    public int getLocY() {
        return locY;
    }
    /**
     * Retrieves attack power of player piece
     * @return attack power value for piece
     */
    public int getAttackPower() {
        return attackPower;
    }
    /**
     * Retrieves defense power of player piece
     * @return defense power value for piece
     */
    public int getDefensePower() {
        return defensePower;
    }
    /**
     * Decrements health by amount passed as argument
     * @param amt - amount to reduce health by
     */
    public void deductHealth(int amt){
        this.currentHealth -= amt;
    }
    /**
     * Increments health by amount passed as argument
     * @param amt - amount to increase health by
     */
    public void addHealth(int amt){
        this.currentHealth += amt;
    }
    /**
     * Moves piece upwards by 1 unit in y-direction
     */
    public void moveUp() {
        this.locY++;
    }
    /**
     * Moves piece downward by 1 unit in y-direction
     */
    public void moveDown() {
        this.locY--;
    }
    /**
     * Moves piece left by 1 unit in x-direction
     */
    public void moveLeft() {
        this.locX--;
    }
    /**
     * Moves piece right by 1 unit in x-direction
     */
    public void moveRight() {
        this.locX++;
    }
    /**
     * Sets coordinates to arguments passed in
     * @param x - value for x-coordinate
     * @param y - value for y-coordinate
     */
    public void setLocXY(int x, int y){
        this.locX = x;
        this.locY = y;
    }
    /**
     * Sets max special power to value passed
     * @maxS - amount to set max special power to
     */
    public void setMaxSpecialPower(int maxS) {
        maxSpecialPower= maxS;
    }
    /**
     * Sets current special power
     * @curS - amount to set current special power to
     */
    public void setCurrentSpecialPower(int curS) {
        currentSpecialPower = curS;
    }
    /**
     * retrieves maximum special power of piece
     */
    public int getMaxSpecialPower() {
        return maxSpecialPower;
    }
    /**
     * retrieves current special power of piece
     */
    public int getCurrentSpecialPower() {
        return currentSpecialPower;
    }
    /**
     * retrieves type of piece
     */
    public String getPieceType() {
        return pieceType;
    }
    /**
     * retrieves name of piece
     */
    public String getPieceName() {
        return pieceName;
    }
    /**
     * sets type for piece
     * @param type type value for piece (e.g human, dwarf, elf)
     */
    public void setPieceType(String type) {
        pieceType = type;
    }
    /**
     * sets name for piece
     * @param name name value for piece (used for identification)
     */
    public void setPieceName(String name) {
        pieceName = name;
    }
}
