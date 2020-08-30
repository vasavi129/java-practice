package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Vinod Kumar
 *
 *
 */
/**
 * @author Vinod Kumar
 *
 */
public class FrequencyOfArr {
	public static void main(String[] args) {
		String s = "maintainance";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			Integer m = map.get(c);
			
			if (m != null) {
				//System.out.println(map.get(c));
				map.put(c, (map.get(c)) + 1);
			//	System.out.println(map.size());
			} else
				map.put(c, 1);
		}
		Set<Character> keys = map.keySet();
		
		 Set<Entry<Character, Integer>> y = map.entrySet();
		Set<Entry<Character, Integer>> entry = map.entrySet();
		for (Entry<Character, Integer> entry2 : entry) {
			//System.out.println(entry2.getKey() +""+entry2.getValue());
			
		}
		
		int j = 0;
		for (Character character : keys) {// Iterator<Character> characterr = keys.iterator();

			System.out.println(character + "------>" + map.get(character));
			j++;
		}
	}
}
