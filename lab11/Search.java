//Conrad Ozarek
//Lab10
//April 15, 2016

import java.util.Random;
import java.util.Scanner; //import

public class Search {
    //main method required for every Java program
    public static void main(String[] args) {
        
        int value=0;
        
        Random randomGenerator = new Random();
        
        int[] arrayOne=new int[50];
        int[] arrayTwo=new int[50];

        for (int i=0;i<50;i++){
            arrayOne[i]=randomGenerator.nextInt(100);
        }
        
        for (int j=0;j<50;j++){
            value=value+randomGenerator.nextInt(100);
            arrayTwo[j]=value;
        }
        
        int min=arrayOne[0];
        int max=arrayOne[0];
        for (int i=1;i<50;i++){
            if (arrayOne[i]>max){
                max=arrayOne[i];
            }
            if (arrayOne[i]<min){
                min=arrayOne[i];
            }
        }
        System.out.println("Max of array1 is: "+max); 
        System.out.println("Min of array1 is: "+min);
        System.out.println("Max of array2 is: "+arrayTwo[49]);
        System.out.println("Min of array2 is: "+arrayTwo[0]);
        //System.out.println(arrayOne[49]);
        
        Scanner input; //declare
        input=new Scanner(System.in); //construct
        int number=0; //arbitrary temporary value for length
        boolean acceptableLength=false; //set bool valaue to false
        System.out.print("Enter an int: ");
        while (!acceptableLength){
            if ( input.hasNextInt() ){ //check if input is an int
                number=input.nextInt(); //if it is assign it to length
                if (number<0) { //check if length fits to bounds
                    acceptableLength=false; //if not ask again for input
                    System.out.println("Error: Not an int");
                    System.out.print("Enter an int: ");
                }
                else {
                    acceptableLength=true; //if valid input escapee the while loop with new value for length
                }
            }
            else { //else if not an int entered, ask again
                System.out.println("Error: Not an int");
                System.out.print("Enter an int: ");
                input.next();
            }
        }
        
        //int above=0;
        //int below=0;
        //boolean found=false;
        //int index=50/2;
        /*
        for (int i=0; i<5; i++){
            if (arrayTwo[index] == number){
                found=true;
                break;
            }
            else if (arrayTwo[index]<number && arrayTwo[index+1]>number){
                above=arrayTwo[index+1];
                below=arrayTwo[index];
            }
            else if (arrayTwo[index]>number && arrayTwo[index-1]>number){
                above=arrayTwo[index];
                below=arrayTwo[index-1];
            }
            else if (arrayTwo[index]>number){
                index=index/2;
            }
            else if (arrayTwo[index]<number){
                index=index+(index/2);
            }
        }
        */
        int above=0;
        int below=0;
        
        int a=0;
        int b=49;
        int m;
        while (a<b){
            m=((a+b)/2);
            if (number>arrayTwo[m]){
                a=m+1;
            }
            else {
                b=m;
            }
        }
        if (number==arrayTwo[a]){
            System.out.println(number+" was found in the list");
        }
        else if (arrayTwo[a] > number) {
            above=arrayTwo[a];
            below=arrayTwo[a-1];
            System.out.println(number+" was not found in the list");
            System.out.println("The number above is "+above);
            System.out.println("The number below is "+below);
        }
        else if (arrayTwo[a] < number) {
            above=arrayTwo[a+1];
            below=arrayTwo[a];
            System.out.println(number+" was not found in the list");
            System.out.println("The number above is "+above);
            System.out.println("The number below is "+below);
        }
        else {}
        
        /*
        if (found==true){
            System.out.println(number+" was found in the list");
        }
        else {
            System.out.println(number+" was not found in the list");
            System.out.println("The number above is "+above);
            System.out.println("The number below is "+below);
        }
        //System.out.println(number);
        */ 
        
    }
}   //end of class