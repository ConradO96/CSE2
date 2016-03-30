// Conrad Ozarek
// Mar 28,2016
// Hw 09
//
// Create a rectangle generator for int and Strings

import java.util.Random;
import java.util.Scanner; //import

public class Rectangularize {
    //main method required for every Java program
    public static void main(String[] args) {
        Scanner input; //declare
        input=new Scanner(System.in); //construct

        System.out.println("Square Generator. Input int or string: ");

        int valueInt=0; //temporary value
        String valueString=" "; //temporary value
        boolean acceptable=false; //temporary value
        while (!acceptable){ 
            if ( input.hasNextInt() ){ //check if input is integer
                valueInt=input.nextInt();
                if (valueInt<0){ //if negative value then ask again
                    acceptable=false;
                    System.out.println("Error: enter a positive");
                }
                else { //if positive in, go to int method and get result and print it
                    acceptable=true;
                    String resultInt=rectInt(valueInt); //go through int method and get result
                    System.out.println(resultInt); //print rectangle
                }
            }
            else { //otherwise take input as a string
                acceptable=true;
                valueString=input.nextLine(); //assign the input
                String resultString=rectString(valueString); //go through string method to get result and print it
                System.out.println(""); //line space to see the square
                System.out.println(resultString); //print rectangle
            }
        }
    }
    
    public static String rectInt(int a){ //method if int input
        String result=""; //assign temporary and arbitrary string to result
        for (int i=0; i<a; i++){
            for (int j=0; j<a; j++){ //nested for loop to print the row with correct number of % signs first, and then go to next row to print the correct amount again for the correct number of rows (as input by user)
                result=result+"%"; //add the % to the result for length
            }
            result=result+"\n"; //go to next line of result to print width
        }
        //String result="works";
        return result; //return result to be printed
    }
    
    public static String rectString(String a) { //method if string input
        String result=a; //set result to input string
        for (int i=1; i<a.length(); i++){ //for loop to print input string correct number of times, i
            result=result+"\n"+a; //for every increase in i, go to the next line with \n and print the string again
        }
        //String result="works";
        return result; //return the result to be printed
    }

}
    