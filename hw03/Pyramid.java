// Conrad Ozarek
// Feb 11,2015
// Homework 3 pt2
//
// Create a program that finds the volume of a pyramid

import java.util.Scanner; //import
        
public class Pyramid {
    //main method required for every Java program
    public static void main(String[] args) {
        

        Scanner myScanner; //declare
        myScanner=new Scanner(System.in); //construct
        
        //ask for input values for sides and height of pyramid and store in variables
        System.out.println("The square side of a pyramid is (input value): ");
        double SquareLength=myScanner.nextDouble();
        System.out.println("The height of a pyramid is (input value): ");
        double Height=myScanner.nextDouble();
        
        //calculate volume from input values and assign to new variable
        double Volume=(SquareLength*SquareLength*Height)/3;
        
        //print value calculated
        System.out.println("The volume is: "+Volume);
                
    }   //end of main method
}   //end of class