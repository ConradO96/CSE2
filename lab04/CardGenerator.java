// Conrad Ozarek
// Feb 19,2015
// Lab 04
//
// Create a program that generates a random card

        
public class CardGenerator {
    //main method required for every Java program
    public static void main(String[] args) {
        
        int card=(int)(Math.random()*52)+1;   //used to generate and integer from 1 to 52
        
//Next two lines used to test and check code to see if it works
//        int card=(int)(Math.random()*13)+1;
//        System.out.println("The number generated is "+card);

        String suit;   //initialize string
        
        //if statements to determine the suit of generated number
        if (card>=1 && card<=13){
            suit="Diamonds";
        }
        else if (card>=14 && card <=26){
            suit="Clubs";
        }
        else if (card>=27 && card <=39){
            suit="Hearts";
        }
        else {
            suit="Spades";
        }
        
        //calculate reaminder to determine value of card
        int remainder;
        remainder=card%13;
        
        
        //use switch statements to print the value of the card as  well as its appropriate suit
            switch (remainder){
                case 1:
                    System.out.println("You picked the Ace of "+suit);
                    break;
                case 11:
                    System.out.println("You picked the Jack of "+suit);
                    break;
                case 12:
                    System.out.println("You picked the Queen of "+suit);
                    break;
                case 0:
                    System.out.println("You picked the King of "+suit);
                    break;
                default:
                    System.out.println("You picked the "+remainder+" of "+suit);
                    break;
            }
    }   //end of main method
}   //end of class