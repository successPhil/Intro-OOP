<h1>Complete the following Tasks:</h1>

For this lab we are going to use the BlueJ environment in order to design some classes, and then instantiate (create) objects of these classes.  This will involve creating instance variables, constructors, and methods for our classes.  Our classes will represent a game board for a simple game that will have three types of player pieces, and two types of enemy pieces (for our heroes to vanquish!)

Use the names for variables, methods and classes that I list here below.  Otherwise your code will not run with some of the code that I will be providing.

1)	You should compile your code after nearly every step in the lab.  This allows you to make sure you have no syntax errors, and it saves your work.  Double bonus!!!

2)	Create a new class (click on the “New Class ...” button).  Name this class BoardPiece.

3)	Create a new class.  Name this class PlayerPiece.

4)	We want the PlayerPiece class to inherit methods from the BoardPiece class.  To do this, double click on PlayerPiece.  Find near the top where it says public class PlayerPiece.  On that same line, add to the end of the line, extends BoardPiece.  The PlayerPiece class can be thought of as a more specialized version of the BoardPiece class.  It can do anything the BoardPiece class can do, and more.

5)	Click Compile.  (There should be no errors.  If there are, fix them).

6)	Now that you know how to create classes, create three new classes.  Name these classes Human, Elf, and Dwarf.  These will be the classes to represent our heroes.  Your BlueJ window should look similar to below when you are done.  (Note that you can drag your classes around to arrange them how you like).  (The arrow from PlayerPiece to BoardPiece signals


![image](https://github.com/user-attachments/assets/24192cf9-178f-44f3-a88f-7aa9ceea2a6f)

that PlayerPiece extends BoardPiece).

7)	Now, we want the Human, Elf, and Dwarf classes to inherit from the PlayerPiece class.  Follow the same concept from step 3 to make this happen (add extends PlayerPiece to the class definitions for Human, Elf, and Dwarf).  You should have something similar to below.  (Note I've moved my hero classes below PlayerPiece).

![image](https://github.com/user-attachments/assets/c04d94ae-68dd-428e-b7f5-8273ee09567f)

8)	We need one more class now to make our game (semi) complete.  Can you guess?  A GameBoard class of course!!! Our heroes must have a game board to do battle upon.  Create a GameBoard class.  Conceptually we will be putting game pieces onto our GameBoard.

9)	Now it’s time to add some instance variables to our classes.  These will store things like position, hit points, and attack power.  Instance variables are like the variables we have studied so far, except they belong to the class rather than to a specific method.  You will need to use the keyword private to declare instance variables.  For example, 				private int maxHealth = 100; //declaration, initialization

10)	Double click on the PlayerPiece class.  This brings up the editor window for the PlayerPiece class.  You should see where an instance variable (x) was created for you, along with a sample method (sampleMethod()).  Using the example as a guideline, you should create the following instance variables and initialize them to the values below.  Comment your code.  Make all of these instance variables private.  Instance variables should be declared OUTSIDE of methods, but inside your class.
  
  1.	currentHealth  (type: int, initial value: 100)
  2.	maxHealth (type: int, initial value: 100)
  3.	locX (type: int, initial value: 15)
  4.	locY (type: int, initial value: 13).
  5.	attackPower (type: int, initial value: 12)
  6.	defensePower (type: int, initial value: 10)

11)	 Compile to save your work and check for errors.

12)	Look at the method declaration below:

![image](https://github.com/user-attachments/assets/31ea29ae-f4e8-4048-8147-7d8614c307e0)

13)	 public means any class can call this method.  Your methods should be public.  “int” is the type returned by the method.  (You can see the one line of code at the bottom that says “return x+y;” to verify this).  Next comes the name of the method, “sampleMethod”.  Then open parenthesis.  Then you list the parameters (input) of the method.  In this case there is one parameter, an int, that will be called y inside this method.  Then finally inside the brackets you place the code for the method.  

14)	Using the sampleMethod() as a guide, create the following methods inside the PlayerPiece class, with parameters and return types as specified.  Compile your code after EVERY STEP here.

15)	Each of the methods created above are accessor methods.  They simply give access to the instance variables.  They make no changes.

16)	Now we need to create some mutator methods.  These will be useful to be able to move our game pieces around.  We are conceptually using a 32x32 board that starts at coord (0,0) in the upper left corner, and ends at coord (31,31) in the lower right corner.  Draw this so you can visualize it.  Create the following methods.  Compile after you make each method.

