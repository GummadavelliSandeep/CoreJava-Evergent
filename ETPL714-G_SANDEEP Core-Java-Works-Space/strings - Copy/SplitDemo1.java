package com.evergent.corejava.strings;

public class SplitDemo1 {
	public static void main(String[] args) {
		String str = "Java is a PowerFull Language";
		String[] words = str.split(" ");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		for (String word : words) {
			System.out.println(word);
		}
	}

}
