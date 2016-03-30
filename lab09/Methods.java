// Conrad Ozarek
// Mar 25,2016
// Lab 09
//
// Create a program that generates a random sentence

import java.util.Random;

public class Methods {
    //main method required for every Java program
    public static void main(String[] args) {
        
        Random randomGenerator = new Random();
//        int random = randomGenerator.nextInt(10);

        String adjective,adjectiveTwo, adjectiveThree, nounSub, ptVerb,nounObj;
//        int random=(int)(Math.random()*10)+1;
         
        adjective=adjective(randomGenerator.nextInt(10));
        adjectiveTwo=adjective(randomGenerator.nextInt(10));
        adjectiveThree=adjective(randomGenerator.nextInt(10));
        nounSub=nounSub(randomGenerator.nextInt(10));
        ptVerb=ptVerb(randomGenerator.nextInt(10));
        System.out.print("The "+adjective+" "+adjectiveTwo+" "+nounSub+" "+ptVerb +" the "+adjectiveThree+" "+"____");
        System.out.println();
        
    }   //end of main method
    
    public static String adjective(int a){
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
    public static String nounSub(int b){
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
    public static String ptVerb(int c){
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
    
}   //end of class