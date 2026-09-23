package sat;
import java.util.Arrays;

public class listarr {

	public static void main(String[] args) 
	{
		int[] a= {10,20,300,70,12};
		System.out.println(Arrays.toString(a));
		//Array.sort()
		Arrays.sort(a);
		System.out.println("\nArrays sorting in ascending order");
		System.out.println(Arrays.toString(a));
		
		//Array.equals()
		int[] b= {50,52,74,56,24};
		int[] c= {1,2,3};
		int[] d= {1,2,3};
		System.out.println("\nTwo arrays having a same element in same order");
		System.out.println("compare a and b\n :"+Arrays.equals(a, b));
		System.out.println("Compare c and d\n :"+Arrays.equals(c,d));
		
		//Arrays.copyof()
		int [] copy=Arrays.copyOf(a, 7);
		System.out.println("\nCopy of an array with specified length\n"+Arrays.toString(copy));
		
		
		//Arrays.copyOfRange()
		int[] copy1=Arrays.copyOfRange(b, 0, 4);
		System.out.println("\ncopy a specified portion of an array\n"+Arrays.toString(copy1));
		
		
		//Arrays.fill()
		Arrays.fill(c, 5);
		System.out.println("\nFills all element with the same value \n"+Arrays.toString(c));
		
		
		//Arrays.binarySearch()
		int result=Arrays.binarySearch(a, 300);
		System.out.println("\nBinary search is used to find an element\n "+result);
		}
}
