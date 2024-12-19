import java.util.ArrayList;
/**
 * GameBoard class holds player pieces, and can display the board.
 * 
 * @author David Schwab
 * @version 02/15/14
 */
public class GameBoard
{
    //holds a list of pieces currently on the board
    private ArrayList<PlayerPiece> gameList;
    /**
     * Creates an empty gameList to hold PlayerPieces
     */
    public GameBoard()
    {
        // initialise instance variables
        gameList = new ArrayList<PlayerPiece>(20); //max 20 pieces on board
    }
    //method to add a piece to the board
    //accepts the piece to add
    /**
      Adds a piece to the current game board.
     
      @param p the PlayerPiece object to add to the board.
     */
    public void addPiece(PlayerPiece p)  {
       if(gameList.add(p)) {
           System.out.println("added piece");
           this.printBoard();
        }   else {
        System.out.println("could not add piece");
        }
    }
    /**
     * Prints out all the pieces currently on the board.
     */
    public void printBoard() {
        //counter while we do for each item in the list to print
        int i = 0;
        for(PlayerPiece item: gameList) {
        
            i++;
            //print the piece info
            //type and name
            System.out.println("Piece Type: " + item.getPieceType());
            System.out.println("Piece Name: " + item.getPieceName());
            System.out.println("Piece # " + i + ":");
            //health
            System.out.println("Health: "+ item.getCurrentHealth() +
                    "/" + item.getMaxHealth() + " HP");
            //Special Power
            System.out.println("Special: " + item.getCurrentSpecialPower() +
                    "/" + item.getMaxSpecialPower() + " SpecialPower");
            //attack power and defense power
            System.out.println("Attack Power: " + item.getAttackPower());
            System.out.println("Defense Power: " + item.getDefensePower());         
            //Location
            System.out.println("Location: (" + item.getLocX()
                    + ", " + item.getLocY() + ")");
        }
    }
}

