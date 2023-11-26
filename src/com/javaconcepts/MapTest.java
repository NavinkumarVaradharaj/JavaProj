package com.javaconcepts;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {
	
	public void hashMapTest() {
		Map<String, String> m = new LinkedHashMap<>();
		
		m.put("abc@123", "qwerty");
		m.put("abcd@123", "asdfg");
		m.put("abce@123", "qwerty");
		m.put("abc1@123", "adsfgh");
		m.put("abc@123", "trewq1234");
		m.put("abc2@123", "qwerty");
		
		System.out.println(m);
		
		Set<String> keySet = m.keySet();
		System.out.println(keySet);
		
		Collection<String> values = m.values();
		System.out.println(values);
		
		Set<Entry<String, String>> entrySet = m.entrySet();
		System.out.println(entrySet);
		
		for(Entry e : entrySet) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
		String string = m.get("abce@123");
		System.out.println(string);
	}
	
	public static void main(String[] args) {
		MapTest m = new MapTest();
		m.hashMapTest();
	}

}
