/**
 * This is a class to test the PlayerPiece class
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerPieceTester
{
    public static void main(String[] args) {
      //create a PlayerPiece object
      //this is equivalent to right clicking
      //a class in BlueJ and creating an object
      //PlayerPiece piece01 = new PlayerPiece();
      //by default, all instance vars 
      //in PlayerPiece are set to 0
     
	 //actual results
      //System.out.println("Current/Total HP = " + 
        //            piece01.getCurrentHealth() + "/" + 
          //          piece01.getMaxHealth());

	//expected results
	//we expect the values to be 0 initially because we have not set 
	//any other specific values in the PlayerPiece.java file
      //System.out.println("Expected 0/0");
      
      //Below this line you need to add tests 
      //first you will test your constructors.
      PlayerPiece piece01 = new PlayerPiece();
      System.out.println("Testing no argument constructor");
      // Actual
      System.out.println("Actual:");
      System.out.println("Piece name = "+piece01.getPieceName());
      System.out.println("Piece type = "+piece01.getPieceType());
      System.out.println("Current/Total HP = "+piece01.getCurrentHealth()+"/"+piece01.getMaxHealth());
      System.out.println("Location = "+piece01.getLocX()+","+piece01.getLocY());
      System.out.println("Attack Power = "+piece01.getAttackPower());
      System.out.println("Defense Power = "+piece01.getDefensePower());
      System.out.println("Current/Total SP = "+piece01.getCurrentSpecialPower()+"/"+piece01.getMaxSpecialPower());
      System.out.println(); // Spacing
      
      // Expected
      System.out.println("Expected:");
      System.out.println("Piece name = no name");
      System.out.println("Piece type = human");
      System.out.println("Current/Total HP = 100/100");
      System.out.println("Location = 7,8");
      System.out.println("Attack Power = 25");
      System.out.println("Defense Power = 20");
      System.out.println("Current/Total SP = 50/50");
      System.out.println(); // Spacing
      
      //test the  no argument constructor, and make sure
      //that the default values are set correctly (use method calls)
      //next, test the constructor that has several arguments
      //use method calls again to test these values are set correctly
      PlayerPiece piece02 = new PlayerPiece("gnome name", "dwarf", 200, 200, 3, 2, 45, 21, 60, 60);
      System.out.println("Testing constructor with arguments");
      // Actual
      System.out.println("Actual:");
      System.out.println("Piece name = "+piece02.getPieceName());
      System.out.println("Piece type = "+piece02.getPieceType());
      System.out.println("Current/Total HP = "+piece02.getCurrentHealth()+"/"+piece02.getMaxHealth());
      System.out.println("Location = "+piece02.getLocX()+","+piece02.getLocY());
      System.out.println("Attack Power = "+piece02.getAttackPower());
      System.out.println("Defense Power = "+piece02.getDefensePower());
      System.out.println("Current/Total SP = "+piece02.getCurrentSpecialPower()+"/"+piece02.getMaxSpecialPower());
      System.out.println(); // Spacing
      
      // Expected
      System.out.println("Expected:");
      System.out.println("Piece name = gnome name");
      System.out.println("Piece type = dwarf");
      System.out.println("Current/Total HP = 200/200");
      System.out.println("Location = 3,2");
      System.out.println("Attack Power = 45");
      System.out.println("Defense Power = 21");
      System.out.println("Current/Total SP = 60/60");
      System.out.println(); // Spacing
      
      // Testing move methods on piece02 which starts at x=3, y=2
      System.out.println("Testing moveUp() on piece02");
      piece02.moveUp();
      System.out.println("Actual:");
      System.out.println("Y location = "+piece02.getLocY());
      System.out.println("Expected:");
      System.out.println("Y location = 3");
      System.out.println();// Spacing
      
      System.out.println("Testing moveDown() on piece02");
      piece02.moveDown();
      System.out.println("Actual:");
      System.out.println("Y location = "+piece02.getLocY());
      System.out.println("Expected:");
      System.out.println("Y location = 2");
      System.out.println();// Spacing
      
      System.out.println("Testing moveLeft() on piece02");
      piece02.moveLeft();
      System.out.println("Actual:");
      System.out.println("X location = "+piece02.getLocX());
      System.out.println("Expected:");
      System.out.println("X location = 2");
      System.out.println();// Spacing
      
      System.out.println("Testing moveRight() on piece02");
      piece02.moveRight();
      System.out.println("Actual:");
      System.out.println("X location = "+piece02.getLocX());
      System.out.println("Expected:");
      System.out.println("X location = 3");
      System.out.println();// Spacing
      
      System.out.println("Now testing setLocXY()");
      piece02.setLocXY(5,10);
      System.out.println("Actual:");
      System.out.println("Location = "+piece02.getLocX()+","+piece02.getLocY());
      System.out.println("Expected:");
      System.out.println("Location = 5,10");
      System.out.println();
      
      System.out.println("Now testing deductHealth()");
      // piece02 is initialized with 200 current health
      piece02.deductHealth(33);
      System.out.println("Actual:");
      System.out.println("Current Health = "+piece02.getCurrentHealth());
      System.out.println("Expected:");
      System.out.println("Current Health = 167");
      System.out.println(); // spacing
      
      System.out.println("Now testing addHealth()");
      piece02.addHealth(30);
      System.out.println("Actual:");
      System.out.println("Current Health = "+piece02.getCurrentHealth());
      System.out.println("Expected:");
      System.out.println("Current Health = 197");
      System.out.println(); // spacing
    }
}
