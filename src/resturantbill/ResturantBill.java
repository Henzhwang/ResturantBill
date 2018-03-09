/*
 * @HenryHuang
 * ResturantBill.java
 * March 8, 2018
 * This program is uses to calculate the total price of a resturant bill.
 */

package resturantbill;

/**
 *
 * @author shhua8751
 */
import java.text.*;

public class ResturantBill {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //Listing all the variables will be use in the program.
        double price;
        double HST;
        double tips;
        double totalprice;
        
        //This code is uses to rounf the number into 2 decimal places.
        DecimalFormat x = new DecimalFormat ("###.##");
       
        price = 20.56;       //The price for the meal is $20.56.
        HST = price * 0.13;  //Ontario HST is 13%.
        tips = price * 0.15; //Tips are 15%.
        
        totalprice = price + HST  + tips; //Total price is the sum of every factors
        
        
        System.out.println("Meal price: $" + price + "\nHST: $" + x.format(HST) + 
                "\nTips: $" + x.format(tips) + "\nThe total price is: $" + 
                x.format(totalprice));
        //Outprint meal price,HST,tips and total price for the meal.
        
        
                
    }
    
}
