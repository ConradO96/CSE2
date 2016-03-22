// Conrad Ozarek
// Mar 21,2016
// Hw 7
//
// Create a program that generates a twist

//import java.util.Scanner; //import

import java.util.Scanner; //import

public class Twisty {
    //main method required for every Java program
    public static void main(String[] args) {
        
        Scanner myScanner; //declare
        myScanner=new Scanner(System.in); //construct
        
        System.out.println("Enter the length and width: ");
        int length=myScanner.nextInt();
        int width=myScanner.nextInt();
        
        int spaces=(width-1)/2;
        
        for (int i=0; i<width;i++){
            for (int j=0; j<length; j++){
                if (i==j%width) {
                    //if (i%width==j%width){
                    //System.out.print("\\");
                    //}
                    if (i==j%(width*2)){
                        System.out.print("#");
                    }
                    else {
                        System.out.print("\\");
                    }
                }
                else if ((i+(j%width))%width==width-1){
                    if ((i+(j%(width*2)))%(2*width)==(2*width)-1){
                        System.out.print("#");
                    }
                    else {
                    System.out.print("/");
                    }
                }
                //if (i==j%width){ 
                //    System.out.print("#");
                //}
                //else if (j%width==0){
                //    System.out.print("/");
                //}
                //else if (j%width==1){
                //    System.out.print("\\");
                //}
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
        
//        for (int i=0;i<spaces;){
//            System.out.print(" ");
//        }
        
    }   //end of main method
}   //end of class