// Conrad Ozarek
// Mar 5,2016
// Hw 6
//
// Create a program that has a spinner

import java.util.Scanner; //import
        
public class TextSpinner {
    //main method required for every Java program
    public static void main(String[] args) {
        
        //create infinite while loop and then print all values below infinitely
        int y=1;
        while (y>0){
            System.out.print("/");
            System.out.print("\b");
            System.out.print("-");
            System.out.print("\b");
            System.out.print("\\");
            System.out.print("\b");
            System.out.print("|");
            System.out.print("\b");
        }
        
    }
}


