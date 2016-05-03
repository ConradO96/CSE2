//Conrad Ozarek
//LAB 12
//April 22, 2016

import java.util.Random;
import java.util.Scanner; //import

public class raggedArray {
    //main method required for every Java program
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        Random randomGenerator = new Random();
        
        System.out.print("Enter size of main array: ");
        int xArray=scan.nextInt();
        int[][] array=new int[xArray][];
        System.out.println();
        System.out.println("Here is the unsorted array");
        
        for (int i=0; i<xArray; i++){
            int col = (int)(Math.random()*4)+1;
            array[i]=new int[col];
            for (int j=0; j<array[i].length; j++){
                array[i][j]=(int)(Math.random()*21);
                System.out.print("["+array[i][j] + "]   ");
            }
            System.out.println();
        }
        
        System.out.println();

        
        int temp=0;
        for (int i=0; i<xArray;i++){
            for (int k=0;k<20;k++){
                for (int j=0; j<array[i].length-1; j++){
                    if (array[i][j]>array[i][j+1]){
                        temp=array[i][j];
                        array[i][j]=array[i][j+1];
                        array[i][j+1]=temp;
                    }
                    else {}
                }
            }
        }
        
        System.out.println("The sorted array is");
        for (int i=0; i<xArray; i++){
            for (int j=0; j<array[i].length; j++){
                System.out.print("["+array[i][j] + "]   ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        int[] tempTwo;
        for (int k=0;k<20;k++){
            for (int i=0;i<xArray-1;i++){
                if (array[i].length>array[i+1].length){
                    tempTwo=array[i];
                    array[i]=array[i+1];
                    array[i+1]=tempTwo;
                }
            }
        }
        
        System.out.println("The rearranged array is");
        for (int i=0; i<xArray; i++){
            for (int j=0; j<array[i].length; j++){
                System.out.print("["+array[i][j] + "]   ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        System.out.print("What number do you want to search for? ");
        int search=scan.nextInt();
        System.out.println();
        
        int col=0;
        int row=0;
        
        boolean found=false;
        for (int i=0; i<xArray; i++){
            for (int j=0; j<array[i].length; j++){
                if (search==array[i][j]){
                    found=true;
                    row=i;
                    col=j;
                    break;
                }
            }
            if (found==true){
                break;
            }
        }
        row++;
        col++;
        if (found==true){
            System.out.println("Found at Row: "+row+" Col: "+col);
        }
        else {
            System.out.println("Not Found");
        }
        
        
        
    }
}   //end of class