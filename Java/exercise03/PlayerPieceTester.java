
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
      PlayerPiece piece01 = new PlayerPiece();
      //by default, all instance vars 
      //in PlayerPiece are set to 0
     
	 //actual results
      System.out.println("Current/Total HP = " + 
                    piece01.getCurrentHealth() + "/" + 
                    piece01.getMaxHealth());

	//expected results
	//we expect the values to be 0 initially because we have not set 
	//any other specific values in the PlayerPiece.java file
      System.out.println("Expected 0/0");
      
      //Below this line you need to add tests 
      //first you will test your constructors.
      //test the  no argument constructor, and make sure
      //that the default values are set correctly (use method calls)
      //next, test the constructor that has several arguments
      //use method calls again to test these values are set correctly
    }
}

