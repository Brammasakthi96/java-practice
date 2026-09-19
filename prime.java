package sat;
import java.util.Scanner;
public class prime {
                                                                      //FOR LOOP QUESTION 4
	public static void main(String[] args) 
	{
		                                                             // TO CHEECK NUMBER IS PRIME OR NOT USING FOR LOOP
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the number you want to know prime number");
      int num=sc.nextInt();
      int count=0;
      for(int i=1;i<=num;i++)
        {
	      if(num%i==0)
	         {
		       count++;
	         }
	      }
	 if(count==2)
	    {
		 System.out.println(num+ " is a prime number");
		}
	else
	    {
		System.out.println(num+ " is not a prime number");
	    }
    sc.close();
	}
}
