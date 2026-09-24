package nithi;
import java.util.Scanner;
import java.util.ArrayList;
public class array3 {
                                                //Arraylist using scanner and loop
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		ArrayList<Integer> num= new ArrayList<>();
		System.out.println("how many numbers you want to enter");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter number"+(i+1)+" : ");
			int a=sc.nextInt();
			num.add(a);
		}
		System.out.println("Numbers are:");
		for(int a:num)
		{
			System.out.println(a);
		}
		sc.close();		
}

}
