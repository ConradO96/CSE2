// Conrad Ozarek
// Mar 5,2016
// Hw 6
//
// Create a program that generates fibonacci numbers

import java.util.Scanner; //import
        
public class Fibonacci {
    //main method required for every Java program
    public static void main(String[] args) {
        

        Scanner myScanner; //declare
        myScanner=new Scanner(System.in); //construct
        
        //ask for first value of sequence and make sure it is a valid input
        System.out.print("Enter the first value in the sequence: ");
        int a=-1;
        while (true){
            if ( myScanner.hasNextInt() ){
            a=myScanner.nextInt();
                if (a<0){
                    System.out.println("Invalid Input");
                    System.out.print("Enter the first value in the sequence: ");
                    myScanner.nextLine();
                }
            else {
                break;
            }
            }
            else {
                System.out.println("Invalid Input");
                System.out.print("Enter the first value in the sequence: ");
                myScanner.nextLine();
            }
        }
        
        //ask for second number in sequence and make sure it is valid
        System.out.print("Enter the second value in the sequence: ");
        int b=-1;
        while (true){
            if ( myScanner.hasNextInt() ){
            b=myScanner.nextInt();
                if (b<0){
                    System.out.println("Invalid Input");
                    System.out.print("Enter the second value in the sequence: ");
                    myScanner.nextLine();
                }
            else {
                break;
            }
            }
            else {
                System.out.println("Invalid Input");
                System.out.print("Enter the second value in the sequence: ");
                myScanner.nextLine();
            }
        }
        
        //ask for length of sequence and make sure the input is valid
        System.out.print("How many custom Fibonacci numbers should be printed? ");
        int n=-1;
        while (true){
            if ( myScanner.hasNextInt() ){
            n=myScanner.nextInt();
                if (n<0){
                    System.out.println("Invalid Input");
                    System.out.print("How many custom Fibonacci numbers should be printed? ");
                    myScanner.nextLine();
                }
            else {
                break;
            }
            }
            else {
                System.out.println("Invalid Input");
                System.out.print("How many custom Fibonacci numbers should be printed? ");
                myScanner.nextLine();
            }
        }
        
        
        //for loop to compute to Fibonacci numbers
        int p;
        System.out.print(a+" "+b+" ");
        for (int i=1;i<=n-2;i++){
            p=a+b;
            System.out.print(p+" ");
            a=b;
            b=p;
        }
        
        
    }   //end of main method
}   //end of class