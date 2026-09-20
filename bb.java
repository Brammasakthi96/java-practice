package sat;
import java.util.Scanner;
public class bb {
                                                                                  //WHILE LOOP QUESTION 2
	public static void main(String[] args) {
	                                                                              // SUM OF DIGITS USING WHILE LOOP
            System.out.println("enter the number you want to sum");         
		    Scanner sc=new Scanner(System.in);                                           
		    
		    int num=sc.nextInt();
		    int sum=0;
		    while(num>0)
		    {
		    	sum=sum+num%10;
		    	num=num/10;
		    	
		    }
		    System.out.println("sum of digits "+sum);
		    sc.close();
	}

}
