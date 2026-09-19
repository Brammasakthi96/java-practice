package sat;
import java.util.Scanner;
public class rev {                                       //FOR LOOP QUESTION 3
                                                        //TO REVERSE A NUMBER USING FOR LOOP
	public static void main(String[] args) 
	{
		System.out.println("Enter the number you want to reverse");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int rev=0;
		for(int i=num;i>0;i=i/10)
		{
			int remainder=i%10;
			rev=(rev*10)+remainder;
		}
		System.out.println("Reverse number= "+rev);
        sc.close();
	}

}
