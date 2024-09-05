import java.util.Scanner;

public class Runner 
{
   public static void main(String[] args) 
   {
       
      System.out.println("This is the transportation project!\n");

      //Outlines the formula used for calculating the trip cost
      System.out.println("Here is the gas cost formula");
      System.out.println("price * (distance / miles per gallon) + costs\n");

      //Plugs the data from the first trip into the formula for trip 1
      System.out.println("The value for the first trip is:");
      System.out.println("3.59 * (8 / 14) + 0");
      //Calculates the cost in a mathematical expression for trip 1
      System.out.println("Which calculates to be...");
      System.out.println(3.59 * (8.0 / 14.0) + 0); //The literal values for trip 1

      //Notes what locations I went to for trip 1
      System.out.println("Places I am going in order:");
      String[] trip1Stops = {"Grandma's House", "Jordan High", "Home"};
      for (int i = 0; i < trip1Stops.length; i++){
         System.out.println("  - " + trip1Stops[i]);
      }
      System.out.println("No items were bought during this trip");

      
      //Trip 2
      // Plugs the data from the first trip into the formula for trip 2
      System.out.println("\n\nThe value for the second trip is:");
      System.out.println("3.59 * (8 / 14) + 0");
      //Calculates the cost in a mathematical expression for trip 2
      System.out.println("Which calculates to be...");
      System.out.println(3.59 * (8.0 / 14.0) + 0); //The literal values for trip 2

      //Notes what locations I went to for trip 2
      System.out.println("Places I am going in order:");
      String[] trip2Stops = {"Jordan High", "Grandma's House", "CTEC"};
      for (int i = 0; i < trip2Stops.length; i++){
         System.out.println("  " + (i + 1) + ". " + trip2Stops[i]);
      }
      System.out.println("No items were bought during this trip");

      //Trip 3
      //Declare variables
      double priceOfGas; //Has no value
      int extraCost;
      int mpg;
      double miles;
      int tripNumber;

      //Initialize variable
      priceOfGas = 3.59;
      tripNumber = 3;
      miles = 9.5;
      mpg = 14;
      extraCost = 0;

      double tripTotalCost = priceOfGas * (miles / (double) mpg) + extraCost;
      
       
      System.out.println("The values for trip 3 are: ");
      System.out.println("Price of gas = " + priceOfGas);
      System.out.println("Extra cost of trip = " + extraCost);
      System.out.println("Miles per gallon = " + mpg);
      System.out.println("Miles traveled = " + miles);

      String tripInfo = "The total cost is for trip " + tripNumber + " is: " + tripTotalCost;
      System.out.println(tripInfo);

      System.out.println("Let's double the trip cost");
      tripTotalCost *= 2;
      System.out.println("New cost of trip: " + tripTotalCost + "\n");

      //textInput is an instance of a Scanner object/class
      Scanner textInput = new Scanner(System.in);
      tripNumber++;

      //Gather trip values for calculation
      System.out.println("What is the price of gas?");
      priceOfGas = textInput.nextDouble();
      System.out.println("What is the distance in miles?");
      miles = textInput.nextDouble();
      System.out.println("What is the miles per gallon of your car?");
      mpg = textInput.nextInt();
      System.out.println("What is the extra cost of the trip?");
      extraCost = textInput.nextInt();

      //Outputting and calculating results
      tripTotalCost = priceOfGas * (miles / (double) mpg) + extraCost;
      System.out.println("\nThe total cost for trip " + tripNumber + " is: $" + tripTotalCost);

      System.out.println("\nCalculating the average for our trips");

      double tripFourCost = priceOfGas * (miles / (double) mpg) + extraCost;

      //Stores the input of the costs into an array
      //I decided to code it a bit differently than what was guided to have some fun
      double costs[] = {0.0, 0.0, 0.0, 0.0};
      for (int i = 0; i < costs.length; i++){
         System.out.println("Please enter the cost for trip " + (i + 1));
         costs[i] = textInput.nextDouble();
      }
      double sum = costs[0] + costs[1] + costs[2] + costs[3];
      double mean = Math.round(sum / 0.04) / 100.0; //Rounds to two decimal places


      System.out.println("The mean value for the trips taken is: " + mean);

      System.out.println("\nUsing Java Math methods to calculate triangular distance");
      System.out.println("Type in the first leg distance");
      double firstLeg = textInput.nextDouble();
      System.out.println("Type in the second leg distance");
      double secondLeg = textInput.nextDouble();

      double squaredSum = Math.pow(firstLeg, 2) + Math.pow(secondLeg, 2);

      double triangularDistance = Math.sqrt(squaredSum);

      System.out.println("The distance is calculated to be: " + triangularDistance);

      
      System.out.println("\nModeling the real world with changing gas prices");

      System.out.println("Please type in the maximum percentage change in gas");
      System.out.println("Up to ten percent");
      int percentageChange = (int) (textInput.nextInt() * Math.random());

      System.out.println("The old price of gas was: " + priceOfGas);
      //Calculate the new price by multiplying the random percent change of the original price
      int posNegScalar = (int) (Math.random() * 3) - 1;

      priceOfGas += posNegScalar * percentageChange * 0.01 * priceOfGas;
      System.out.println("The new price of gas is: " + priceOfGas);
      System.out.println("A difference of " + percentageChange);
 
      System.out.println("The value for the first trip is:");
      System.out.println("3.59 * (8 / 14) + 0");
      //Calculates the cost in a mathematical expression for trip 1
      System.out.println("Which calculates to be...");
      System.out.println(3.59 * (8.0 / 14.0) + 0);

      System.out.println("\n\nThe value for the second trip is:");
      System.out.println("3.59 * (8 / 14) + 0");
      //Calculates the cost in a mathematical expression for trip 2
      System.out.println("Which calculates to be...");
      System.out.println(3.59 * (8.0 / 14.0) + 0);

      boolean isFirstCheaper = (3.59 * (8.0 / 14.0) + 0) < (3.59 * (8.0 / 14.0) + 0);
      System.out.println("The first trip is cheaper: " + isFirstCheaper);

      double tripOneCost = 3.59 * (8.0 / 14.0) + 0;
      double tripTwoCost = 3.59 * (8.0 / 14.0) + 0;

      boolean isSecondCheaper = tripOneCost >= tripTwoCost;

      System.out.println("Is the second trip cheaper or the same: " + isSecondCheaper);

      boolean isFirstCheaperThanThird = tripOneCost < tripTotalCost;
      boolean isThirdCheaperThanFourth = tripTotalCost < tripFourCost;
      boolean isSecondCheaperThanThird = tripTwoCost < tripTotalCost;
      boolean isFirstCheaperThanSecond = tripOneCost < tripFourCost;
      System.out.println("Is trip 1 cheaper than trip 3: " + isFirstCheaperThanThird);
      System.out.println("Is trip 3 cheaper than trip 4: " + isThirdCheaperThanFourth);
      System.out.println("Is trip 2 cheaper than trip 3: " + isSecondCheaperThanThird);
      System.out.println("Is trip 1 cheaper than trip 3: " + isFirstCheaperThanSecond);
      
   }
}
