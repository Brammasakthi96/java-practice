
package sat;
import java.util.Scanner;
public class satt {                                           //SWITCH-CASE QUESTION 4
                                                              //RESTAURANT BILLING
	public static void main(String[] args)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME TO AB RESTAURANT\n");
        System.out.println("1.juice- rs.50");
        System.out.println("2.bread omlate- rs.100");
        System.out.println("3.sandwich- rs.150");
        System.out.println("4.burger -rs.200");
        System.out.println("5.pizza- 350");
        System.out.println("press your order");
        int order=sc.nextInt();
        System.out.println("how much quantity you have");
        int quant=sc.nextInt();
        switch(order)
        {
          case 1:
        	  
	         System.out.println("Selected Item: juice");
	         System.out.println("Bill amount: Rs."+(50*quant));
	         break;
          case 2:
	         System.out.println("Selected Item: bread omlate");
	         System.out.println("Bill amount: Rs."+(100*quant));
	         break;
          case 3:
	         System.out.println("Selected Item: sandwich");
	         System.out.println("Bill amount: Rs."+(150*quant));
	         break;
          case 4:
	         System.out.println("Selected Item: burger");
	         System.out.println("Bill amount: Rs."+(200*quant));
	         break;
          case 5:
	          System.out.println("Selected Item: pizza");
	          System.out.println("Bill amount: Rs."+(350*quant));
	          break;
        }
		}
   }
