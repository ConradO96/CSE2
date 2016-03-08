// Conrad Ozarek
// Mar 5,2016
// Hw 6
//
// Create a program that calculates a factorial for ints between 9 and 16 inclusive

import java.util.Scanner; //import
        
public class RunFactorial {
    //main method required for every Java program
    public static void main(String[] args) {
        
        Scanner myScanner; //declare
        myScanner=new Scanner(System.in); //construct
        
        //ask for value between 9 and 16 and make sure it is a valid input
        System.out.print("Enter an integer between 9 and 16: ");
        int fact=-1;
        while (true){
            if ( myScanner.hasNextInt() ){
            fact=myScanner.nextInt();
                if (fact<9 || fact>16){
                    System.out.println("Invalid Input");
                    System.out.print("Enter an integer between 9 and 16: ");
                    myScanner.nextLine();
                }
            else {
                break;
            }
            }
            else {
                System.out.println("Invalid Input");
                System.out.print("Enter an integer between 9 and 16: ");
                myScanner.nextLine();
            }
        }
        
        //line used when testing
//        System.out.println("Input Accepted");
        
        //store value of factorial number becuase it will be change but we want to print the original
        int printedFactorial=fact;
        
        //declare double because the computed numbers will need to be stored and since the value will be large, we use a double not an int
        double tot=1.0;
        
//        for (int i=1;i<fact;){
//            tot=tot*fact;
//            fact=fact-1;
//        }

        //while loop to calculate the factorial
        while (fact>0){
            tot=tot*fact;
            fact--;
        }
        
        //print factorial
        System.out.println(printedFactorial+ "!= "+tot);
        
    }
}


