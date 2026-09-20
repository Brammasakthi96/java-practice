package sat;
import java.util.Scanner;
public class dd {                                           // WHILE LOOP QUESTION 4
                                                            //TO CHECK THE NUMBER IS PALINDRMOME OR NOT USING WHILE LOOP
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int a=num;
		int rev=0;
		while(num>0)
		{
			int digit=num%10;
			rev= rev*10+digit;
			num=num/10;
		}
		if(rev==a)
		{
			System.out.println("The given number is palindrome "+rev);
		}
		else
		{
			System.out.println("The given number is not a palindrome "+rev);
		}
		sc.close();
	}
}
