import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		//TreeSet maintains the sorting order (ascending order) 
		
		TreeSet<String> treeSet = new TreeSet<>(); 
		
		System.out.println(treeSet.size());
		System.out.println(treeSet); 
		
		treeSet.add("banana"); 
		treeSet.add("grape"); 
		treeSet.add("mango");
		treeSet.add("papaya");
		treeSet.add("orange"); 
	  //treeSet.add(null); will not accept null values 
		
		System.out.println(treeSet.size()); 
		System.out.println(treeSet); 
		
		
		

	}

}
