package com.evergent.corejava.collectionsframeworkmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo3 {
	public static void main(String[] args) {
		HashMap <String,String>captialCities=new HashMap<>();
		captialCities.put("India", "Delhi");
		captialCities.put("USA", "Washington");
		captialCities.put("Germany", "Berlm");
		captialCities.put("India", "Delhi");
		System.out.println(captialCities);
		for(String i:captialCities.keySet()) {
			System.out.print(i+" ");
			 
		}
		System.out.println();
		for(Map.Entry<String, String>e:captialCities.entrySet()) {
			System.out.println("Key:"+e.getKey()+" "+"Value:"+e.getValue());
		}
	}

}
