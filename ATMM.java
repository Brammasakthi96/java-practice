package sat;
import java.util.Scanner;
public class ATMM {                              //DO-WHILE QUESTION 3
                                                 //ATM APPLICATION USING DO-WHILE AND SWITCH-CASE
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int option;
		double balance=1000,deposit,withd;
		
		do
		{
			System.out.println("----ATM MENU----");
			System.out.println("CHECK BALANCE PRESS 1");
			System.out.println("TO DEPOSIT PRESS 2");
			System.out.println("TO WITHDRAWL PRESS 3");
			System.out.println("EXIT PRESS 4\n\n");
			System.out.println("press your option");
			option=sc.nextInt();
			switch(option)
			{
			case 1:
				System.out.println("balance "+balance);
				break;
			case 2:
				System.out.println("enter the amount you want to deposit ");
				deposit=sc.nextDouble();
				balance= balance+deposit;
				System.out.println("deposited successfully "+balance);
				break;
			case 3:
				System.out.println("enter the amount you want to withdrawl");
				withd=sc.nextDouble();
				if(withd<=balance)
				{
					withd=withd-balance;
					System.out.println("withdrawl successfully "+balance);
				}
				else
				{
					System.out.println("insufficient amount");
				}
				break;
			case 4:
				System.out.println("Exit thank you for visiting");
				break;
			default:
					System.out.println("invalid");
					break;
				}
		}
		while(option!=4);
								
					
					
					
		}

	}


