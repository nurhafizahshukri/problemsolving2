/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantbill1;

import java.util.Scanner;


/**
 *
 * @author User
 */
public class RestaurantBill1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
    
                double mealCharge;
		final double tax = 0.0675; // 6.75% constant amount of meal charge
		double taxAmount;
		double totalWithTax;
		final double tip = 0.20; // 20% constant amount of total amount after adding tax amount
		double tipAmount; 
		double totalBill;
		
		Scanner keyboard = new Scanner(System.in);
				
		//user has to enter the charge for the meal
		System.out.print("Please enter the charge for your meal $");
		mealCharge = keyboard.nextDouble();
                
                
                check_invariant(mealCharge);
      
		keyboard.nextLine();
				
		//calculate meal charge, tax amount, tip amount, and total bill
		taxAmount = mealCharge * tax;
		totalWithTax = mealCharge + taxAmount;
		tipAmount = totalWithTax * tip;
		totalBill = totalWithTax + tipAmount;
		
		//display to user meal charge, tax amount, tip amount, and total bill
		System.out.println("Your meal charge amount is $" + mealCharge + ".");
		System.out.println("Your tax amount is $" + taxAmount + ".");
		System.out.println("Your tip amount is $" + tipAmount + ".");
		System.out.println("-----------------------------------");
		System.out.println("Your total bill amount is $" + totalBill + ".");
                
 
		//end the program
		System.exit(0);
	}


//invariant && assert
    private static void check_invariant(double x) {
      assert x != 0:" Your inpput is invalid"; 
    }



}
