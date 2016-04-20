//Conrad Ozarek
//HW 11
//April 17, 2016

import java.util.Random;
import java.util.Scanner; //import

public class CSE2Linear {
    //main method required for every Java program
    public static void main(String[] args) {
        
        int value=0;
        
        Random randomGenerator = new Random();

        int[] studentGrades=new int[16];
        studentGrades[0]=0;
        for (int i=1;i<16;i++){
            
            Scanner input; //declare
            input=new Scanner(System.in); //construct
        
            boolean acceptableGrade=false; //set bool valaue to false
            System.out.print("Enter a grade: ");
            while (!acceptableGrade){
                if ( input.hasNextInt() ){ //check if input is an int
                    studentGrades[i]=input.nextInt(); //if it is assign it to length
                    if (studentGrades[i]>100 || studentGrades[i]<0){ //check if length fits to bounds
                        acceptableGrade=false; //if not ask again for input
                        System.out.println("Error: Grade must be 0-100");
                        System.out.print("Enter a grade: ");
                    }
                    else if (studentGrades[i]<studentGrades[i-1]){
                        acceptableGrade=false; //if not ask again for input
                        System.out.println("Error: Must be larger than last");
                        System.out.print("Enter a grade: ");
                    }
                    else {
                        acceptableGrade=true; //if valid input escapee the while loop with new value for length
                    }
                }
                else { //else if not an int entered, ask again
                    System.out.println("Error: Please type an integer.");
                    System.out.print("Enter a grade: ");
                    input.next();
                }
            }
        } //end of for loop for inputs
        
        System.out.println();
        System.out.print("The grades entered are: ");
        for (int i=1;i<16; i++){
            System.out.print(studentGrades[i]+" ");
        }
        System.out.println();
        System.out.println();

        Scanner input; //declare
        input=new Scanner(System.in); 
        int searchFirst=0;
        System.out.println("Enter a grade to be searched for: ");
        boolean acceptableInput=false; //set bool valaue to false
        while (!acceptableInput){
                if ( input.hasNextInt() ){ //check if input is an int
                    searchFirst=input.nextInt(); //if it is assign it to length
                    if (searchFirst>100 || searchFirst<0){ //check if length fits to bounds
                        acceptableInput=false; //if not ask again for input
                        System.out.println("Error: Grade must be 0-100");
                        System.out.print("Enter a grade to search for: ");
                    }
                    else {
                        acceptableInput=true; //if valid input escapee the while loop with new value for length
                    }
                }
                else { //else if not an int entered, ask again
                    System.out.println("Error: Please type an integer.");
                    System.out.print("Enter a grade to search for: ");
                    input.next();
                }
            }
        System.out.println();
        int found = 0;
        for (int i=1;i<16; i++){
            if (studentGrades[i]==searchFirst){
                System.out.println("The number was found after "+i+" iterations.");
                found=1;
                break;
            }
            //else if(studentGrades[i] != searchFirst && i==15){
            //    System.out.println("The numberwas not found after 15 iterations.");
            //}
        }
        if (found==0){
            System.out.println("The numberwas not found after 15 iterations.");
        }
        
        System.out.println();

        System.out.print("The shuffled grades are: ");
        shuffleArray(studentGrades);
        for (int i=1; i<16; i++){
            System.out.print(studentGrades[i] + " ");
        }
        System.out.println();
        System.out.println();

        int searchSecond=0;
        System.out.println("Enter a grade to be searched for: ");
        acceptableInput=false; //set bool valaue to false
        while (!acceptableInput){
                if ( input.hasNextInt() ){ //check if input is an int
                    searchSecond=input.nextInt(); //if it is assign it to length
                    if (searchSecond>100 || searchSecond<0){ //check if length fits to bounds
                        acceptableInput=false; //if not ask again for input
                        System.out.println("Error: Grade must be 0-100");
                        System.out.print("Enter a grade to search for: ");
                    }
                    else {
                        acceptableInput=true; //if valid input escapee the while loop with new value for length
                    }
                }
                else { //else if not an int entered, ask again
                    System.out.println("Error: Please type an integer.");
                    System.out.print("Enter a grade to search for: ");
                    input.next();
                }
            }
        System.out.println();
        int foundTwo = 0;
        for (int i=1;i<16; i++){
            if (studentGrades[i]==searchSecond){
                System.out.println("The number was found after "+i+" iterations.");
                foundTwo=1;
                break;
            }
        }
        if (foundTwo==0){
            System.out.println("The numberwas not found after 15 iterations.");
        }
    }
    
    static void shuffleArray(int[] array){
        //int numberGenerated= (int)(Math.random()*3)+1;
        for (int i=15; i>1; i--){
            int swap=(int)(Math.random()*15)+1;
            int temp=array[swap];
            array[swap]=array[i];
            array[i]=temp;
        }
    }
}   //end of class