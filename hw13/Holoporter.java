//Conrad Ozarek
//HW 13

import java.util.Random;
import java.util.Scanner; //import

public class Holoporter {
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        
        String[][][] arrayOne=soRandom();
        arrayOne=filler(arrayOne);
        print(arrayOne);
        
        System.out.println();
        System.out.println();
        
        String[][][] arrayTwo=soRandom();
        arrayTwo=holoport(arrayOne, arrayTwo);
        print(arrayTwo);
        
        System.out.println();
        
        String find= " ";
        boolean acceptable=false; //set bool valaue to false
        
        System.out.print("Enter a search: ");
        while (!acceptable){
            String input=scan.nextLine();
            if (input.length() == 6){
                //System.out.println("length of 6 here");
                if ( validInput(input) ){ 
                    find=input;
                    acceptable=true;
                }
                else{
                    System.out.println("Error. Enter a proper search: ");
                }
            }
            else {
                System.out.println("Error. Enter a proper search: ");
            }
        }

        System.out.println();
        find(arrayOne,find);

        System.out.println();
        percentage(arrayOne,arrayTwo);
        
    }
    
    
    public static String[][][] soRandom(){
        int random=(int)((Math.random()*9)+1);
        String[][][] array=new String[random][][];
        /*
        for (int i=0; i<random; i++){
            int y = (int)((Math.random()*9)+1);
            array[i][]=new String[y];
            for (int j=0;j<array[i].length;j++){
                int z = (int)((Math.random()*9)+1);
                array[j]=new String[z];
            }
        }
        */ 
        
        /*
        int xRandom=(int)((Math.random()*9)+1);
        int yRandom=(int)((Math.random()*9)+1);
        int zRandom=(int)((Math.random()*9)+1);
        
        for (int x=0;x<array.length;x++){
            array[x]=new String[yRandom][];
        }
        for (int x=0;x<random;x++){
            for (int y=0;y<array[x].length; y++){
                array[x][y]=new String[zRandom];
            }
        }
        return array;
        */
        for (int x=0;x<array.length;x++){
            array[x]=new String[((int)(Math.random()*9)+1)][];
        }
        for (int x=0;x<random;x++){
            for (int y=0;y<array[x].length; y++){
                array[x][y]=new String[((int)(Math.random()*9)+1)];
            }
        }
        return array;
    }
        
        /*
        int random=(int)((Math.random()*9)+1);
        String[][][] array=new String[random][][];
        for (int i=0; i<random; i++){
            int y = (int)((Math.random()*9)+1);
            array[i][]=new String[y][];
            for (int j=0; j<array[i].length; j++){
                int z = (int)((Math.random()*9)+1);
                array[j]=new String[z];
                //array[i][j]=(int)(Math.random()*21);
                //System.out.print("["+array[i][j] + "]   ");
            }
            //System.out.println();
        }
        return array;
    }
    */
    public static String[][][] filler(String[][][] array){
        
        for (int x=0;x<array.length;x++){
                for (int y=0;y<array[x].length; y++){
                    for (int z=0;z<array[x][y].length; z++){
                        array[x][y][z]= coder();
                    }
                }
            }
        return array;
    }
    
    public static String coder(){
        String code="";
        char first = Character.toUpperCase((char)(Math.random()*26 + 'a'));
        char second = Character.toUpperCase((char)(Math.random()*26 + 'a'));
        int third = (int)((Math.random()*9)+1);
        int fourth = (int)((Math.random()*9)+1);
        int fifth= (int)((Math.random()*9)+1);
        int sixth = (int)((Math.random()*9)+1);
        code=""+first+second+third+fourth+fifth+sixth;
        return code;
    }
    
    public static String[][][] holoport(String[][][] arrayOne,String[][][] arrayTwo){
        String blank="$$$$$$";
        
        for (int x=0;x<arrayTwo.length;x++){
            for (int y=0;y<arrayTwo[x].length; y++){
                for (int z=0;z<arrayTwo[x][y].length; z++){
                    arrayTwo[x][y][z]=blank;
                }
            }
        }
        
        /*
        for (int x=0;x<(arrayTwo.length)-(arrayOne.length);x++){
            for (int y=0;y<(arrayTwo[x].length)-(arrayOne[x].length); y++){
                for (int z=0;z<(arrayTwo[x][y].length)-(arrayOne[x][y].length); z++){
                    arrayTwo[x][y][z]=arrayOne[x][y][z];
                }
            }
        }
        */
        
        for (int x=0;x<arrayTwo.length;x++){
            if (x==arrayOne.length){
                break;
            }
            for (int y=0;y<arrayTwo[x].length; y++){
                if (y==arrayOne[x].length){
                    break;
                }
                for (int z=0;z<arrayTwo[x][y].length; z++){
                    if (z==arrayOne[x][y].length){
                        break;
                    }
                    arrayTwo[x][y][z]=arrayOne[x][y][z];
                }
            }
        }
        return arrayTwo;
    }
    
    public static void find(String array[][][], String find){
        boolean found=false;
        for (int x=0;x<array.length;x++){
            for (int y=0;y<array[x].length; y++){
                for (int z=0;z<array[x][y].length; z++){
                    if (array[x][y][z].equals(find)){
                        //x++;y++;z++;
                        System.out.println("The location is: "+x+" "+y+" "+z);
                        found=true;
                    }
                    if (found==true){
                        break;
                    }
                }
            if (found==true){
                break;
            }
            }
        if (found==true){
            break;
        }
        }
        if (found==false){
            System.out.println("NOT FOUND");
        }
    }
    
    public static void print(String[][][] array){
        for (int x=0;x<array.length;x++){
                for (int y=0;y<array[x].length; y++){
                    System.out.print("[");
                    for (int z=0;z<array[x][y].length; z++){
                        System.out.print(array[x][y][z]);
                        if (z<array[x][y].length-1){
                            System.out.print(",");
                        }
                    }
                    System.out.print("]");
                    if (y<array[x].length-1){
                        System.out.print("|");
                    }
                }
                if (x<array.length-1){
                    System.out.print("---");
                }
            }
    }
    
    public static boolean validInput(String input){
        boolean valid=true;
        String ptOne=input.substring(0,1);
        String ptTwo=input.substring(1,2);
        String ptThree=input.substring(2,3);
        String ptFour=input.substring(3,4);
        String ptFive=input.substring(4,5);
        String ptSix=input.substring(5,6);
        if (!validInt(ptThree) || !validInt(ptFour) || !validInt(ptFive) || !validInt(ptSix)){
            valid=false;
        }
        if (!validChar(ptOne) || !validChar(ptTwo)){
            valid=false;
        }
        return valid;
    }
    
    public static boolean validInt(String pt){
        boolean result=false;
        String[] numbers={"1","2","3","4","5","6","7","8","9"};
        for (int i=0;i<numbers.length;i++){
            if (numbers[i].equals(pt)){
                result=true;
            }
        }
        return result;
    }
    
    public static boolean validChar(String pt){
        boolean result=false;
        String[] chars={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        for (int i=0; i<chars.length; i++){
            if (chars[i].equals(pt)){
                result=true;
            }
        }
        return result;
    }
    
    public static void percentage(String arrayOne[][][], String arrayTwo[][][]){
        int arrayOneElements=0;
        int arrayTwoElements=0;
        
        for (int x=0;x<arrayOne.length;x++){
            for (int y=0;y<arrayOne[x].length; y++){
                for (int z=0;z<arrayOne[x][y].length; z++){
                    arrayOneElements++;
                }
            }
        }
        for (int x=0;x<arrayTwo.length;x++){
            for (int y=0;y<arrayTwo[x].length; y++){
                for (int z=0;z<arrayTwo[x][y].length; z++){
                    arrayTwoElements++;
                }
            }
        }
        
        double percentage;
        percentage=100*((1.0*arrayTwoElements-arrayOneElements)/arrayOneElements);
        System.out.printf("The percentage filled is: %.2f",percentage);
        System.out.print("%");
        System.out.println();
    }
    
    
}   //end of class