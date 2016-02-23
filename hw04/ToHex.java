// Conrad Ozarek
// Feb 21,2015
// Homework 04
//
// Create a program converts RGB values into hexadecimal

import java.util.Scanner; //import

public class ToHex {
    //main method required for every Java program
    public static void main(String[] args) {
        
        Scanner myScanner; //declare
        myScanner=new Scanner(System.in); //construct
        
        //ask for RGB values and assign to variable
        System.out.println("Enter the RGB values: ");
        int valR=myScanner.nextInt();
        int valG=myScanner.nextInt();
        int valB=myScanner.nextInt();
        
        // declare variables to store the amount of times 16 goes into the value entered (truncates the decimal)
        int divValR=valR/16;
        int divValG=valG/16;
        int divValB=valB/16;

        // declare variable for remainder and assign the remainder after division to it
        int remValR=valR%16;
        int remValG=valG%16;
        int remValB=valB%16;
        
        // check if values entered fall in  the range
        if ((valR>=0 && valR<=255) && (valG>=0 && valG<=255) && (valB>=0 && valB<=255)){
        
        //switch statement which converts the amount of times 16 can go into entered value if it is greater than 9 times
        switch (divValR){
            case 10:
                System.out.print("A");
                break;
            case 11:
                System.out.print("B");
                break;
            case 12:
                System.out.print("C");
                break;
            case 13:
                System.out.print("D");
                break;
            case 14:
                System.out.print("E");
                break;
            case 15:
                System.out.print("F");
                break;
            case 16:
                System.out.print("0");
                break;
            default:
                System.out.print(divValR);
                break;
        }

        //switch statement which converts the remainder if it is greater than 9
        switch (remValR){
            case 10:
                System.out.print("A");
                break;
            case 11:
                System.out.print("B");
                break;
            case 12:
                System.out.print("C");
                break;
            case 13:
                System.out.print("D");
                break;
            case 14:
                System.out.print("E");
                break;
            case 15:
                System.out.print("F");
                break;
            case 16:
                System.out.print("0");
                break;
            default:
                System.out.print(remValR);
                break;
        }
        
        //switch statement which converts the amount of times 16 can go into entered value if it is greater than 9 times
            switch (divValG){
            case 10:
                System.out.print("A");
                break;
            case 11:
                System.out.print("B");
                break;
            case 12:
                System.out.print("C");
                break;
            case 13:
                System.out.print("D");
                break;
            case 14:
                System.out.print("E");
                break;
            case 15:
                System.out.print("F");
                break;
            case 16:
                System.out.print("0");
                break;
            default:
                System.out.print(divValG);
                break;
        }
                
        //switch statement which converts the remainder if it is greater than 9
        switch (remValG){
            case 10:
                System.out.print("A");
                break;
            case 11:
                System.out.print("B");
                break;
            case 12:
                System.out.print("C");
                break;
            case 13:
                System.out.print("D");
                break;
            case 14:
                System.out.print("E");
                break;
            case 15:
                System.out.print("F");
                break;
            case 16:
                System.out.print("0");
                break;
            default:
                System.out.print(remValG);
                break;
        }
        
        //switch statement which converts the amount of times 16 can go into entered value if it is greater than 9 times
            switch (divValB){
            case 10:
                System.out.print("A");
                break;
            case 11:
                System.out.print("B");
                break;
            case 12:
                System.out.print("C");
                break;
            case 13:
                System.out.print("D");
                break;
            case 14:
                System.out.print("E");
                break;
            case 15:
                System.out.print("F");
                break;
            case 16:
                System.out.print("0");
                break;
            default:
                System.out.print(divValB);
                break;
        }
                
        //switch statement which converts the remainder if it is greater than 9
        switch (remValB){
            case 10:
                System.out.println("A");
                break;
            case 11:
                System.out.println("B");
                break;
            case 12:
                System.out.println("C");
                break;
            case 13:
                System.out.println("D");
                break;
            case 14:
                System.out.println("E");
                break;
            case 15:
                System.out.println("F");
                break;
            case 16:
                System.out.println("0");
                break;
            default:
                System.out.println(remValB);
                break;
        }
        
        } //   closes if statement that checks if values are in the range
        
        // if not within range, return the following
        else {
        System.out.println("Sorry, you must enter values between 0-255");
        }
        
    }   //end of main method
}   //end of class