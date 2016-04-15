// Conrad Ozarek
// Mar 11,2016
// Lab 7
//
// Create a program that generates a bowtie

import java.util.Scanner; //import

public class Bowtie {
    //main method quired for every Java program
    public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
boolean cont = true;

do{ 
///////////////////
//   FOR   LOOP  //
///////////////////

        int input=9;
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
        
        
///////////////////
//  WHILE  LOOP  //
///////////////////
        
        int i=9;
        int j=0;
        int k=0;
        while (i>1){
            while (k<i){
                System.out.print("*");
                k++;
            }
            System.out.println();
            while (j<(input/2)-(i/2)+1){
                System.out.print(" ");
                j++;
            }
            k=0;
            j=0;
            i-=2;
        }
        System.out.print("\b\b\b\b");
        i=1; 
        k=0;
        j=0;
        while (i<input+1){
            while (k<((input/2)-i/2)){
                System.out.print(" ");
                k++;
            }
            while (j<i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            k=0;
            j=0;
            i+=2;
        }
        
        System.out.println();
        
        
///////////////////
// DO WHILE LOOP //
///////////////////
        
        i=9;j=0;k=0;
        
        do{
            do{
                System.out.print("*");
                k++;
            }while(k<i);
            System.out.println();
            do{
                System.out.print(" ");
                j++;
            }while(j<(input/2)-(i/2)+1);
            k=0; j=0;
            i-=2;
        }while(i>1);
        System.out.print("\b\b\b\b");
        i=1;k=0;j=0;
        do{
            if (i<9){
            do{
                System.out.print(" ");
                k++;
            }while(k<((input/2)-i/2));
            }
            do{
                System.out.print("*");
                j++;
            }while(j<i);
            System.out.println();
            k=0; j=0;
            i+=2;
        }while(i<input+1);
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        Scanner enter; //declare
        enter=new Scanner(System.in); //construct
        int length=0; //arbitrary temporary value for length
        boolean acceptableLength=false; //set bool valaue to false
        System.out.print("Enter an odd int from 3-33: ");
        while (!acceptableLength){
            if ( enter.hasNextInt() ){ //check if input is an int
                length=enter.nextInt(); //if it is assign it to length
                if (length>33 || length<3 || (length%2)==0) { //check if length fits to bounds
                    acceptableLength=false; //if not ask again for input
                    System.out.println("Error: Please enter an odd int from 3-33.");
                    System.out.print("Enter an odd int from 3-33: ");
                }
                else {
                    acceptableLength=true; //if valid input escapee the while loop with new value for length
                }
            }
            else { //else if not an int entered, ask again
                System.out.println("Error: Please enter an odd int from 3-33.");
                System.out.print("Enter an odd int from 3-33: ");
                enter.next();
            }
        }
        
        for (int a=length; a>1; a-=2){
            for (int c=0; c<a; c++){
                System.out.print("*");
            }
            System.out.println();
            for (int b=0; b<(length/2)-(a/2)+1; b++){
                System.out.print(" ");
            }
        }
        
        for (int z=0; z<length; z++){
            System.out.print("\b");
        }
        
        
        for (int a=1; a<length+1; a+=2){
            for (int c=0; c<((length/2)-a/2); c++){
                System.out.print(" ");
            }
            for (int b=0; b<a; b++){
                System.out.print("*");
            }
        System.out.println();
        }

System.out.println("Continue? Enter Y or y to continue. ");
scan=new Scanner(System.in);
String in = scan.next();
if ( in.equals("y") || in.equals("Y") ){
    cont=true;
}
else {
    cont=false;
}
        
}while(cont);

        
    }   //end of main method
}   //end of class