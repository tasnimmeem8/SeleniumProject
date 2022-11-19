package javaCollectionMap;

import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.collections4.map.HashedMap;

public class HashMap2 {

	public static void main(String[] args) {

		Map<String, String> name = new HashedMap<String, String>();

		name.put("Shahla", "Meem");
		name.put("Dawood", "Khan");
		name.put("Shahnawaz", "Khan");

		for (Entry<String, String> eachName : name.entrySet()) {
			System.out.println(eachName.getKey() + " " + eachName.getValue());
		}

	}

}
