package com.toyota.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.toyota.exception.FileParserException;

public class FileParser {

	/*
	 * function to load data from CSV file into a list of records
	 */
	public Map<Integer, Integer> readFile(String inputFilePath)
			throws FileParserException, IOException, FileNotFoundException {

		// checks for null or empty locationPath
		if (StringUtils.isBlank(inputFilePath)) {
			throw new FileParserException("invalid Path");
		}

		BufferedReader br = null;
		String line = "";
		String rowSplitBy = " ";
		Map<Integer, Integer> records = new HashMap<Integer, Integer>();

		try {
			File file = new File(inputFilePath);

			br = new BufferedReader(new FileReader(file));
			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] record = line.split(rowSplitBy);
				records.put(Integer.parseInt(record[0]), Integer.parseInt(record[1]));
			}

		} catch (FileNotFoundException ex) {
			System.err.println("Incorrect File Location");
			throw ex;
		} catch (IOException ex) {
			System.err.println("Issues in reading the File");
			throw ex;
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException ex) {
					throw ex;
				}
			}
		}
		return records;
	}

}
