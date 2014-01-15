package com.resource.security;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CodePrivelegesExample1 {

	public static void main(String[] args) throws IOException {

		BufferedWriter writer = new BufferedWriter(new FileWriter(new File("d:/temp/sans/output.txt")));
		writer.write("Test line");
		writer.close();
	}

}
