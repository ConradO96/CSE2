// Conrad Ozarek
// Feb 12,2015
// Lab 3
//
// Create a program that splits a check evenly

import java.util.Scanner; //import
        
public class Check {
    //main method required for every Java program
    public static void main(String[] args) {
        

        Scanner myScanner; //declare
        myScanner=new Scanner(System.in); //construct
        
        //ask user for values of the bill, tip, and number of people
        //assign each value to appropriate variable
        System.out.print("Enter the original cost of the check (in the form xx.xx): ");
        double checkCost=myScanner.nextDouble();
        System.out.print("Enter the percentage tip you wish to pay as a whole number: ");
        double tipPercent=myScanner.nextDouble();
        tipPercent /=100;
        System.out.print("Enter the number of people who went out to dinner: ");
        int numPeople=myScanner.nextInt();
        
        //declare variables we will calculate
        double totalCost, costPerPerson;
        int dollars,dimes,pennies;
        
        //perform calculations for total cost and divide by number of people
        totalCost=checkCost*(1+tipPercent);
        costPerPerson=totalCost/numPeople;
        
        //perform calculation for finding the change (not full dollar amount)
        dollars=(int)costPerPerson;
        dimes=(int)(costPerPerson*10)%10;
        pennies=(int)(costPerPerson*100)%10;
        
        //print the amount each person owes
        System.out.println("Each person in the group owes $"+dollars+'.'+dimes+pennies);
        
    }   //end of main method
}   //end of class