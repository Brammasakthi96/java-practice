package nithi;
import java.util.HashMap;

public class hashmap {                                              //HASHMAP AND ITS IMPORTANT METHODS IN JAVA

	public static void main(String[] args)
	{
		HashMap<Integer,String>student=new HashMap<>();
		//1.put()-add key-value pairs
		student.put(101, "Radhi");
		student.put(102, "Reena");
		student.put(103, "Arjun");
		student.put(104, "Rocky");
		student.put(105, "Divi");
		System.out.println("HashMap: "+student);
		
		//2.get()-get value using key
		System.out.println("Student 103: "+student.get(102));
		
		//3.containsKey()-check whether key exists
		System.out.println("Contains key 102: "+student.containsKey(103));
		
		//4.containsValue()-check whether value exists
		System.out.println("contains Value Reena: "+student.containsValue("Reena"));
		
		//5.size()-count entries
		System.out.println("Size: "+student.size());
		
		//6.remove() -delete data
		student.remove(101);
		
		//7.replace()-change a value
		student.replace(103, "Arjun kumar");
		System.out.println("After replace arjun kumar 103: "+student);
		
		//8.keyset()-get all keys
		System.out.println("Keys: "+student.keySet());
		
		//9.values()-get all values
		System.out.println("values: "+student.values());
		
		//10.entrySet()-get key+values
		System.out.println("Entries: "+student.entrySet());
		
	}
}
