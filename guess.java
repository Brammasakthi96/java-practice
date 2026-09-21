package sat;
import java.util.Scanner;
public class guess {                                     //DO-WHILE LOOP QUESTION 5
                                                        //NUMBER GUESSING GAME USING DO-WHILE,UNTIL CORRECT NUMBER IS ENTERED
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int secret=5;
		int guess;
		do
		{
			System.out.println("Guess the number: ");
			guess=sc.nextInt();
			if(guess != secret)
			{
				System.out.println("Wrong guessing! try again.");
			}
		}
		while(guess !=secret);
		
		System.out.println("correct! you guessed the number");
		sc.close();
	}
}
		
