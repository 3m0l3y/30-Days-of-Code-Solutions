import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.    
        double theResult;
        
        double blah = mealCost * tipPercent;
        double blah2 = mealCost * taxPercent;
        blah = blah/100;
        blah2 = blah2/100;
        theResult = blah + blah2 + mealCost;
        
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(theResult);
      
        // Print your result
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}
