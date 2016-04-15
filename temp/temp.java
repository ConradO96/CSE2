// Conrad Ozarek
// Mar 28,2016
// Hw 09
//
// Create a rectangle generator for int and Strings

import java.util.Random;
import java.util.Scanner; //import

public class temp {
    //main method required for every Java program
    public static void main(String[] args) {
        
        int input=9;
        boolean topDone=false;
        for (int i=input; i>1; i-=2){
            for (int k=0; k<i; k++){
                System.out.print("*");
            }
            System.out.println();
            for (int j=0; j<(input/2)-(i/2)+1; j++){
                System.out.print(" ");
            }
        }
        System.out.print("\b\b\b\b");
        for (int i=1; i<input+1; i+=2){
            for (int k=0; k<((input/2)-i/2); k++){
                System.out.print(" ");
            }
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
        System.out.println();
        }
        
        System.out.println();
        
        
    }
}
    