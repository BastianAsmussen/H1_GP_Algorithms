package tech.asmussen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AlgorithmsTest {
	
	@Test
	@DisplayName("Quick Sort Test")
	void quickSortTest() {
		
		final int[] expectedResult = {1, 2, 3, 4, 5};
		
		int[] array = {5, 3, 2, 4, 1};
		
		// Sort the array.
		Algorithms.quickSort(array);
		
		// Assert that the array is sorted.
		Assertions.assertArrayEquals(expectedResult, array);
	}
}
