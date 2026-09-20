package sat;
import java.util.Scanner;
public class six {                                                           //SWITCH-CASE QUESTION 1
                                                                            //CALCULATOR USING SWITCH
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("Enter the operator");
		System.out.println(" add + \n sub - \n multiple *\n divide / \n remainder %\n");
		char operator = sc.next().charAt(0);
		switch(operator)
		{
		case '+':
			System.out.println("add "+(num1+num2));
			break;
			case '-':
				System.out.println("sub "+(num1-num2));
				break;
			case '*':
				System.out.println("multiple "+(num1*num2));
				break;
			case '/':
				System.out.println("divide "+(num1/num2));
				break;
			case '%':
				System.out.println("remainder "+(num1%num2));
				break;
				default: 
					System.out.println("invalid operator");
					break;
		}
		sc.close();
	}
}
