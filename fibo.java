package sat;
import java.util.Scanner;
public class fibo {
                                                      //FOR LOOP QUESTION 5
	public static void main(String[] args) 
	{
		                                              // FIBONACCI SERIES
      System.out.println("Enter the number");
      Scanner sc=new Scanner(System.in);
      int f=sc.nextInt();
      int a=0,b=1,c;

      for(int i=1;i<=f;i++)
         {
	       System.out.println(a);
           c=a+b;
           a=b;
           b=c;
         }
      sc.close();
    }
}
