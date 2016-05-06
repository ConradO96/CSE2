//Conrad Ozarek
//HW 13 - Holoport

import java.util.Random;
import java.util.Scanner; //import

public class Holoporter {
    public static void main(String[] args) { //main method
        
        Scanner scan= new Scanner(System.in);
        
        String[][][] arrayOne=soRandom(); //creates the first array
        arrayOne=filler(arrayOne); //fills array
        print(arrayOne); //prints
        
        System.out.println(); //spacing
        System.out.println();
        
        String[][][] arrayTwo=soRandom(); //creates second array 
        arrayTwo=holoport(arrayOne, arrayTwo); //holoports array two with array one
        print(arrayTwo); //prints holoported array
        
        System.out.println(); //spacing
        
        String find= " ";//temporary value until user input is valid
        boolean acceptable=false; //set bool valaue for acceptable input to false
        
        System.out.print("Enter a search: ");
        while (!acceptable){ //while to keep asking until input is acceptable
            String input=scan.nextLine(); 
            if (input.length() == 6){ //if the length of input is 6 
                //System.out.println("length of 6 here");
                if ( validInput(input) ){ //check if valid input is true
                    find=input; //set input to find
                    acceptable=true; //true to break out of while loop to keep asking
                }
                else{ //if not valid input
                    System.out.println("Error. Enter a proper search: ");
                }
            }
            else {//if not length of 6
                System.out.println("Error. Enter a proper search: ");
            }
        }

        System.out.println();//spacing
        find(arrayOne,find); //find value entered in array one

        System.out.println(); //spacing
        percentage(arrayOne,arrayTwo); //percentage of array filled in comparison to one
        System.out.println(); //spacing
        frankenstein(arrayOne); //order the array as specified in frankenstein method
        print(arrayOne); //print the frankenstein-ed array
        System.out.println();//spacing or format
    }
    
    
    public static String[][][] soRandom(){ //method to create a random 3D array
        int random=(int)((Math.random()*9)+1); //set first dimension array to random length
        String[][][] array=new String[random][][]; //assign length of arrays 1st dimension
        
        for (int x=0;x<array.length;x++){ //for loop to create array for each value of array
            array[x]=new String[((int)(Math.random()*9)+1)][];//creates 2nd dimension array of random length
        }
        for (int x=0;x<random;x++){ //for loop to pass through first dimension
            for (int y=0;y<array[x].length; y++){ //for loop to pass through second dimension 
                array[x][y]=new String[((int)(Math.random()*9)+1)];//creates an array in third dimension of random length
            }
        }
        return array; //return the unfilled 3D array
    }

    public static String[][][] filler(String[][][] array){
        
        for (int x=0;x<array.length;x++){ //three nested for loops to pass through each element of 3D array
                for (int y=0;y<array[x].length; y++){
                    for (int z=0;z<array[x][y].length; z++){
                        array[x][y][z]= coder(); //sets value of specified location in array (value generated in coder method)
                    }
                }
            }
        boolean different=false; //boolean to determine if each value is different in the 3D array
        while (different){
            boolean changed=false; //boolean to determine if a value was changed (aka the same as another)
            for (int x=0;x<array.length;x++){ //nested for loops to pass through each element of 3D array
                for (int y=0;y<array[x].length; y++){
                    for (int i=0;i<array[x][y].length; i++){ //takes a value of 3D array
                        for (int j=i; j<array[x][y].length; j++){ //takes another value of 3D array not the same as the one above
                            if (i != j && array[x][y][i] == array[x][y][j]){ //compares value to see if they are the same
                                array[x][y][j]=coder(); //if they are then generate a new value at that location
                                changed=true; //set to true so it checks all values again
                            }
                            if (i==array[x][y].length-1 && j==array[x][y].length-1 && changed==false){//if all values are different
                                different=true; //return true and break out of while
                            }
                        }
                    }
                }
            }
        }
        return array; //return filled array
    }
    
    public static String coder(){ //coder method to create value for each element of 3D array
        String code=""; //temporary value for code
        char first = Character.toUpperCase((char)(Math.random()*26 + 'a'));//generates a random letter (uppercase)
        char second = Character.toUpperCase((char)(Math.random()*26 + 'a'));//generates a random letter (uppercase)
        int third = (int)((Math.random()*9)+1); //generates a random number 1 to 9
        int fourth = (int)((Math.random()*9)+1); //generates a random number 1 to 9
        int fifth= (int)((Math.random()*9)+1); //generates a random number 1 to 9
        int sixth = (int)((Math.random()*9)+1); //generates a random number 1 to 9
        code=""+first+second+third+fourth+fifth+sixth; //combines all generated numbers and letters to create code of format XXYYYY
        return code; //returns code to assign to array
    }
    
