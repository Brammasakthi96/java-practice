package sat;
import java.util.Scanner;
public class facto {                                         //FOR LOOP QUESTON 2
                                                             //FIND THE FACTORIAL OF A NUMBER USING FOR LOOP
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want to factorial");
		int num=sc.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of"+num +" is "  +fact);
        sc.close();
	}

}
