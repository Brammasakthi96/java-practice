package nithi;
import java.util.ArrayList;

public class array1 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> num=new ArrayList<>();
		//Adding values add()
		num.add(10);                                  
		num.add(20);
		num.add(30);
		System.out.println("Adding values using add(): "+num);
		
		//getting a value get()
		System.out.println("Getting a value using get(): "+num.get(1)); 
		
		//changing a value set()
		num.set(1, 50);
		System.out.println("Changing a value using set(): "+num);
		
		//removing a value remove()
		num.remove(0);
		System.out.println("Removing a value using remove(): "+num);
		
		//finding the size size()
		System.out.println("To finding the size: "+num.size());
		
		//Remove everything clear()
		num.clear();
		System.out.println("Removing values using clear(): "+num);
		
		//check whether list is Isempty()
		System.out.println("Check whether is empty: "+num.isEmpty());
		
		
		
		
		}

}
