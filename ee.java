package sat;
import java.util.Scanner;
public class ee {                                              //WHILE LOOP QUESTION 5
                                                              //CONTINUOUSLY ACCEPTS NUMBERS UNTIL ZERO THEN SUM USING WHILE LOOP
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sum=0;
		while(num!=0)
		{
			sum=sum+num;
			System.out.println("Enter the number");
		    num=sc.nextInt();
		}
		System.out.println("total sum = "+sum);
		sc.close();
		}

	}


