/*import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import corejava.main;

public class CharacterFrequencyCount {

	
	public static void main(String[] args) {
		Map<Character, Integer> map=new  HashMap<Character, Integer>();
		
		String s="vasavi";
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			Integer value = map.get(c);
			
			if (value!=null) {

				map.put(c, map.get(c)+1);
				
			}
			else{
				map.put(c, 1);
			}
			
			
		}
		
		Set<Character> keys = map.keySet();
		for (Character f : keys) {
			System.out.println(map.get(f) + " " + f);
		}
		List<String> str = new ArrayList();
		
		for(int i=0;i<keys.size();i++){
			
			
		}
		//System.out.println();
	}
}
*/