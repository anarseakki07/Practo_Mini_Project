package com.data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class abc {

	public static void printText(String filePath) throws IOException {
		List<String> lines = readTextFile(filePath);
		System.out.println("\n Print notepad file_________________");
		for (String line : lines) {
			System.out.println(line);
		}
		System.out.println("___print operation completed___");
	}

	public static void createNotepad(String filePath) throws IOException {
		File fp = new File(filePath);
		if (!fp.exists()) {

			System.out.println("Create notepad file__________________");
			if (!fp.getParentFile().exists()) {
				fp.getParentFile().mkdirs();
			}
			fp.createNewFile();

		}
	}

	public static List<String> readTextFile(String filePath) throws IOException {
		// use BufferedReader to read notepad file line by line
		FileReader fReader = null;
		BufferedReader bfrReader = null;
		// Store lines in a
		List<String> lines = new ArrayList<>();
		File fp = new File(filePath);
		if (fp.exists()) {
			System.out.println("\n Reading notepad file________________");
			fReader = new FileReader(fp);
			bfrReader = new BufferedReader(fReader);
			String line = null;
			do {
				// Read one line and store it in String variable
				line = bfrReader.readLine();

				if (line != null) {
					lines.add(line);
				}

			} while (line != null);

			bfrReader.close();
			fReader.close();

		} else {
			System.out.println("File does not exist");
		}
		return lines;
	}

	public static void appendLine(String filePath, String line) throws IOException {
		// read old notepad file and store lines
		List<String> lines = readTextFile(filePath);
		// add new line to the list
		lines.add(line);
		FileWriter fWriter;
		BufferedWriter bWriter;
		File fp = new File(filePath);
		if (fp.exists()) {
			System.out.println("Appending to the notepad file_________________");
			fWriter = new FileWriter(fp);
			bWriter = new BufferedWriter(fWriter);
			// write to notepad file
			for (String oneLine : lines) {
				bWriter.append(oneLine);
				bWriter.newLine();
			}
			bWriter.close();
			fWriter.close();

		} else {
			System.out.println("File does not exist");
		}
	}

}