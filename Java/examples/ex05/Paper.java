
/**
 * Represents a sheet of paper in inches
 *
 * @author Phil
 * @version 1
 */
public class Paper
{
    // constants
    public final double MILLIMETERS_PER_INCH = 25.4;
    
    // instance vars
    double height;
    double width;
    
    public Paper(double height, double width){
        this.height = height;
        this.width = width;
    }
    
    // Getters
    public double getWidthInMillimeters(){
        return this.width * MILLIMETERS_PER_INCH;
    }
    
    public double getHeightInMillimeters(){
        return this.height * MILLIMETERS_PER_INCH;
    }
    
    public double getWidthInInches(){
        return this.width;
    }
    
    public double getHeightInInches(){
        return this.height;
    }
}

