package sat;
import java.util.Scanner;                         //ARRAY PROGRAM
public class arr {                                //1.TAKE INPUT INTO AN ARRAY
                                                  //2.FIND SUM
	public static void main(String[] args)        //3.FIND LARGEST
	{                                             //4.FIND SMALLEST
		Scanner sc= new Scanner(System.in);       //5.FIND AVERAGE
		System.out.println("Enter the 5 numbers");
		int[] num= new int[5];
		int sum=0;
		for(int i=0;i<num.length;i++)
		{
			num [i]=sc.nextInt();
		}
		int max=num[0];
		int min=num[0];
		double avg=0;
		for(int i=0;i<num.length;i++)
		{
		sum=num[i]+sum;         // to find sum 
		if(num[i]>max)        
		{ 
			max=num[i];          //to find largest
	    }
		if(num[i]<min)
		{
			min=num[i];          //to find smallest
		}
		avg=sum/num.length;      //to find average
		
		}
		
		System.out.println("sum of all elements "+sum);
		System.out.println("the largest number "+max);
		System.out.println("the smallest number "+min);
		System.out.println("the average of all elements "+avg);
		
			
		
		
		
		
		
		
		
		
		}

}
