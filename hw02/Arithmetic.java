// Conrad Ozarek
// Feb 06,2015
// Homework 2
//
// Create a program that computes the cost of the items bought
// Calculates:
//     total cost of each item
//     sales tax charged buying each item
//     total cost of purchse
//     total sales tax
//     total paid for transaction including sales tax
//

public class Arithmetic {
    //main method required for every Java program
    public static void main(String[] args) {
        
        //Number of pairs of pants
        int numPants = 3;
        //Cost per pair of pants
        double pantsPrice = 34.98;

        //Number of sweatshirts
        int numShirts = 2;
        //Cost per shirt
        double shirtPrice = 24.99;

        //Number of belts
        int numBelts = 1;
        //cost per box of envelopes
        double beltCost = 33.99;

        //the tax rate
        double paSalesTax = 0.06;
        
        //declare variables for total cost for each item type
        double totalPantsCost, totalShirtCost, totalBeltCost;
        //declare variables for the sales tax for each item type total
        double salestaxPants, salestaxShirt, salestaxBelt;
        //declare variable for total cost, sales tax, and grand total
        double totalCostOfPurchase, totalSalesTax, totalPaid;
        
        //calclate total cost for each item type
        totalPantsCost=pantsPrice*numPants;
        totalShirtCost=shirtPrice*numShirts;
        totalBeltCost=beltCost*numBelts;
        //calculate total sales tax for each item type 
        //note: multiplied by 100 to prepare for upcoming conversion
        salestaxPants=totalPantsCost*paSalesTax*100;
        salestaxShirt=totalShirtCost*paSalesTax*100;
        salestaxBelt=totalBeltCost*paSalesTax*100;
        
        //
        //convert double of calculated sales tax for each item into an integer, 
        //then convert back into double and divide by 100 to get sales tax with
        //values recorded to the tenths of the decimal
        //
        
        //converting for pants
        int salestaxPantsConverted=(int)salestaxPants;
        double salestaxPantsConvertedBack=(int)salestaxPantsConverted;
        salestaxPantsConvertedBack=salestaxPantsConvertedBack/100;
        salestaxPants=salestaxPantsConvertedBack;
        //converting for shirt
        int salestaxShirtConverted=(int)salestaxShirt;
        double salestaxShirtConvertedBack=(int)salestaxShirtConverted;
        salestaxShirtConvertedBack=salestaxShirtConvertedBack/100;
        salestaxShirt=salestaxShirtConvertedBack;
        //converting for belt
        int salestaxBeltConverted=(int)salestaxBelt;
        double salestaxBeltConvertedBack=(int)salestaxBeltConverted;
        salestaxBeltConvertedBack=salestaxBeltConvertedBack/100;
        salestaxBelt=salestaxBeltConvertedBack;
        
        // calculate the totals by summing them up respectively
        totalCostOfPurchase=totalBeltCost+totalPantsCost+totalShirtCost;
        totalSalesTax=salestaxPants+salestaxShirt+salestaxBelt;
        totalPaid=totalCostOfPurchase+totalSalesTax;
        
        //prints all the values requested and calculated previously
        System.out.println("The total cost for the pants was "+totalPantsCost);
        System.out.println("The total cost for the shirsts was "+totalShirtCost);
        System.out.println("The total cost for the belts was "+totalBeltCost);
        
        System.out.println("The sales tax for buying the pants was "+salestaxPants);
        System.out.println("The sales tax for buying the shirts was "+salestaxShirt);
        System.out.println("The sales tax for buying the belt(s) was "+salestaxBelt);
        
        System.out.println("The total cost of purchase was "+totalCostOfPurchase);
        System.out.println("The total sales tax was "+totalSalesTax);
        System.out.println("The total paid including tax was "+totalPaid);
        
    }   //end of main method
}   //end of class