// Conrad Ozarek
// Mar 28,2016
// Hw 09
//
// Create a game

import java.util.Random;
import java.util.Scanner; //import

public class Games {
    //main method required for every Java program
    public static void main(String[] args) {
        
        Random randomGenerator = new Random();
        Scanner input; //declare
        input=new Scanner(System.in); //construct
        
        System.out.println("Welcome to Conrad Game Center");
        System.out.println("What would you like to play? Enter: guessTheBox, spinTheWheel, or scrambler.");
        String game = input.next(); //get input to determine which game to play
        
        if (game.equals("guessTheBox")){ //if input matches, go through guessTheBox method, get a result, and print it
            String resultOne=guessTheBox();
            System.out.println(resultOne);
        }
        else if (game.equals("spinTheWheel")){ //if input matches, go through spinTheWheel method, get a result, and print it
            String resultTwo=spinTheWheel();
            System.out.println(resultTwo);
        }
        else if (game.equals("scrambler")){ //if input matches, go through scrambler method, get a result, and print it
            String resultThree=scramble();
            System.out.println(resultThree);
        }
        
        else { //otherwise say the game doesnt exist and exit the program
            System.out.println("Error: That game does not exist!");
            System.out.println("Program will end.");
        }
    }
    
///////////////////////////////////////////////////////////
    public static String guessTheBox(){ //guessTheBox method
        String result; //initialize
        
        Scanner in;
        in =new Scanner(System.in);
        
        int numberGenerated= (int)(Math.random()*3)+1; //generate int 1,2 or 3 (this will be winning curtain)
        //System.out.print("TEST PRINT "+numberGenerated);
        
        int numberInput=-1; //arbitrary/temporary value
        boolean acceptIn=false; //set bool valaue to false
        System.out.print("Enter your guess (1, 2, or 3): ");
        while (!acceptIn){ //while loop to check input and make sure its int from 1-3
            if ( in.hasNextInt() ){ //check if input is an int
                numberInput=in.nextInt(); //if it is assign it to numberInput
                if (numberInput<1 || numberInput>3){ //check if input fits to bounds
                    acceptIn=false; //if not ask again for input
                    System.out.println("Error: Must be 1, 2, or 3.");
                    System.out.print("Enter a guess: ");
                }
                else {
                    acceptIn=true; //if valid input escapee the while loop with new value for numberInput
                }
            }
            else { //else if not an int entered, ask again
                System.out.println("Error: Must be 1, 2, or 3.");
                System.out.print("Enter a guess: ");
                in.next();
            }
        }
        if (numberInput==numberGenerated){ //if the input number is the same as the generated one, print win, otherwise print lose
            result="You Win!";
        }
        else {
            result="You Lose";
        }
        return result; //return the result (win or lose)
    }
///////////////////////////////////////////////////////////
    public static String spinTheWheel() { //spin the wheel method
        String result, correct;
        Scanner input;
        input =new Scanner(System.in);
        
        String inputColor,generatedColor;
        int inputNum, generatedNum;
        
        int color= (int)(Math.random()*2)+1; //generatea value 1 or 2
        if (color == 1){ //if 1 generated, color spun is red
            generatedColor = "RED";
        }
        else if (color == 2){ //if 2 generated, color spun is black
            generatedColor = "BLACK";
        }
        else { //else to catch all other cases which do not exist but must be accounted for to compile
            generatedColor = " ";
        }
        
        generatedNum= (int)(Math.random()*5)+1; //generate a number 1-5 for the number spun
        
        //System.out.println("USED TO TEST "+generatedColor+" "+generatedNum);
    
        do{ //do while to ask for a guess of the color which will ask continuously until red or black is input
            System.out.println("Enter the color of your guess (red or black). If input is invalid, user will be prompted again. ");
            inputColor = input.next(); //read input
            inputColor = inputColor.toUpperCase(); //convert all letters to uppercase in order to check that input is black or red, no matter how it is typed
        }while ( (!inputColor.equals("RED")) && (!inputColor.equals("BLACK")) );
        
        inputNum=-1; //temporary and arbitrary value for input integer
        boolean acceptIn=false; //set bool valaue to false
        System.out.print("Enter your guess for the number (1-5): ");
        while (!acceptIn){
            if ( input.hasNextInt() ){ //check if input is an int
                inputNum=input.nextInt(); //if it is assign it to numberInput
                if (inputNum<1 || inputNum>5){ //check if input fits to bounds 1-5
                    acceptIn=false; //if not ask again for input
                    System.out.println("Error: Must be 1-5.");
                    System.out.print("Enter a guess: ");
                }
                else {
                    acceptIn=true; //if valid input escapee the while loop with new value for numberInput
                }
            }
            else { //else if not an int entered, ask again
                System.out.println("Error: Must be 1-5.");
                System.out.print("Enter a guess: ");
                input.next();
            }
        }
        
        //check if the input color and integer, aka the guess, is equal to or the same as the generated color and number that stimulates the spin
        if ( (inputColor.equals(generatedColor)) && (inputNum==generatedNum) ){ //if the guess is the same, the guess is correct
            correct="CORRECT. ";
        }
        else { //otherwise the guess is wrong
            correct="INCORRECT. ";
        }
        //assign the result so that the correct color and number are printed as well as whether the user's guess is correct
        result="The color generated was "+generatedColor+", while the number generated was "+generatedNum+", therefore your guess was: "+correct;
        return result; //return that result to the main method
    }
///////////////////////////////////////////////////////////
    public static String scramble(){ //scramble method
        
        Scanner input; //declare
        input=new Scanner(System.in); //construct
        
        String word, result, original; //declare
        System.out.println("Enter a word to scramble: ");
        word = input.nextLine(); //get user input and store in string word
        //word = word.toUpperCase();
        
        int length=word.length(); //find length of word
        //
        //System.out.println(length);
        //
        char temp, a, b, aR, bR; //declare chars
        original=word; //store the original word
        int numberGenerated= (int)(Math.random()*10)+10; //generate a number >10 to determine how many times we will swap letters
        //
        //System.out.println(numberGenerated);
        int takeLetter=0; //set temporary value
        //
        for (int i=0; i<numberGenerated; i++){ //for loop to swap the first letter wth a random letter i amount of times
            takeLetter = (int)(Math.random()*length); //random number generated to determine which letter of the word will be swapped
            //takeLetter = takeLetter;
            //
            //System.out.println(takeLetter);
            //
            if (takeLetter==0) { //if number generated is 0, we will not swapany letter since the letter at the start will be swapped by the same letter
                //
            }
            else if (takeLetter==1){ //if number generted is 1, we will swap the first and second letter and then add the rest of the substring
                a=word.charAt(0); //get char at position 0
                b=word.charAt(takeLetter); //get char at position 1
                word = b + "" + a + word.substring(2,length); //change the word to have the characters swap
            } 
            else { //if generated number is not 1 or 0, do the following
                a=word.charAt(0); //assign char at position 0 to a
                b=word.charAt(takeLetter); //assign char at position takeLetter to b
                word = b + word.substring(1,takeLetter) + a + word.substring(takeLetter+1,length); //print swapped letter, then the word up to the other letter swapped, and then the rest of the word
            }
        }
        result=word;//assign the new word to result
        return result; //return the result
    }
///////////////////////////////////////////////////////////
}
    