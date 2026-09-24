package nithi;
import java.util.HashSet;
import java.util.Set;

public class sett {

	public static void main(String[] args) 
	{
		//CREATE SET
		Set <String>fruit= new HashSet<>();
		
		//1.ADD()
		fruit.add("Apple");
		fruit.add("Mango");
		fruit.add("Pine apple");
		fruit.add("Orange");
		fruit.add("Pine apple"); //duplicate
		fruit.add("Banana");
		System.out.println("1.Add: "+fruit);
		
		//2.CONTAINS()
		System.out.println("2.Contains mango: "+fruit.contains("Mango"));
		
		//3.size()
		System.out.println("3.Size(): "+fruit.size());
		
		//4.REMOVE()
		fruit.remove("Orange");
		System.out.println("4.Remove orange: "+fruit.remove("Orange"));
		
		//5.ISEMPTY()
		System.out.println("5.isEmpty: "+fruit.isEmpty());
		
		//6.ADDALL()
		Set <String>morefruit=new HashSet<>();
		morefruit.add("Guava");
		morefruit.add("papaya");
		fruit.addAll(morefruit);
		System.out.println("6.add elements from another set addAll: "+fruit);
		
		//7.CONTAINSALL()
		System.out.println("7.Contains all: "+fruit.containsAll(morefruit));
		
		//8.REMOVELL()
		fruit.removeAll(morefruit);
		System.out.println("8.Remove all: "+fruit);
		
		//Add some elements for retainall()
		fruit.add("guava");
		fruit.add("Papaya");
		//9.RETAINALL()
		Set<String>keepfruit=new HashSet<>();
		keepfruit.add("Apple");
		keepfruit.add("Guava");
	    fruit.retainAll(keepfruit);
	    System.out.println("9.RetainAll(): "+fruit);
	    
	    //10.clear()
	    fruit.clear();
	    System.out.println("10.Clear: "+fruit);
		
		//11.isempty
	    System.out.println("is empty: "+fruit.isEmpty());

	}

}
