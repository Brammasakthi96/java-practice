package sat;
import java.util.Scanner;
public class yn {                                       //DO-WHILE LOOP QUESTION 4
                                                       //REPEATEDLY ASK THE USER YOU WANT TO CONTINUE(Y/N)?
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		char a;
		 do {
			 System.out.println("Program is running\n");
			 System.out.println("do you want to continue the program press 'Y' or 'y'");
			 System.out.println("do you end the program press 'n'" );
			 a=sc.next().charAt(0);
		 }
		 while(a=='Y' || a=='y');
		 System.out.println("program ended");
		 sc.close();
			 
			 
		 }
		
		

	}


