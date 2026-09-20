package sat;
import java.util.Scanner;
public class ccc {                                       //WHILE LOOP QUESTION 3
                                                        //REVERSE NUMBER USING WHILE LOOP
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int rev=0,remainder;
		while(num>0)
		{ 
			remainder=num%10;              
			rev=rev*10+remainder;
			num=num/10;
		}
		System.out.println("reverse of a given number "+rev);
		sc.close();

	}

}
