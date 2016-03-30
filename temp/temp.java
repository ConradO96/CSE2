// Conrad Ozarek
// Mar 28,2016
// Hw 09
//
// Create a rectangle generator for int and Strings

import java.util.Random;
import java.util.Scanner; //import

public class temp {
    //main method required for every Java program
    public static void main(String[] args) {
        Scanner input; //declare
        input=new Scanner(System.in); //construct

        System.out.println("Square Generator. Input int or string: ");

        int valueInt=0; 
        String valueString=" ";
        boolean acceptable=false;
        while (!acceptable){ 
            if ( input.hasNextInt() ){ 
                valueInt=input.nextInt();
                if (valueInt<0){ 
                    acceptable=false;
                    System.out.println("Error: enter a positive");
                }
                else { 
                    acceptable=true;
                    String resultInt=rectInt(valueInt);
                    System.out.println(resultInt);
                }
            }
            else { 
                acceptable=true;
                valueString=input.nextLine();
                String resultString=rectString(valueString);
                System.out.println("");
                System.out.println(resultString);
            }
        }
    }
    
    public static String rectInt(int a){
        String result="";
        for (int i=0; i<a; i++){
            for (int j=0; j<a; j++){
                result=result+"%";
            }
            result=result+"\n";
        }
        //String result="works";
        return result;
    }
    
    public static String rectString(String a) {
        String result=a;
        for (int i=1; i<a.length(); i++){
            result=result+"\n"+a;
        }
        //String result="works";
        return result;
    }

}
    