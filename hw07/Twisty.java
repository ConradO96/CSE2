// Conrad Ozarek
// Mar 21,2016
// Hw 7
//
// Create a program that generates a twist

/////////////////////////////////////////////
//        code in squares like so          //
//     does not reach desired results      //
//   but may have been used to test code   //
//             or to fix it                //
//             disregard it                //
/////////////////////////////////////////////

import java.util.Scanner; //import

public class Twisty {
    //main method required for every Java program
    public static void main(String[] args) {
        
        Scanner input; //declare
        input=new Scanner(System.in); //construct
        
        //determine if input for length is valid
        int length=0; //arbitrary temporary value for length
        boolean acceptableLength=false; //set bool valaue to false
        System.out.print("Enter a length less than 80: ");
        while (!acceptableLength){
            if ( input.hasNextInt() ){ //check if input is an int
                length=input.nextInt(); //if it is assign it to length
                if (length>80 || length<0){ //check if length fits to bounds
                    acceptableLength=false; //if not ask again for input
                    System.out.println("Error: Length must be under 80.");
                    System.out.print("Enter a length less than 80: ");
                }
                else {
                    acceptableLength=true; //if valid input escapee the while loop with new value for length
                }
            }
            else { //else if not an int entered, ask again
                System.out.println("Error: Please type an integer.");
                System.out.print("Enter a length less than 80: ");
                input.next();
            }
        }
        
        //determine if the input for width is valid
        int width=0; //arbitrary temporary value for length
        boolean acceptableWidth=false; //set bool valaue to false
        System.out.print("Enter a width smaller than the length: ");
        while (!acceptableWidth){ 
            if ( input.hasNextInt() ){ //check if input is int
                width=input.nextInt(); //if it is assign it to width
                if (width>length || width<0){ //check if width satisfies conditions[less than length]
                    acceptableWidth=false; //if not ask again for input
                    System.out.println("Error: Width must be less than length but greater than 0.");
                    System.out.print("Enter a width smaller than the length: ");
                }
                else {
                    acceptableWidth=true; //if valid input escape the while loop with new value for width
                }
            }
            else { //else if not an int entered, ask again
                System.out.println("Error: Please type an integer");
                System.out.print("Enter a width smaller than the length: ");
                input.next();
            }
        }
        
        
/////////////////////////////////////////////////////////
//System.out.println("Enter the length and width: ");  //
//int length=myScanner.nextInt();                      //
//int width=myScanner.nextInt();                       //
//int spaces=(width-1)/2;                              //
//////////////////////////////////////////////////////////

        //create a nested for loop which will pass every space in every row and column created one by one and perform desired action
        for (int i=0; i<width;i++){ 
            for (int j=0; j<length; j++){
                if (i==j%width) { //use modulo to determine if a symbol should exist, if not a space will be added later
                //this will generate all the lines that cross like this \ \ \
                //next if statements will determine what symbol will make that line
                
////////////////////////////
//if (i%width==j%width){  //
//System.out.print("\\"); //
//}                       //
////////////////////////////

                    if (i==j%(width*2)){ //every odd \ \ \ line will be made of #
                        System.out.print("#"); //prints #
                    }
                    else { //every even \ \ \ line will be made of \
                        System.out.print("\\"); //prints \
                    }
                }
                else if ((i+(j%width))%width==width-1){ //use modulo to determine if a symbol should exist, if not a space will be added later
                //this will generate all the lines that cross like this / / /
                //as a result, together with the lines generated above, X's will be created with appropriate symbols
                //next if statements will determine what symbol will make that line
                    if ((i+(j%(width*2)))%(2*width)==(2*width)-1){ //makes every even / / / line made up of #
                        System.out.print("#"); //prints the #
                    }
                    else { //otherwise, every other line or the odd / / / lines will be /
                    System.out.print("/"); //prints the /
                    }
                }

/////////////////////////////////
//if (i==j%width){             // 
//    System.out.print("#");   //
//}                            //
//else if (j%width==0){        // 
//    System.out.print("/");   //
//}                            //
//else if (j%width==1){        //
//    System.out.print("\\");  //
//}                            //
/////////////////////////////////
                
                else {
                    System.out.print(" "); //prints the spaces between each # or / or \
                }
            }
            System.out.println(""); //generates nothing but moves to nexxt line
        }
//////////////////////////////
//for (int i=0;i<spaces;){  //
//System.out.print(" ");    //
//}                         //
//////////////////////////////

    }   //end of main method
}   //end of class