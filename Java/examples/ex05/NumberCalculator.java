
/**
 * Basic Number Calculator
 */
public class NumberCalculator
{
    // instance variables
    int firstVal;
    int secondVal;
    
    // Constructor with 2 args for instance vars
    public NumberCalculator(int val1, int val2){
        this.firstVal = val1;
        this.secondVal = val2;
    }
    
    // Getters
    
    public int getSum(){
        return this.firstVal + this.secondVal;
    }
    
    public int getDifference(){
        return this.getMaximum() - this.getMinimum();
    }
    
    public int getProduct(){
        return this.firstVal * this.secondVal;
    }
    
    public double getAverage(){
        return (double) this.getSum() / 2;
    }
    
    public int getDistance(){
        return Math.abs(this.getDifference());
    }
    
    public int getMaximum(){
        return Math.max(this.firstVal, this.secondVal);
    }
    
    public int getMinimum(){
        return Math.min(this.firstVal, this.secondVal);
    }
    }



