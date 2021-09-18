package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
	public static void main(String[] args) {
		Map<String, String> languages = new HashMap<>();
		
		languages.put("Java", "OOP");
		languages.put("Python", "AI");
		languages.put("C++", "Basic");
		languages.put("JS", "Fontend");
		
		if(languages.containsKey("Java")) {
			System.out.println("Java in the map");
		}
		else {
			System.out.println("Java is not in the map");
		}
		
		languages.remove("C++");
		if(!languages.containsKey("C++")) {
			System.out.println("C++ removed");
		}
		else {
			System.out.println("C++ not removed");
		}
		if(languages.replace("JS", "Fontend", "A functional")) {
			System.out.println("JS replaced");
		} 
		else {
			System.out.println("JS was not replaced");
		}
		
		
		for( String key: languages.keySet()) {
			System.out.println(key + ": " + languages.get(key));
		}

	}
	
	
}
