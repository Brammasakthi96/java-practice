package sat;
import java.util.Scanner;
                                                           //SWITCH-CASE QUESTION 5
public class grade {
                                                           //ACCEPTS GRADE(A,B,C,D,F) AND DISPLAY CORRESPONDING GRADE
	public static void main(String[] args) 
	{
		System.out.println("Enter mark");
		Scanner sc=new Scanner(System.in);
		int mark=sc.nextInt();
		int grade;
		if(mark>=85 && mark<=100)
		{       grade =1;      }
		else if(mark>=75)
		{       grade=2;       }
		else if(mark>=65)
		{       grade=3;       }
		else if(mark>=55)
		{       grade=4;       }
		else if(mark>=45)
		{       grade=5;       }
		else if(mark>=35)
		{       grade=6;       }
		else
			grade=0;
		
		switch(grade) {
		case 1:
			System.out.println("A GRADE "+mark);
			break;
		case 2:
			System.out.println("B GRADE "+mark);
			break;
		case 3:
			System.out.println("C GRADE "+mark);
			break;
		case 4:
			System.out.println("D GRADE "+mark);
			break;
		case 5:
			System.out.println("E GRADE just pass"+mark);
			break;
		case 6:
			System.out.println("FAIL"+mark);
			break;
			default:
				System.out.println("invalid mark"+mark);
	}
		sc.close();
	}
	}