    public static String[][][] holoport(String[][][] arrayOne,String[][][] arrayTwo){ //method to holoport two 3D arrays
        String blank="$$$$$$"; //
        
        for (int x=0;x<arrayTwo.length;x++){ //three nested for loops to pass through each element of 3D array
            for (int y=0;y<arrayTwo[x].length; y++){
                for (int z=0;z<arrayTwo[x][y].length; z++){
                    arrayTwo[x][y][z]=blank; //assigns every value of array to $$$$$$
                }
            }
        }
        
        for (int x=0;x<arrayTwo.length;x++){ //passes through first dimension of second array
            if (x==arrayOne.length){ //if the length of array ones first dimension equals the array two length then break
                break;
            }
            for (int y=0;y<arrayTwo[x].length; y++){//passes through second dimension of second array
                if (y==arrayOne[x].length){ //if the length of array ones second dimension equals the array two length then break
                    break;
                }
                for (int z=0;z<arrayTwo[x][y].length; z++){//passes through third dimension of second array
                    if (z==arrayOne[x][y].length){ //if the length of array ones third dimension equals the array two length then break
                        break;
                    }
                    arrayTwo[x][y][z]=arrayOne[x][y][z]; //assign array one value to array two at the same location
                }
            }
        }
        return arrayTwo; //return holoported array
    }
    
    public static void find(String array[][][], String find){ //method to find specified value
        boolean found=false;
        for (int x=0;x<array.length;x++){ //three nested for loops to pass through each element of 3D array
            for (int y=0;y<array[x].length; y++){
                for (int z=0;z<array[x][y].length; z++){
                    if (array[x][y][z].equals(find)){ //if the values are equal it is found
                        //x++;y++;z++;
                        System.out.println("The location is: ("+x+","+y+","+z+")"); //prints the location
                        found=true;
                    }
                    if (found==true){//if found break
                        break;
                    }
                }
            if (found==true){//if found break
                break;
            }
            }
        if (found==true){//if found break
            break;
        }
        }
        if (found==false){//if not found then print not found
            System.out.println("Code not found");
        }
    }
    
    public static void print(String[][][] array){ //print method to print 3D array
        for (int x=0;x<array.length;x++){//three nested for loops to pass through each element of 3D array
                for (int y=0;y<array[x].length; y++){
                    System.out.print("[");//prints [] for format
                    for (int z=0;z<array[x][y].length; z++){
                        System.out.print(array[x][y][z]);
                        if (z<array[x][y].length-1){ //for every element except last print ,
                            System.out.print(",");
                        }
                    }
                    System.out.print("]");//print [] for format
                    if (y<array[x].length-1){ //for every element except last print |
                        System.out.print("|");
                    }
                }
                if (x<array.length-1){ //for every element except last print ---
                    System.out.print("---");
                }
            }
    }
    
    public static boolean validInput(String input){ //method to check if valid input was entered by user in format XXYYYY
        boolean valid=true; //set valid to true 
        String ptOne=input.substring(0,1); //break the entered value into individual substrings of one character
        String ptTwo=input.substring(1,2);
        String ptThree=input.substring(2,3);
        String ptFour=input.substring(3,4);
        String ptFive=input.substring(4,5);
        String ptSix=input.substring(5,6);
        if (!validInt(ptThree) || !validInt(ptFour) || !validInt(ptFive) || !validInt(ptSix)){ //check if all number are valid inputs in proper spot
            valid=false; //if not return false
        }
        if (!validChar(ptOne) || !validChar(ptTwo)){ //check if all characters entered are valid inputs
            valid=false; //if not return false
        }
        return valid; //return if valid or not
    }
    
    public static boolean validInt(String pt){ //method to test if valid number entered
        boolean result=false;
        String[] numbers={"1","2","3","4","5","6","7","8","9"}; //array of all valid numbers
        for (int i=0;i<numbers.length;i++){ //for loop to test all values
            if (numbers[i].equals(pt)){ //check if value is equal to any in array
                result=true; //if so then return true
            }
        }
        return result; //return true or false
    }
    
