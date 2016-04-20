//Conrad Ozarek
//HW 11
//April 17, 2016

/*
    Since the hw 12 posted on course site had a description that did not match the hint nor the sample output, 
    this program is based solely on the description, as I talked to Professor Chen and did not get a response that says to do otherwise
*/

import java.util.Random;
import java.util.Scanner; //import

public class CSE2Linear {
    //main method required for every Java program
    public static void main(String[] args) {
        
        int value=0;
        
        Random randomGenerator = new Random();

        int[] studentGrades=new int[16]; //create an array for student grades
        studentGrades[0]=0; //starts with zero to make sure first value it greater than or equal to it. will be excluded from the grades in the end
        for (int i=1;i<16;i++){ //for loop to ask for input of grades
            
            Scanner input; //declare
            input=new Scanner(System.in); //construct
        
            boolean acceptableGrade=false; //set bool valaue to false
            System.out.print("Enter a grade: ");
            while (!acceptableGrade){
                if ( input.hasNextInt() ){ //check if input is an int
                    studentGrades[i]=input.nextInt(); //if it is assign it to the array
                    if (studentGrades[i]>100 || studentGrades[i]<0){ //check if grade fits to bounds 0 to 100
                        acceptableGrade=false; //if not ask again for input
                        System.out.println("Error: Grade must be 0-100");
                        System.out.print("Enter a grade: ");
                    }
                    else if (studentGrades[i]<studentGrades[i-1]){ //check if input is greater than last input or 0 if first input
                        acceptableGrade=false; //if not ask again for input
                        System.out.println("Error: Must be larger than last");
                        System.out.print("Enter a grade: ");
                    }
                    else {
                        acceptableGrade=true; //if valid input escape the while loop with new value for the array
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
        for (int i=1;i<16; i++){ //for loop to print all the grades excluding the zero placed at the beginning
            System.out.print(studentGrades[i]+" ");
        }
        System.out.println();
        System.out.println(); // for spacing 

        Scanner input; //declare
        input=new Scanner(System.in); 
        int searchFirst=0; //set temporary value
        System.out.println("Enter a grade to be searched for: ");
        boolean acceptableInput=false; //set bool valaue to false
        while (!acceptableInput){
                if ( input.hasNextInt() ){ //check if input is an int
                    searchFirst=input.nextInt(); //if it is assign it to searchFirst
                    if (searchFirst>100 || searchFirst<0){ //check if input fits to bounds 0-100
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
            }//end of while for input
        System.out.println();
        int found = 0; //temporary value saying the value is not found
        for (int i=1;i<16; i++){ //for loop to pass through all the elements of the array
            if (studentGrades[i]==searchFirst){ //condition if value is found
                System.out.println("The number was found after "+i+" iterations.");
                found=1;
                break; //if found leave the for loop
            }
            //else if(studentGrades[i] != searchFirst && i==15){
            //    System.out.println("The numberwas not found after 15 iterations.");
            //}
        }
        if (found==0){//otherwise if for loop finishes without being found, print the following
            System.out.println("The numberwas not found after 15 iterations.");
        }
        
        System.out.println();//spacing

        System.out.print("The shuffled grades are: ");
        shuffleArray(studentGrades);//shuffles the grades in a seperate method
        for (int i=1; i<16; i++){//for loop prints the shuffled grades
            System.out.print(studentGrades[i] + " ");
        }
        System.out.println();
        System.out.println();//spacing

        int searchSecond=0; //second search for shuffled array
        System.out.println("Enter a grade to be searched for: ");
        acceptableInput=false; //set bool valaue to false
        while (!acceptableInput){
                if ( input.hasNextInt() ){ //check if input is an int
                    searchSecond=input.nextInt(); //if it is assign it to searchSecond
                    if (searchSecond>100 || searchSecond<0){ //check if input fits the bounds 0-100
                        acceptableInput=false; //if not ask again for input
                        System.out.println("Error: Grade must be 0-100");
                        System.out.print("Enter a grade to search for: ");
                    }
                    else {
                        acceptableInput=true; //if valid input escape the while loop with new value for search
                    }
                }
                else { //else if not an int entered, ask again
                    System.out.println("Error: Please type an integer.");
                    System.out.print("Enter a grade to search for: ");
                    input.next();
                }
            }
        System.out.println();//spacing
        int foundTwo = 0;
        for (int i=1;i<16; i++){ //for loop to pass through all elements of array
            if (studentGrades[i]==searchSecond){ //condition to see if input number is found in array
                System.out.println("The number was found after "+i+" iterations.");
                foundTwo=1;
                break; // if it is print the message and leave the loop
            }
        }
        if (foundTwo==0){ //otherwise if loop finishes and it is not found, print the following
            System.out.println("The numberwas not found after 15 iterations.");
        }
    }
    
    static void shuffleArray(int[] array){ //method for shuffling
        for (int i=15; i>1; i--){//for loop to shuffle the values of the array around
            int swap=(int)(Math.random()*15)+1; //generate random number 1-15
            int temp=array[swap]; //set value to temp because it will be replaced
            array[swap]=array[i]; //replace value of element i with the random element generted
            array[i]=temp; //replace the element at i with the one i was relacing to perform a swap
        }
    }
}   //end of class