//Conrad Ozarek
//Lab10
//April 8, 2015

import java.util.Random;
import java.util.Scanner; //import

public class arrays {
    //main method required for every Java program
    public static void main(String[] args) {
        
        int numStudents;
        Random randomGenerator = new Random();
        Scanner input; //declare
        input=new Scanner(System.in); //construct
        
        numStudents=randomGenerator.nextInt(6);
        numStudents+=5;

        String[] studentName=new String[numStudents];
        int[] studentGrade=new int[numStudents];
        
        System.out.println("Enter "+numStudents+" student names: ");
        
        //for loop to take input and assign to student name array at location i
        for (int i=0;i<numStudents;i++){
            studentName[i]=input.nextLine();
        }
        
        //for loop to generate random grade and assign it at location j in array
        for (int j=0;j<numStudents;j++){
            int grade=randomGenerator.nextInt(101);
            studentGrade[j]=grade;
        }
        
        //print the student and grade from 2 arrays at the same location
        System.out.println("Here are the midterm grades of the "+numStudents+" students above: ");
        for (int k=0;k<numStudents;k++){
            System.out.println(studentName[k]+" : "+studentGrade[k]);
        }
        
    }
}   //end of class