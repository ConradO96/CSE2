// Conrad Ozarek
// Mar 11,2016
// Lab 7
//
// Create a program that generates a bowtie

//import java.util.Scanner; //import
        
public class Bowtie {
    //main method required for every Java program
    public static void main(String[] args) {
        
        int nStars=9;
        int nStarsC=9;
        
        int spaces=0;
        int Cspaces=0;
        
        int r=5;
        
        while (nStars>0){
            
            while (spaces>=0){
                System.out.print(" ");
                spaces=spaces-1;
            }
            
            if (nStarsC>0 && nStarsC<=9 && r==5){ 
                
                if (nStars>1){
                    System.out.print("*");
                }
            
                else if (nStars==1){
                    System.out.println("*");
                }

                nStars=nStars-1;
            
                if (nStars==0){
                    nStarsC=nStarsC-2;
                    nStars=nStarsC;
                    Cspaces=Cspaces+1;
                    spaces=Cspaces;
                }
            }//ends if nstarsC==9
                
            if (nStarsC<0 || r==0){ 
                r=0;
                
                if (nStarsC==-1){
                    nStarsC=1;
                    Cspaces=4;
                }
                
                if (nStars>1){
                    System.out.print("*");
                }
            
                else if (nStars==1){
                    System.out.println("*");
                }

                nStars=nStars-1;
                
                if (nStars<=0){
                    if (nStarsC<9){
                        nStarsC=nStarsC+2;
                        nStars=nStarsC;
                        Cspaces=Cspaces-1;
                        spaces=Cspaces;
                    }
                }
                
            }
            

            
        }//end of while
        
        
    }   //end of main method
}   //end of class