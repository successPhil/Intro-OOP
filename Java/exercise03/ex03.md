<h1>Complete the following tasks:</h1>

1.	Create a new project.  Create a new class called PlayerPiece.  Replace all the code in the PlayerPiece.java file with PlayerPiece.java.txt (exercise03/PlayerPiece.java.txt)

2.	Create a new class called PlayerPieceTester.  Replace all the code in PlayerPieceTester.java with the code in PlayerPieceTester.java (Also included in exercise03)

3.	Right click on the PlayerPieceTester class, and choose the main method.  When asked for arguments, just click ok.  You should see a terminal window pop up that displays expected results, as well as actual results.  Go and look at the main method in the PlayerPieceTester class and make sure that you understand how the results were calculated and printed.  You will need to create tests for your methods below.  (You should create a method, then create a test for it).

4.	Fill in the no argument constructor for the PlayerPiece class.  Initialize instance variables to the values indicated in the comments next to each instance variable in the starter code.  So your first line of code in the no argument constructor will be pieceName = “no name”;

5.	Create a test in the PlayerPieceTester class that verifies your values are set correctly in the constructor.  (Hint: use the appropriate get() method for each instance variable).

6.	Fill in the second constructor listed that takes in a long list of parameters.  Initialize instance variables to the values of the arguments.  The first one has been done for you. (pieceName).

7.	Create a test in the PlayerPieceTester class that verifies your values are set correctly in this constructor.  (Again, use the get() methods to access values of your PlayerPiece object).

8.	Edit your mutator methods in the PlayerPiece class that move the piece by one location. moveUp(), moveDown(), moveLeft(), and moveRight()

9.	moveUp() will need to add 1 to locY.  

10.	moveDown() will need to subtract 1 from locY.  

11.	moveLeft() will need to subtract 1 from locX.  

12.	moveRight() will need to add 1 to locX.  

13.	Create a test for each of these methods created in steps 9,10,11,12 (You will call the “move” method on one line of code, then print the results from the appropriate “get” method on the next line to test these methods.  For example, you call moveUp(), you will need to then use getLocY() to ensure the piece has moved up).

14.	Create a mutator method in the PlayerPiece class called setLocXY(int x, int y).  As you can see this method will take 2 int's as parameters.  Inside the method set the instance variables locX and locY to the appropriate parameters of the method.

15.	Create a test for setLocXY()

16.	Create a method inside of the PlayerPiece class called deductHealth(int amt).  Return type void. This method will deduct amt from the instance variable currentHealth.

17.	Create a test for deductHealth()

18.	Create a method inside of the PlayerPiece class called addHealth(int amt).  Return type void. This method will add amt to the instance variable currentHealth.

19.	Create a test for addHealth()

20.	Once you have created all methods, run your tests, and take a screen-shot of your output to include with your project.  Text output is OK, does not have to be a screen-shot.

21.	Create javadoc comments for the PlayerPiece class.  You should comment the class itself, every method, every parameter, and every return value in this class.  You can select Tools → Project Documentation or just press (ctrl + j) to view your current documentation.  The GameBoard class has already been commented for you.  If a box pops up asking to view or regenerate, make sure you click “regenerate”.  This will recreate the javadocs based on the javadoc comments that you place within your code.  (You can access a commented version of GameBoard.java.txt under the exercise03/GameBoard.java.  We do not need this class to complete this lab however, so it is not included in your BlueJ project).

	
   
