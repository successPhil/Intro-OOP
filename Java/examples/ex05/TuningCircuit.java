
/**
 * Write a description of class TuningCircuit here.
 */
public class TuningCircuit
{
    // Instance vars
    double frequency;
    double cMax;
    double cMin;
    
    // Constructor that accepts values for instance vars
    public TuningCircuit(double freq, double cMax, double cMin){
        this.frequency = freq;
        this.cMax = cMax;
        this.cMin = cMin;
    }
    
    // Getters
    // Calculates L and returns minimum frequency
    public double getFMin(){
        double L = calculateL();
        return (2 * Math.PI) / (Math.sqrt( L * cMax));
    }
    
    // Calculates L and returns maximum frequency
    public double getFMax(){
        double L = calculateL();
        return (2 * Math.PI) / (Math.sqrt( L * cMin));
    }
    
    // Helper method to calculate L
    // Improves readability
    
    public double calculateL(){
        double geometricMeanC = Math.sqrt(cMin * cMax);
        return (4 * Math.pow(Math.PI, 2)) / (Math.pow(frequency, 2) * geometricMeanC);
    }
    
    
    
}

