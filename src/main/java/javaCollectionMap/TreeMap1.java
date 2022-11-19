package javaCollectionMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {

		Map<Integer, Integer> Zip = new TreeMap<Integer, Integer>();

		Zip.put(48212, 313);
		Zip.put(11757, 648);
		Zip.put(48092, 612);
		Zip.put(11370, 618);

		for (Entry<Integer, Integer> eachPhone : Zip.entrySet()) {
			System.out.println(eachPhone.getKey() + "  " + eachPhone.getValue());
		}
		System.out.println(Zip.size());
		System.out.println(Zip.containsKey(48092));
		Zip.remove(48092);
		System.out.println(Zip.size());
		Zip.clear();
		System.out.println(Zip.isEmpty());

	}

}
