package TestQuestion;

import java.util.Map;
import java.util.TreeMap;

public class TestMap {

	public static void main(String[] args) {

		Map<String,Integer> map = new TreeMap<String, Integer>();
		map.put("Kiruba", 90);
		map.put("Kavuthami", 99);
		map.put("Vithuran", 100);
		System.out.println(map.keySet());
	}

}
