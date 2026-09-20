package sat;
import java.util.Scanner;
public class seven {                                         //SWITCH CASE QUESTION 2
                                                            //TO PRINT DAY USING SWITCH
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number between 1 to 7");
		int day=sc.nextInt();
		switch(day)
		{
			case 1:
				System.out.println("sunday");
				break;
			case 2:
			System.out.println("Monday");
			break;
			case 3:
				System.out.println("tuesday");
				break;
			case 4:
				System.out.println("wednesday");
				break;
			case 5:
				System.out.println("thursday");
				break;
			case 6:
				System.out.println("friday");
				break;
			case 7:
				System.out.println("saturday");
				break;
				default:
					System.out.println("invalid");
		}
		sc.close();
		
		// TODO Auto-generated method stub

	}

}
