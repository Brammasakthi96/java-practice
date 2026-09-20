package sat;
import java.util.Scanner;
public class bc {                                             //DO-WILE QUESTION 2
                                                              //CALCULATOR USING DO WHILE
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int option;
		double num1,num2;
		
		do
		{
			System.out.println("CALCULATOR");
			System.out.println("PRESS 1 FOR ADDITON");
			System.out.println("PRESS 2 FOR SUBTRACTION");
			System.out.println("PRESS 3 FOR MULTIPLY");
			System.out.println("PRESS 4 FOR DIVISION");
			System.out.println("PRESS 5 FOR REMAINDER");
			System.out.println("PRESS 6 EXIT");
			System.out.println("Enter your choice");
			option= sc.nextInt();
			
			if(option>=1 && option<=5)
			{
				System.out.println("Enter first number");
				num1=sc.nextDouble();
				System.out.println("enter second number");
				num2=sc.nextDouble();
			}
			else
			{
				num1=0;
				num2=0;
			}
			switch(option)
			{
			case 1:
				System.out.println("ADDITON "+(num1+num2));
				break;
			case 2:
				System.out.println("SUBTRACTION"+(num1-num2));
				break;
			case 3:
				System.out.println("MULTIPLICATION"+(num1*num2));
				break;
			case 4:
				System.out.println("DIVISION"+(num1/num2));
				break;
			case 5:
				System.out.println("REMAINDER"+(num1%num2));
				break;
			default:
				System.out.println("EXIT THE CALCULATOR");
				break;
			}
		}
			while(option!=6);
			
		}
	}

			

			
		

	

		
