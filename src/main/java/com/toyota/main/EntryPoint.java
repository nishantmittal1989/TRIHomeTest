package com.toyota.main;

import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

import com.toyota.exception.BusinessControllerException;
import com.toyota.io.FileParser;
import com.toyota.logic.BusinessController;

/*
 * EntryPoint is the Starting Class for this Project to show the list of unique id's associated with the X-largest values 
 * first argument is passed as the location of the file
 * second argument is passed as the value of X
 */
public class EntryPoint {

	public static void main(String[] args) {

		FileParser parser = null;

		try {
			if (args == null || args.length < 2) {
				throw new Exception(
						"Please pass file location as first argument and value of X as second argument in the command line");
			}

			parser = new FileParser();

			Map<Integer, Integer> records = parser.readFile(args[0]);
			int X = Integer.parseInt(args[1]);

			System.out.println("\n<--------Unique ids associated with "+X+"-largest values--------->\n");
			getUniqueIDS(records, X);

		} catch (Exception e) {
			System.err.println("\n<--------------------------Error------------------------------>\n");
			System.err.println(e.getMessage());
		}

		System.out.println("\n<--------------------------Done------------------------------>\n");

	}

	public static void getUniqueIDS(Map<Integer, Integer> records, int X) throws BusinessControllerException {

		BusinessController businessController = new BusinessController();

		// list of unique id's associated with the X-largest values
		PriorityQueue<Entry<Integer, Integer>> pq = businessController.getUniqueIDS(records, X);

		while (!pq.isEmpty()) {
			Entry<Integer, Integer> entry = pq.poll();
			System.out.println(entry.getKey());
		}
	}

}
