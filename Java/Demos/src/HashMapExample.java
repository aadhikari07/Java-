import java.util.HashMap;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {

	HashMap<String, String> map = new HashMap<String,String>(); //keys must be unique, values can be duplicated
		
 
	map.put("dbserver.host", "10.20.30"); 
	map.put("dbserver.protno", "3306"); 
	map.put("dserver.username", "Admin");
	map.put("dserver.password", "admin123"); 
	
	System.out.println(map.size()); 
	System.out.println(map); 
	
	map.put("dbserver.serverName", "oracle"); 
	
	System.out.println(map.size()); 
	System.out.println(map); 
	
	//retriving or displaying key values 
	Set<String> keySet = map.keySet(); 
	
	for(String key : keySet) {
		
		System.out.println(key); 
		System.out.println(key + "===>" + map.get(key)); 

	}
		
	//removing keys 
	map.remove("dbserver.portno"); 
	System.out.println(map.size()); 
	System.out.println(map); 
	
	//does the map contain this specific key 
	System.out.println(map.containsKey("dbserver.portno")); 
	
	//clearing map
	map.clear(); 
	
	//checking if the map is empty 
	if(map.isEmpty()) {
		System.out.println("Map is empty!");
	}
	
	
	
	
	
	
	
	
	
	}

}
