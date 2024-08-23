package com.evergent.corejava.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//FileNotFoundeExcepotion 
public class CompileTimeFileDemo15 {
	public static void main(String[] args) {
		try {
			File file = new File(
					"C:\\Users\\Sandeep.Gummadavelli\\Desktop\\Evergent Files and Folder's\\MessageInfo.txt");
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("Caught Exception:" + e.getMessage());
		}
	}

}
