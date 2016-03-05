// Conrad Ozarek
// Mar 4,2016
// Lab 6
//
// Create a program that generates a helix twist thing

import java.util.Scanner; //import
        
public class TwistGenerator {
    //main method required for every Java program
    public static void main(String[] args) {
        

        Scanner myScanner; //declare
        myScanner=new Scanner(System.in); //construct
        
        //ask for length of twist
        System.out.print("Enter the length of the twist: ");
        //set arbitrary and temprary value for length
        int length=-1;
        
        //while loop to continue aasking for input until a positive int is input
        while (true){
            if ( myScanner.hasNextInt() ){
            length=myScanner.nextInt();
                if (length<0){
                    System.out.println("Invalid Input");
                    System.out.print("Enter the length of the twist: ");
                    myScanner.nextLine();
                }
            else {
                break;
            }
            }
            else {
                System.out.println("Invalid Input");
                System.out.print("Enter the length of the twist: ");
                myScanner.nextLine();
            }
        }
        
        //determine the amount of complete \ / will be made and the remaining amount to print
        int divLength=length/3;
        int remLength=length%3;
        
        // for loop to print the first line. prints complete sets of 3 characters and then the last amount left
        for (int i=0; i<divLength; i++){
            System.out.print("\\ /");
        }
        if (remLength==1) {
            System.out.print("\\");
        }
        if (remLength==2) {
            System.out.print("\\ ");
        }
        
        //prints nothing but goes to next line
        System.out.println(" ");
        
        //prints the amount of X but only for complete sets of 3 characters
        for (int j=0; j<divLength; j++){
            System.out.print(" X ");
        }
        
        //prints nothing but goes to next line
        System.out.println(" ");
        
        // for loop to print the last line. prints complete sets of 3 characters and then the last amount left
        for (int k=0; k<divLength; k++){
            System.out.print("/ \\");
        }
        if (remLength==1) {
            System.out.print("/");
        }
        if (remLength==2) {
            System.out.print("/ ");
        }
        
        //prints nothing but moves to next line in terminal
        System.out.println(" ");
  
    }   //end of main method
}   //end of class