package collectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map_23_ProgByHashMap {

	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<>();
		map.put("Sohag", 80);
		map.put("Noyon", 90);
		map.put("Tara", 100);
		map.put("Shimu", 40);
		
		//see the result
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your name");
		String name=scanner.nextLine();
		System.out.println("Result: "+map.get(name));
	
	}

}
