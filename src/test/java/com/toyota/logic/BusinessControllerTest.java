package com.toyota.logic;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

import org.junit.Before;
import org.junit.Test;

import com.toyota.exception.BusinessControllerException;

public class BusinessControllerTest {

	BusinessController bController = null;
	Map<Integer,Integer> testRecords = null;

	@Before
	public void setUp() {
		bController = new BusinessController();
		testRecords = new HashMap<>();

		// test data setup
		testRecords.put(1496217904,55);
		testRecords.put(1496217906, 109);
		testRecords.put(1496217962, 2);
		testRecords.put(1496217907, 32);
		testRecords.put(1496248969, 99);
		testRecords.put(1496248970, 1);
		testRecords.put(1496217999, 109);

	}

	@Test(expected = BusinessControllerException.class)
	public void testGetUniqueIDS_NullRecords() throws BusinessControllerException {
		bController.getUniqueIDS(null, 3);
	}

	@Test
	public void testGetUniqueIDS_listOfIdsVerificationSize() throws BusinessControllerException {
		PriorityQueue<Entry<Integer, Integer>> pq = bController.getUniqueIDS(testRecords, 2);
		assertEquals(2, pq.size());
	}
	
	@Test
	public void testGetUniqueIDS_listOfIdsVerificationValues() throws BusinessControllerException {
		PriorityQueue<Entry<Integer, Integer>> pq = bController.getUniqueIDS(testRecords, 2);
		assertEquals(1496217999, pq.peek().getKey().intValue());
	}

}
