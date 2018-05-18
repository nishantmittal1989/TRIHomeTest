package com.toyota.logic;

import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

import com.toyota.exception.BusinessControllerException;

/*
 * Class containing the functionality to return statistic computation done on records passed in the file
 */
public class BusinessController {

	/*
	 * This function returns list of the unique ids associated with the
	 * X-largest values in the rightmost column, where X is specified by an
	 * input parameter. Time Complexity is O(n), space Complexity is O(n).
	 * records: DataSet passed to the function, n: number of unique values
	 * needed,
	 */
	public PriorityQueue<Entry<Integer, Integer>> getUniqueIDS(Map<Integer, Integer> records, int n)
			throws BusinessControllerException {
		if (records == null || records.isEmpty())
			throw new BusinessControllerException("No Records in the File");

		// lambda express as a comparator to compare based on the rightmost
		// column value in the record
		PriorityQueue<Entry<Integer, Integer>> topValuesPQ = new PriorityQueue<>(n, (Entry<Integer, Integer> record1,
				Entry<Integer, Integer> record2) -> record1.getValue() >= record2.getValue() ? 1 : -1);

		int i = 0;
		if (!records.isEmpty()) {
			for (Entry<Integer, Integer> entry : records.entrySet()) {
				if (i >= n) {
					topValuesPQ.add(entry);

					// remove the least priority record
					topValuesPQ.poll();

				} else
					topValuesPQ.add(entry);
				i++;
			}
		} else {
			throw new BusinessControllerException("No records found in the dataset");
		}

		return topValuesPQ;
	}
}
