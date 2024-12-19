
/**
 * This class is a representation of a simulated car
 **/
public class CarSimulator
{
    // instance vars
    double numGallonsInTank;
    double milesPerGallon;
    double pricePerGallon;
    
    // constructor to take in args from user
    public CarSimulator(double userGallonsInTank,double userMilesPerGal,
    double userPricePerGal){
        this.numGallonsInTank = userGallonsInTank;
        this.milesPerGallon = userMilesPerGal;
        this.pricePerGallon = userPricePerGal;
    }
    
    // Getters
    public double getCostPer100Miles(){
        return (100.00 / this.milesPerGallon) * this.pricePerGallon;
    }
    
    public double getDistance(){
        return this.milesPerGallon * this.numGallonsInTank;
    }
}

