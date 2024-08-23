package com.evergent.corejava.strings;

import java.util.Arrays;

public class StringTrickyConcepts {

	public static void main(String[] args) {
		String a;
		String b;
		System.out.println('a' + 'b');
		System.out.println('a' + 3);

		String series = "";
		for (int i = 0; i < 26; i++) {
			char ch = (char) ('a' + i);
			series = series + ch;
		}
		System.out.println(series);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 26; i++) {
			char ch = (char) ('a' + i);
			sb.append(ch);
		}
		System.out.println(sb);

		String name = "JavaTechnologies";
		System.out.println(Arrays.toString(name.toCharArray()));
		System.out.println(name.indexOf('T'));
		System.out.println("  Java  ".strip());

	}

}
