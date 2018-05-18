package com.toyota.main;

import java.io.IOException;
import java.util.Properties;

public class Application {

	public static void main(String args[]) {

		String[] arguments = new String[2];
		Properties prop = new Properties();
		try {
			// load a properties file from class path
			prop.load(Application.class.getClassLoader().getResourceAsStream("config.properties"));

			// get the property values
			arguments[0] = prop.getProperty("FileLocation");
			arguments[1] = prop.getProperty("X");
			
			EntryPoint.main(arguments);

		} catch (IOException ex) {
			System.err.println("\n<--------------------------Error------------------------------>\n");
			System.err.println("Error in reading the properties file");
		}

	}

}
