import java.util.Scanner;
/**
 * Tests all of our classes and contains main method
 *
 * @author Phil
 */
public class Lab07Tester

// TODOS
// [ X ] Print message to let user know tasks will begin
// [ X ] Create Paper class
// [ X ] instance vars height, width in inches
// [ X ] create public constant for millimeters per inch
// [ X ] Create constructor that will take values for height / width
// [ X ] Format test output to 2 decimals
// [ X ] Print statement for Task 2 with spacing
// [ X ] Create NumberCalculator class
// [ X ] Two integer instance variables for NumberCalculator
// [ X ] Constructor that accepts values for instance vars
// [ X ] Create Getters getSum(), getDifference(), getProduct(), getAverage
// getDistance(), getMaximum(), getMinimum()
// [ X ] Use Scanner to prompt user for two integers
// [ X ] Create NumberCalculator using input values
// [ X ] Print results of all methods
// [ X ] Properly format output, check E4.5 in book
// [ X ] Print task 03 message
// [ X ] Create CarSimulator class
// [ X ] create instance vars, constructor, methods
// [ X ] Prompt user for input vals 25 gallons, 26.35MPG, 2.13 Price
// [ X ] Create Tuning Circuit Class
// [ X ] Create three instance variables Frequency, Cmin, Cmax
// [ X ] Create a constructor that accepts values for instance vars
// [ X ] Create two methods getFMin() and getFMax()
// [ X ] Prompt user for all three values (Freq, Cmin, Cmax)




{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        System.out.println("The tasks will now begin");
        System.out.println("Beginning Task 01");
        
        // Creating Paper object using 8.2 x 5.3
        Paper testPaper = new Paper(8.2, 5.3);
        
        // Testing getters for Paper
        
        System.out.println(); // Spacing
        System.out.printf("The width in inches is %.2f%n", testPaper.getWidthInInches());
        System.out.printf("The height in inches is %.2f%n", testPaper.getHeightInInches());
        System.out.printf("The width in millimeters is %.2f%n", testPaper.getWidthInMillimeters());
        System.out.printf("The height in millimeters is %.2f%n", testPaper.getHeightInMillimeters());
        System.out.println(); // Spacing
        System.out.println("Beginning Task 02");
        System.out.println();
        
        // Have scanner prompt user for firstVal and secondVal
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter an integer value");
        int userFirstVal = sc.nextInt();
        System.out.print("Please enter another integer value");
        int userSecondVal = sc.nextInt();
        
        // Creating NumberCalculator with userinput vals
        NumberCalculator testCalculator = new NumberCalculator(userFirstVal, userSecondVal);
        
        // Testing Number Calculator Methods
        System.out.printf("The sum of your two numbers was %d%n", testCalculator.getSum());
        System.out.printf("The difference of your two numbers was %d%n", testCalculator.getDifference());
        System.out.printf("The product of your two numbers was %d%n", testCalculator.getProduct());
        System.out.printf("The average of your two numbers was %.2f%n", testCalculator.getAverage());
        System.out.printf("The distance between your two numbers was %d%n", testCalculator.getDistance());
        System.out.printf("The maximum of your two numbers was %d%n", testCalculator.getMaximum());
        System.out.printf("The minimum of your two numbers was %d%n", testCalculator.getMinimum());
        
        System.out.println("Starting Task 03\n");
        
        System.out.print("Please enter the number of gallons in your tank");
        double userNumGallonsInTank = sc.nextDouble();
        
        System.out.print("Please enter the miles per gallon for your car");
        double userMilesPerGallon = sc.nextDouble();
        
        System.out.print("Please enter the price of gas near you per gallon");
        double userPricePerGallon = sc.nextDouble();
        
        // Creating CarSimulator with values
        
        CarSimulator testCar = new CarSimulator(userNumGallonsInTank, userMilesPerGallon, userPricePerGallon);
        
        // Testing methods
        System.out.printf("It costs you %.2f to drive 100 miles\n", testCar.getCostPer100Miles());
        System.out.printf("Your car can travel %.2f before running out of fuel\n", testCar.getDistance());
        
        System.out.println(); // spacing

        // Prompt the user for values for frequency, Cmin, and Cmax
        System.out.print("Enter the frequency (Hz): ");
        double frequency = sc.nextDouble();

        System.out.print("Enter the minimum capacitance (F): ");
        double Cmin = sc.nextDouble();

        System.out.print("Enter the maximum capacitance (F): ");
        double Cmax = sc.nextDouble();

        // Create a new TuningCircuit object with the values entered by the user
        TuningCircuit circuit = new TuningCircuit(frequency, Cmin, Cmax);

        // Print the minimum and maximum frequencies
        System.out.printf("Minimum frequency: %.2f Hz\n", circuit.getFMin());
        System.out.printf("Maximum frequency: %.2f Hz\n", circuit.getFMax());
        
        
        
    }
}

