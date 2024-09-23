package com.evergent.corejava.collectionsframeworkmap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo4 {
	public static void main(String[] args) {
		TreeMap<Integer,String>studentRecords=new TreeMap<>();
		studentRecords.put(102, "Raju");
		studentRecords.put(101, "Bhaul");
		studentRecords.put(103, "Berlm");
		studentRecords.put(104, "Ramu");
		System.out.println(studentRecords);
		for(Map.Entry<Integer, String>e:studentRecords.entrySet()) {
			System.out.println("ID:"+e.getKey()+" "+"Name:"+e.getValue());
			
		}
		
	}

}
