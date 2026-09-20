package sat;
import java.util.Scanner;
public class atm {                                      //SWITCH-CASE QUESTION 3
                                                        //ATM MENU
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int balance= 1000;
		System.out.println("Atm menu");
		System.out.println("1.check balance");
		System.out.println("2.check deposit");
		System.out.println("3. withdraw");
		System.out.println("4.exit");
		System.out.println("press the options");
		int num=sc.nextInt();
		switch(num) {
		case 1:
			System.out.println("your balance: "+balance);
			break;
		case 2:
			{
			System.out.println("deposit the amount");
			int dep=sc.nextInt();
			balance=balance+dep;
			System.out.println(" your remain balance"+balance);
			}
			break;
		case 3:
		   {
			System.out.println("Enter the amount you want to withdrawl");
			int with=sc.nextInt();
			if(with<balance)
			{
				balance=balance-with;
				System.out.println("your remaining amount after withdrawl"+balance);
			}
			else
			{
				System.out.println("insufficient balance");
			}
		    }
		     break;
		case 4:
		    {
			System.out.println("thank you and exit");
			}
		    break;
		default:
			System.out.println("press number between 1 to 4 your number is invalid");
			}
        sc.close();
}
}