    public static boolean validChar(String pt){ //method to test if valid letter is entered
        boolean result=false; 
        //array of all possible letters below
        String[] chars={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        for (int i=0; i<chars.length; i++){ //for loop to test every value
            if (chars[i].equals(pt)){//if the value equals any of the ones in the array
                result=true; //return true
            }
        }
        return result; //return true or false
    }
    
    public static void percentage(String arrayOne[][][], String arrayTwo[][][]){ //method to determine percentage filled
        int arrayOneElements=0; //values to count the number of elements in each
        int arrayTwoElements=0;
        
        for (int x=0;x<arrayOne.length;x++){ //three nested for loops to pass through each element of 3D array
            for (int y=0;y<arrayOne[x].length; y++){
                for (int z=0;z<arrayOne[x][y].length; z++){
                    arrayOneElements++; //add to count for array one
                }
            }
        }
        for (int x=0;x<arrayTwo.length;x++){//three nested for loops to pass through each element of 3D array
            for (int y=0;y<arrayTwo[x].length; y++){
                for (int z=0;z<arrayTwo[x][y].length; z++){
                    arrayTwoElements++; //add to count for array two
                }
            }
        }
        
        double percentage;
        percentage=100*((1.0*arrayTwoElements-arrayOneElements)/arrayOneElements);//formula to calculate percentage
        System.out.printf("The percentage filled is: %.2f",percentage);//prints double with 2 decimal places
        System.out.print("%");//print % sign after above line
        System.out.println();//spacing
    }
    
    public static String[][][] frankenstein(String array[][][]){ //method to organize array by value and length
        for (int x=0;x<array.length;x++){ //three nested for loops to pass through each element of 3D array
            for (int y=0;y<array[x].length; y++){
                for (int i=0; i<array[x][y].length; i++){
                    int j=i;
                    //while to constantly place smaller values ahead of values larger than itself
                    while (j>0 && checkOrder( array[x][y][j-1] , array[x][y][j] ) ){
                        //if the element has an element of larger value before it, perform the swap below
                        String temp=array[x][y][j];
                        array[x][y][j]=array[x][y][j-1];
                        array[x][y][j-1]=temp;
                        j--;
                    }
                }
                
            }
        }
        
        for (int x=0;x<array.length;x++){ //nested for loops to pass through 2nd dimension of 3D array
            for (int y=0;y<array[x].length; y++){
                int k=y;
                while (k>0 &&(array[x][k-1].length > array[x][k].length)){
                    //while to constantly swap arrays of smaller lengths with larger arrays before it
                    //swap performed below
                    String[] temp=array[x][k];
                    array[x][k]=array[x][k-1];
                    array[x][k-1]=array[x][k-1];
                    k--;
                }
                
            }
        }
        return array;//return the ordered array
    }
    
    //method to check if first is greater than second (used in frankenstein)
    public static boolean checkOrder(String first, String second){
        boolean result=false;
        //break two elements into seperate letters and seperate numbers
        String firstOne=first.substring(0,1);
        String firstTwo=first.substring(1,2);
        String secondOne=second.substring(0,1);
        String secondTwo=second.substring(1,2);
        String firstEnd=first.substring(2,6);
        String secondEnd=second.substring(2,6);
        //convert last four numbers of string to integers in order to compare easily
        int numFirst=Integer.parseInt(firstEnd);
        int numSecond=Integer.parseInt(secondEnd);
        //assign temporary value to variables storing indexes
        int firstNum=-1;
        int secondNum=0;
        int firstTwoNum=-1;
        int secondTwoNum=0;
        //alphabet array to determine ordering
        String[] alphabet={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        for (int i=0;i<alphabet.length;i++){ //pass through alphabet
            //find index of first letter in each string
            if (alphabet[i].equals(firstOne)){ 
                firstNum=i;
            }
            if (alphabet[i].equals(secondOne)){
                secondNum=i;
            }
        }
        if (firstNum>secondNum){ //compare index to determine which comes first
            result=true;
        }
        if (firstNum==secondNum){ //if the same go to next letter 
            for (int i=0;i<alphabet.length;i++){ //pass through alphabet
                //find index of second letter in each string
                if (alphabet[i].equals(firstTwo)){
                    firstTwoNum=i;
                }
                if (alphabet[i].equals(secondTwo)){
                    secondTwoNum=i;
                }
            }
            if (firstTwoNum>secondTwoNum){ //compare index to determine which comes first
                result=true;
            }
            if (firstTwoNum==secondTwoNum){//if the same then compare numbers
                if (numFirst>numSecond){ //determine which number is smaller
                    result=true;
                }
            }
        }
        return result; //return whether the first is or is not greater than the second value
    }
    
}   //end of class