/*
Conrad Ozarek
HW 12

///////////////////////////////////
  		PLEASE READ
  The following program has terrible spacing and indentation
  because it was required to take this program from the hw sheet assigned.
  When pasted into c9.io, the spacing is as shown and indenting does not fix it.
  I could not figure out a way to fix this proglem and therefore out of frustration left it as is.
  The program works however the spacing might be inappropriate 
///////////////////////////////////
*/

///////////////////////////////GIVEN CODE STARTS HERE
import java.util.Scanner;
public class RemoveElements{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
int num[]=new int[10];
int newArray1[];
int newArray2[];
int index,target;
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);

  	System.out.print("Enter the index ");
///////////////////////////////////////////////// I INPUT CODE HERE TO CHECK IF INPUT IS VALID
		index=0;
  	boolean acceptableInput=false; //set bool valaue to false
        while (!acceptableInput){
                if ( scan.hasNextInt() ){ //check if input is an int
                    index=scan.nextInt(); //if it is assign it to searchFirst
                    if (index>9 || index<0){ //check if input fits to bounds 0-9
                        acceptableInput=false; //if not ask again for input
                        System.out.println("Error: Enter a proper index.");
                    }
                    else {
                        acceptableInput=true; //if valid input escapee the while loop with new value for length
                    }
                }
                else { //else if not an int entered, ask again
                    System.out.println("Error: Please type an integer. (1-9) ");
                    scan.next();
                }
            }//end of while for input
///////////////////////////////////////////////// END OF INPUT CODE
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
  	
		System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y")); 
  }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }
///////////////////////////////GIVEN CODE ENDS HERE

  static int[] randomInput(){//first method to create the array
  	int array[]=new int[10]; //assigns a length of ten to created array
		for (int j=0;j<10;j++){ //for loop to pass through array
      int num=(int)(Math.random()*10);//random number generator from 1-9
      array[j]=num;//assigns generated number to array position
    }	
    return array;//returns array to main method
  }
  
  static int[] delete(int[] a, int b){ //method to delete certain element
  	int length=a.length-1; //assign length of array for for loop (hence -1)
  	int array[]=new int[9];//create a new array of one length shorter for the array which is losing an element
  	for (int i=0;i<length;i++){//pass through array
  		if (i != b){ //if the array element does not equal the element entered to remove, assign the new array the value of the original array
  			array[i]=a[i];
  		}
  		else { //otherwise if the array element and element to delete match...
  			for (int j=i; j<length;j++){ //skip that element and assign it to the next value, as seen with the [i+1]
  				array[j]=a[i+1];//array[j] because i will be one larger to account for removed element (or in this case skipped)
  				i++;
  			}
  			break;//break the loop once the j for loop ends to avoid further assignment of incorrect and nonexisting elements
  		}
  	}
  	return array;//return the array which does not have the element we wanted to delete
  }
  
  static int[] remove(int[] a, int b){ //method for removing all values according to input
  /*
  int length=a.length-1;
  int array[]=new int[10];
  for (int i=0;i<length;i++){
  		if (a[i] != b){
  			array[i]=a[i];
  		}
  		else {
  			for (int j=i;j<length;j++){
  				array[j]=a[j+1];
  			}
  			break;
  		}
  	}
  	return array;
  	*/
  	//int j=0;
  	/*
  	int array[]=new int[10];
  	for (int i=0;i<10;i++){
  		if (a[i] != b){
  			array[j]=a[i];
  			j++;
  			count++;
  		}
  		else{
  			i++;
  		}
  	}
  	return array;
	*/
	boolean exist=false; //set boolean to false
	for (int k=0;k<a.length-1;k++){ //for loop to pass through the array
		if (b == a[k]){ //check if there is an value in array that matches the value that should be deleted
			exist=true;//if so, return true to pass through process of removing it
			break;// and leave for loop
		}
		else{
			exist=false;// otherwise if it does not exist, return the array as is since nothing will be removed
		}
	}
	if (exist==true){//if the value to be deleted exists...
		int count=1;//set count of how many time this number occurs to 1
  	int array[]=new int[10];//create new array of size 10
  	for (int i=0;i<10;i++){//for loop to pass through array
  		if (a[i] == b){//condition to check if the values match
  			array[i]=-1;//if they do, set it to -1 in order to delete later
  		}
  		else{
  			array[i]=a[i];//otherwise set it equal to the original array
  		}
  	}
  	/*
  	for (int i=0; i<10;i++){
  		if (array[i]==-1){
  			i++;
  			arrayTwo[j]=array[i];
  			j++;
  			count++;
  		}
  		else {
  			arrayTwo[j]=array[i];
  			j++;
  			count++;
  		}
  	}
  	return arrayTwo;
  }
    	*/
    	int temp;
    for (int i=0;i<50;i++){//for loop that will repeat 50 times swapping -1 values with the element to its right. 
    											 //Kind of like a bubble sort but just moves -1 to the end. 
    											 //Repeats 50 times to make sure it is at the end, can be large number because at the worst it will swap -1 with -1
		for (int j=0; j<a.length-1;j++){//for loop to pass through array
			if (array[j]==-1){ //if -1 is encountered we swap it with the next value, as mentioned previosly, to make all -1 values at the end
				array[j]=array[j+1];
				array[j+1]=-1;
			}
			else{
				array[j]=array[j];//if -1 is not encountered do not change to value of array and asign it to the original value
			}
		}
    }
		
		for (int i=0;i<array.length-1;i++){//for loop to pass through array
			if (array[i]==-1){//if a -1 exists...
				count++;//add one to the count of -1's
			}
		}
		int arrayTwo[]=new int[a.length-count];//create new array of a length that willl not include the -1, in other words, -count
		for (int i=0;i<(a.length-count);i++){//for loop to pass through and assign values to new array
			arrayTwo[i]=array[i];//assign all non -1 values of the previous array to the new array
		}
		
		return arrayTwo;//return the new array without the -1's which represented the value that was supposed to be removed
  }
  else {
  	return a;//if the original condition of checking if the value that is supposed to be removed is not satisfied, 
  					 //then there exists no value to remove and the above code is skipped and the original array is just returned
  }
}
}
