package com.data;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class write {

	public static void main(String[] args) throws IOException {
		
		File f1 = new File("C:\\\\Users\\\\91959\\\\eclipse-workspace\\\\MiniProject\\\\txtfolder");
		boolean a = f1.mkdir();
		System.out.println(a);
		File f2 = new File("C:\\\\\\\\Users\\\\\\\\91959\\\\\\\\eclipse-workspace\\\\\\\\MiniProject\\\\\\\\txtfolder\\\\\\\\\\\\\\\\write.txt");
		boolean c = f2.createNewFile();
		System.out.println(c);
		File f3 = new File("C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\91959\\\\\\\\\\\\\\\\eclipse-workspace\\\\\\\\\\\\\\\\MiniProject\\\\\\\\\\\\\\\\txtfolder\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\write.txt");
		FileUtils.write(f3, "Hello", false);
		
	}

}
