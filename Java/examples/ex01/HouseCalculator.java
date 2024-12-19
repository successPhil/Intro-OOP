import java.awt.Rectangle;
public class HouseCalculator
{
    

    public static void main(String[] args){
        // Declare 3 variables
        double height = 25.5;
        double width = 65.2;
        double depth = 75.75;
        System.out.println("House Calculator begins now: ");
        System.out.println("height: "+height+" width: "+width+" depth: "+depth);
        
        // Declare 3 variables for window height, width, and number of windows
        double windowHeight = 1.2;
        double windowWidth = .75;
        int totalWindows = 19;
        
        // Declare 3 variables for doors
        double doorHeight = 1.75;
        double doorWidth = .95;
        int totalDoors = 5;
        
        System.out.println("window ht: "+windowHeight+" window width: "+windowWidth+" num windows: "+totalWindows);
        System.out.println("door ht: "+doorHeight+" door width: "+doorWidth+" num doors: "+totalDoors);
        // Declare 6 variables, one for each area
        double roofArea = 0;
        double floorArea = 0;
        double frontArea = 0;
        double backArea = 0;
        double leftArea = 0;
        double rightArea = 0;
        // Declare twp variables
        // total surface area of house
        // total surface area without doors and windows
        double totalSurfaceArea = 0;
        double totalSurfaceAreaMinusDoorsAndWindows = 0;
        
        // Declare 7 String variables
        String good = "good";
        String bad = "bad";
        String boring = "boring";
        String exciting = "exciting";
        String big = "big";
        String small = "small";
        String name = "phil";
        
        // Calculations for areas
        frontArea = width * height;
        backArea = width * height;
        leftArea = height * depth;
        rightArea = height * depth;
        roofArea = width * depth;
        floorArea = width * depth;
        
        
        // Print statements for surface area
        System.out.println("The front and back surface area is: "+frontArea);
        System.out.println("The left and right surface area is: "+leftArea);
        System.out.println("The roof and floor surface area is: "+roofArea);
        
        // Print statement that tells whose house
        System.out.println("This is "+name+"'s house. It is "+boring);
        // Assigning total surface area without windows and doors to previous variable
        totalSurfaceArea = frontArea + leftArea + roofArea;
        // Printing total surface area without windows and doors
        System.out.println("TotalArea, ignoring windows and doors: "+totalSurfaceArea);
        // Calculate surface area minus windows
        totalSurfaceAreaMinusDoorsAndWindows = totalSurfaceArea - (windowHeight * windowWidth * totalWindows);
        System.out.println("TotalArea, without windows: "+totalSurfaceAreaMinusDoorsAndWindows);
        System.out.println("This is "+name+"'s house. It is "+exciting);
        // Calculate surface area minus windows, subtracting doors
        totalSurfaceAreaMinusDoorsAndWindows = totalSurfaceAreaMinusDoorsAndWindows - (doorHeight * doorWidth * totalDoors);
        System.out.println("TotalArea without windows and doors: "+totalSurfaceAreaMinusDoorsAndWindows);
        
        // Create Rectangle at point (7,13) with width = 5, height = 10
        
        // Add import java.awt.Rectangle
        // Constructor (int x, int y, int width, int height)
        Rectangle myRectangle = new Rectangle(7,13,5,10);
        
        // Print the x location of Rectangle using getX()
        System.out.println("Rectangle x location: "+myRectangle.getX());
        // Print y location of Rectangle using getY()
        System.out.println("Rectangle y location: "+myRectangle.getY());
        // Print the width of the Rectangle
        System.out.println("Rectangle width: "+myRectangle.getWidth());
        // Print the height of the Rectangle
        System.out.println("Rectangle height: "+myRectangle.getHeight());
        // Use grow() on Rectangle to increase width by 8, and height by 4
        myRectangle.grow(2,4);
        
        System.out.println("After growing the Rectangle");
         // Print the x location of Rectangle using getX()
        System.out.println("Rectangle x location: "+myRectangle.getX());
        // Print y location of Rectangle using getY()
        System.out.println("Rectangle y location: "+myRectangle.getY());
        // Print the width of the Rectangle
        System.out.println("Rectangle width: "+myRectangle.getWidth());
        // Print the height of the Rectangle
        System.out.println("Rectangle height: "+myRectangle.getHeight());
       
        // Use the translate() method to place the rectangle back at its starting location
        myRectangle.translate(2,4);
        System.out.println("After translating the Rectangle");
         // Print the x location of Rectangle using getX()
        System.out.println("Rectangle x location: "+myRectangle.getX());
        // Print y location of Rectangle using getY()
        System.out.println("Rectangle y location: "+myRectangle.getY());
        
        
        
        
        
        
        
        
    }
}