1.	moveUp() - no arguments, no return value, no code
2.	moveDown() - no arguments, no return value, no code
3.	moveLeft() - no arguments, no return value, no code
4.	moveRight() - no arguments, no return value, no code

17)	We will worry about implementing these methods in another lab assignment.

18)	At this point we have enough code to create some objects.  Right click on the Human class, and select new Human().  Note that this calls a “default constructor”.  We have not created a constructor yet, so there is a default one provided by Java.  It simply creates an empty object. (However, any instance variables that you have explicitly initialized will still be initialized – such as maxHealth will be set to 100).

19)	Give your object a name, the default name is fine.  (human1)

20)	A new human object is now placed at the bottom of BlueJ.  Below is what my screen looked like after I created two human objects.

![image](https://github.com/user-attachments/assets/de0c40fa-ebac-4a82-b5fe-16b047d1c3ed)

21)	Right click on the human1 object, and look at the different menus.  Look at the BlueJ tutorial to see more detail here.  You can call methods (you should do this.).  You can also inspect the object to look at all its current values (do this as well).  You should see the variables and values you created in step 10 when you inspect.   Call the methods created in step 14, take a screen capture of the results of each method (use snipping tool on windows), and insert these screenshot into a word document.  You will upload this file with your .java files as part of your submission.  Below is a screen-shots of a call I made to the getAttackPower() method.  Note that it has the correct value of 12 being returned.  Make sure at this point in the lab that you understand how to create an object (human1), how to call its methods, and how to inspect the object.


22)	Now, we are going to go into the Human, Elf, and Dwarf classes and add some custom variables.  Create 2 instance variables inside the Human class for maxSpirit, and currentSpirit.  Both type int.  Give initial value of 50 to each.  Compile.

23)	Create 2 instance variables in the Elf class for maxMagic, and currentMagic.  Both type int.  Give initial value of 50 to each.  Compile.

24)	Create 2 instance variables in the Dwarf class for maxStrength, and currentStrength.  Both  type int.  Give initial value of 50 to each.  Compile.

25)	Create accessor methods for the instance variables created in 22, 23, and 24.  (6 methods total, 2 in each class).  Compile often.  (i.e. getCurrentStrength(), getMaxStrength(), etc … - make sure to name your methods in this same manner for each of these methods – capitalization is important).

26)	You now need to test the methods you created in step 25.  First create a Dwarf object, then call the getCurrentStrength() and getMaxStrength() methods, and paste a screen shot of the results of each into your word document.  Do similarly for the Elf class and Human class to test their new methods.

27)	Create a mutator method for each of the instance variables created in 22, 23, and 24.  (6 methods, i.e. setCurrentStrength(), setMaxStrength(), etc … ).  Compile often.  The first one is done for you below.  Note that the keyword void means nothing is returned by this method.  This method goes into the Human class.


	public void setMaxSpirit(int maxS)
    	{
        		//set maxSpirit to value received as a parameter,
        		// maxS
        		maxSpirit = maxS; //refers to maxSpirit instance var
    	}

28)	Compile often.

29)	You now need to test the methods you created in step 27.  First create a Human object, then call the setCurrentSpirit() method and set a new value for the current spirit.  To check that the change took effect, you will need to call getCurrentSpirit(). Paste a screen shot of the results of each of these method calls into your word document.  Do similarly for the Elf class and Dwarf class to test their new methods.  (6 new screen shots here).

30)	Delete all the code you have in the GameBoard class.  Replace it with the code posted in exercise02/GameBoard.java.

30)	Compile.
31)	Create a Human object.
32)	Create a GameBoard object
33)	Use the GameBoard's addPiece() method to add the Human object to the board.  (You must enter the name you gave your Human object.  Default is human1.)
34)	 A window should pop up that gives you a piece number, prints the HP (Hit points), and location.  Take a screen shot – add this screen shot to your document.
35)	Create 2 new classes, Troll, and Dragon, that both inherit from PlayerPiece.  Fill in these classes in a similar way as Human, Elf, and Dwarf.  For Troll use maxHate and currentHate for the instance variables.  Use getMaxHate() and getCurrentHate() for the accessor methods.  Use setMaxHate() and setCurrentHate() for the mutator methods.  Fill in the Dragon class in a similar fashion, using maxFire, currentFire, getMaxFire(), getCurrentFire(), setMaxFire(), and setCurrentFire().  Test each of these methods, and include a screenshot of each test in your word document.  (First call the appropriate “set” method, then call the corresponding “get” method for the variable you just set).
36)	Export your word document as a PDF.












