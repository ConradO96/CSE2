// Conrad Ozarek
// Mar 22,2016
// Hw 7
//
// Create a program that generates a triangle with numbers

//import java.util.Scanner; //import

import java.util.Scanner; //import

public class Triangles {
    //main method required for every Java program
    public static void main(String[] args) {
        
        Scanner input; //declare
        input=new Scanner(System.in); //construct
        
        int value=0; //set temporary and arbitrary value   
        boolean acceptable=false; //set bool to false
        System.out.print("Enter a number between 5 and 30: ");
        while (!acceptable){ //while loop to check if valid input
            if ( input.hasNextInt() ){ //check if input is an int
                value=input.nextInt(); //if so set input to value
                if (value<5 || value>30){ //make sure value is in range
                    acceptable=false; //if it does not fit the range then we say its invalid and ask for another input
                    System.out.println("Error: enter a value between 5 and 30 inclusive.");
                    System.out.print("Enter a number between 5 and 30: ");
                }
                else { //if it is valid escape the loop and begin program
                    acceptable=true;
                }
            }
            else { //if it is not an integer that is input, say its invalid and ask again for input
                System.out.println("Error: Please enter an integer.");
                System.out.print("Enter a number between 5 and 30: ");
                input.next();
            }
        }
        
        System.out.println(""); //printed blank line for format
        
        System.out.println("For Loop");
        System.out.println("--------");
        //for loop program
        //nested for loop that increases in value of both i and j in order to increase the number of times a number is printed as well as the number printed
        for (int i=0; i<=value;i++){ 
            for (int j=0; j<i;j++){ 
                System.out.print(i);//print the value i, j amount of times
                }
            System.out.println("");//print a line after printing all the i values j amount of times
            }
        //nested for loop that decreases in value of both k and l in order to decrease the number of times a number is printed as well as the number printed
        for (int k=value-1; k>=0;k--){ //start at value-1 so only one row with inut value is printed
            for (int l=0; l<k;l++){
                System.out.print(k);//print the value k, l amount of times
                }
            System.out.println(""); //print a line after printing all the k values l amount of times
            }
            
        System.out.println("While Loop");
        System.out.println("----------");
        int i=0; //set initial value for i
        int j=0; //set initial value for j
        while (i<=value){ 
            while (j<i){ //nested while loop which increases the value of both i and j in order to increase the number of times a number is printed as well as the number printed
                System.out.print(i); //print the value i, j amount of times
                j++; //add 1 to j in order to make sure i prints the correct amount of times
            }
            System.out.println(""); //prints nothing but moves to next line after printing i value j times
            i++; //add 1 to i for value of next row
            j=0; //reset j to 0
        }
        
        int k=value-1; //the value will now be dereasing for the second half of the pyramid
        int l=0; //set initial value for l
        
        while (k>0){
            while (l<k){ //nested while loop which decreases the value of k and increases l and reset it later in order to decrease the number of times a number is printed as well as the number printed
                System.out.print(k); //prints the value k, j amount of times
                l++; //add 1 to l in order to print correct amount of k
            }
            System.out.println(""); //prints nothing but moves  to next time everytime all values k are printed l times correctly
            k--; //decrease k by 1 because this is the half of the pyramid where values decrease in value and length
            l=0; //reset l to 0
        }
        
        System.out.println("");
        System.out.println("Do-While Loop");
        System.out.println("-------------");
        System.out.println("");
        int a=1; //initial value for a
        int b=0; //initial value for b
        do {
            do{
                //nested do while which will increase values of a and b in order to increase the number of times a number is printed as well as the number printed
                System.out.print(a); //print number a, b amount o times
                b++; //add 1 to b so that its printed the correct amount of times
            }while(b<a); 
            System.out.println(""); //print nothing but move to next line every time a is printed b times
            a++; //add 1 to a
            b=0; //reset b for next row
        }while(a<=value);
        
        int c=value-1; //initial value for c which is 1 less than valuebecause its the second half of the pyramid
        int d=0; //initial value of b
        do {
            do{
                //nested do while which will decrease values of c and d in order to decrease the number of times a number is printed as well as the number printed
                System.out.print(c); //print the number c, d amount of times
                d++; //add 1 so that c is not printed the correct amount of times
            }while(d<c);
            System.out.println(""); //print nothing but move to next line every time c is printed d times
            c--; //decrease value of c by 1 for next row
            d=0; //reset d for next row
        }while(c>0);

        
    }   //end of main method
}   //end of class