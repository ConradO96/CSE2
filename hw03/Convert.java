// Conrad Ozarek
// Feb 11,2015
// Homework 3 pt1
//
// Create a program that converts input data from meters to inches

import java.util.Scanner; //import
        
public class Convert {
    //main method required for every Java program
    public static void main(String[] args) {
        

        Scanner myScanner; //declare
        myScanner=new Scanner(System.in); //construct
        
        //ask for meters to be converted and store in variable
        System.out.println("Enter the value in meters: ");
        double Meters=myScanner.nextDouble();
        
        //convert to inches and assign to new variable
        double ConvertedInches=Meters*39.3701;
        
        //print result
        System.out.println("The value entered: "+Meters+" meters, is equal to "+ConvertedInches+" inches");
        
    }   //end of main method
}   //end of class