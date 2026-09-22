package sat;
import java.util.Scanner;
                                               //TO SEARCH AN ELEMENT INTO AN ARRAY
public class arrsearch {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[3];
		System.out.println("Enter 3 elements: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.println("enter the number you want to search");
		int sch=sc.nextInt();
		boolean find=false;
		for(int i=0;i<arr.length;i++)
		{
			if(sch==arr[i])
				find=true;
			break;
		}
		if(find)
		{
			System.out.println("The number is present");
		}
		else
		{
			System.out.println("the number is not present");
		}
		}
}
