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
  	index = scan.nextInt();
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
  
  static int[] randomInput(){
  	int array[]=new int[10];
		for (int j=0;j<10;j++){
      int num=(int)(Math.random()*10);
      array[j]=num;
    }	
    return array;
  }
  
  static int[] delete(int[] a, int b){
  	int length=a.length-1;
  	int array[]=new int[9];
  	for (int i=0;i<length;i++){
  		if (i != b){
  			array[i]=a[i];
  		}
  		else {
  			for (int j=i; j<length;j++){
  				array[j]=a[i+1];
  				i++;
  			}
  			break;
  		}
  	}
  	return array;
  }
  
  static int[] remove(int[] a, int b){
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
	boolean exist=false;
	for (int k=0;k<a.length-1;k++){
		if (b == a[k]){
			exist=true;
			break;
		}
		else{
			exist=false;
		}
	}
	if (exist==true){
		int count=1;
  	int array[]=new int[10];
  	//int arrayTwo[]=new int[10];
  	for (int i=0;i<10;i++){
  		if (a[i] == b){
  			array[i]=-1;
  		}
  		else{
  			array[i]=a[i];
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
    for (int i=0;i<50;i++){
		for (int j=0; j<a.length-1;j++){
			if (array[j]==-1){
				array[j]=array[j+1];
				array[j+1]=-1;
			}
			else{
				array[j]=array[j];
			}
		}
    }
		
		for (int i=0;i<array.length-1;i++){
			if (array[i]==-1){
				count++;
			}
		}
		int arrayTwo[]=new int[a.length-count];
		for (int i=0;i<(a.length-count);i++){
			arrayTwo[i]=array[i];
		}
		
		return arrayTwo;
  }
  else {
  	return a;
  }
}
}
