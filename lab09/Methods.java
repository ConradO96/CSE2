// Conrad Ozarek
// Mar 25,2016
// Lab 09
//
// Create a program that generates a random sentence

import java.util.Random;
import java.util.Scanner; //import

public class Methods {
    //main method required for every Java program
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        boolean cont=true;
do{
        Random randomGenerator = new Random();
        String adjective,adjectiveTwo, adjectiveThree, nounSub, ptVerb,nounObj;
        System.out.print("The "+adjective()+" "+adjective()+" "+nounSub()+" "+ptVerb() +" the "+adjective()+" "+nounObj() );
        //System.out.print("Word: "+adjective()+ " ");
        System.out.println();
        
System.out.println("Again? Enter Y or y to continue. ");
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
    
    public static String adjective(){
        Random randomGenerator = new Random();
        int a=randomGenerator.nextInt(10);
        String adjective;
        switch (a){
                case 1:
                    adjective="mighty";
                    break;
                case 2:
                    adjective="selfish";
                    break;
                case 3:
                    adjective="quick";
                    break;
                case 4:
                    adjective="ugly";
                    break;
                case 5:
                    adjective="old";
                    break;
                case 6:
                    adjective="heavy";
                    break;
                case 7:
                    adjective="mean";
                    break;
                case 8:
                    adjective="lively";
                    break;
                case 9:
                    adjective="fat";
                    break;
                default:
                    adjective="strong";
                    break;
            }
        return adjective;
    }

    public static String nounSub(){
        Random randomGenerator = new Random();
        int b=randomGenerator.nextInt(10);
        String nounSub;
        switch (b){
                case 1:
                    nounSub="fox";
                    break;
                case 2:
                    nounSub="dog";
                    break;
                case 3:
                    nounSub="cat";
                    break;
                case 4:
                    nounSub="tiger";
                    break;
                case 5:
                    nounSub="wolf";
                    break;
                case 6:
                    nounSub="bird";
                    break;
                case 7:
                    nounSub="snake";
                    break;
                case 8:
                    nounSub="monkey";
                    break;
                case 9:
                    nounSub="zebra";
                    break;
                default:
                    nounSub="fish";
                    break;
            }
        return nounSub;
    }
    public static String ptVerb(){
        Random randomGenerator = new Random();
        int c=randomGenerator.nextInt(10);
        String ptVerb;
        switch (c){
                case 1:
                    ptVerb="jumped";
                    break;
                case 2:
                    ptVerb="attacked";
                    break;
                case 3:
                    ptVerb="punched";
                    break;
                case 4:
                    ptVerb="kicked";
                    break;
                case 5:
                    ptVerb="hugged";
                    break;
                case 6:
                    ptVerb="grappled";
                    break;
                case 7:
                    ptVerb="visited";
                    break;
                case 8:
                    ptVerb="greeted";
                    break;
                case 9:
                    ptVerb="talked to";
                    break;
                default:
                    ptVerb="saw";
                    break;
            }
        return ptVerb;
    }
    
    public static String nounObj(){
        Random randomGenerator = new Random();
        int d=randomGenerator.nextInt(10);
        String nounObj;
        switch (d){
                case 1:
                    nounObj="man";
                    break;
                case 2:
                    nounObj="mountain";
                    break;
                case 3:
                    nounObj="plane";
                    break;
                case 4:
                    nounObj="bed";
                    break;
                case 5:
                    nounObj="train";
                    break;
                case 6:
                    nounObj="phone";
                    break;
                case 7:
                    nounObj="clock";
                    break;
                case 8:
                    nounObj="building";
                    break;
                case 9:
                    nounObj="ship";
                    break;
                default:
                    nounObj="cat";
                    break;
            }
        return nounObj;
    }
    
}   //end of class