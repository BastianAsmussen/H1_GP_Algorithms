package tech.asmussen;

import java.util.Random;

public class Algorithms {
	
	public static void main(String[] args) {
		
		int[] array = {5, 3, 2, 4, 1};
		
		System.out.println("Original Array:");
		printArray(array);
		
		System.out.println("Quick Sort:");
		printArray(quickSort(array));
		
		System.out.println("Binary Search:");
		System.out.println(binarySearch(array, 3));
		
		System.out.println("Linear Search:");
		System.out.println(linearSearch(array, 3));
	}
	
	private static void printArray(int[] array) {
		
		for (int element : array) {
			
			System.out.print(element + " ");
		}
		
		System.out.println();
	}
	
	/**
	 * Sorts the specified array of numbers using the quick sort algorithm.
	 *
	 * @param numbers The array of numbers to sort.
	 */
	public static int[] quickSort(int[] numbers) {
		
		// Call the recursive quickSort method.
		quickSort(numbers, 0, numbers.length - 1);
		
		// Return the sorted array.
		return numbers;
	}
	
	/**
	 * Sorts the specified array of numbers using the quick sort algorithm.
	 *
	 * @param numbers   The array of numbers to sort.
	 * @param lowIndex  The low index of the array.
	 * @param highIndex The high index of the array.
	 */
	private static void quickSort(int[] numbers, int lowIndex, int highIndex) {
		
		// If the low index is greater than or equal to the high index, return.
		if (lowIndex >= highIndex) {
			
			return;
		}
		
		// Choose a random pivot index and swap it with the last element in the array.
		int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
		int pivot = numbers[pivotIndex];
		
		// Swap the pivot with the last element in the array.
		quickSwap(numbers, pivotIndex, highIndex);
		
		// Partition the array around the pivot.
		int leftPointer = quickPartition(numbers, lowIndex, highIndex, pivot);
		
		// Recursively call quickSort on the left and right halves.
		quickSort(numbers, lowIndex, leftPointer - 1);
		quickSort(numbers, leftPointer + 1, highIndex);
	}
	
	/**
	 * Partitions the array around the pivot.
	 *
	 * @param array     The array to partition.
	 * @param lowIndex  The low index of the array.
	 * @param highIndex The high index of the array.
	 * @param pivot     The pivot to partition around.
	 * @return The index of the pivot.
	 */
	private static int quickPartition(int[] array, int lowIndex, int highIndex, int pivot) {
		
		// Implement above code, but explained with comments.
		int leftPointer = lowIndex;
		int rightPointer = highIndex - 1;
		
		// Loop through the array and swap elements until the left pointer is greater than the right pointer.
		while (leftPointer < rightPointer) {
			
			// Loop through the array and increment the left pointer until the element is greater than the pivot.
			while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
				
				leftPointer++;
			}
			
			// Loop through the array and decrement the right pointer until the element is less than the pivot.
			while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
				
				rightPointer--;
			}
			
			// Swap the elements at the left and right pointers.
			quickSwap(array, leftPointer, rightPointer);
		}
		
		// If the element at the left pointer is greater than the pivot, swap the elements.
		if (array[leftPointer] > array[highIndex]) {
			
			quickSwap(array, leftPointer, highIndex);
			
		} else {
			
			// Otherwise, set the left pointer to the high index.
			leftPointer = highIndex;
		}
		
		// Return the left pointer.
		return leftPointer;
	}
	
	/**
	 * Swaps two elements in an array.
	 *
	 * @param numbers The array of numbers.
	 * @param index1  The index of the first element.
	 * @param index2  The index of the second element.
	 */
	private static void quickSwap(int[] numbers, int index1, int index2) {
		
		int temp = numbers[index1];
		
		numbers[index1] = numbers[index2];
		numbers[index2] = temp;
	}
	
	/**
	 * Sorts the specified array of numbers using the quick sort algorithm.
	 *
	 * @param strings The array of strings to sort.
	 */
	public static String[] quickSort(String[] strings) {
		
		// Call the recursive quickSort method.
		quickSort(strings, 0, strings.length - 1);
		
		// Return the sorted array.
		return strings;
	}
	
	/**
	 * Sorts the specified array of numbers using the quick sort algorithm.
	 *
	 * @param strings   The array of strings to sort.
	 * @param lowIndex  The low index of the array.
	 * @param highIndex The high index of the array.
	 */
	private static void quickSort(String[] strings, int lowIndex, int highIndex) {
		
		// If the low index is greater than or equal to the high index, return.
		if (lowIndex >= highIndex) {
			
			return;
		}
		
		// Choose a random pivot index and swap it with the last element in the array.
		int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
		String pivot = strings[pivotIndex];
		
		// Swap the pivot with the last element in the array.
		quickSwap(strings, pivotIndex, highIndex);
		
		// Partition the array around the pivot.
		int leftPointer = quickPartition(strings, lowIndex, highIndex, pivot);
		
		// Recursively call quickSort on the left and right halves.
		quickSort(strings, lowIndex, leftPointer - 1);
		quickSort(strings, leftPointer + 1, highIndex);
	}
	
	/**
	 * Partitions the array around the pivot.
	 *
	 * @param strings   The array to partition.
	 * @param lowIndex  The low index of the array.
	 * @param highIndex The high index of the array.
	 * @param pivot     The pivot to partition around.
	 * @return The index of the pivot.
	 */
	private static int quickPartition(String[] strings, int lowIndex, int highIndex, String pivot) {
		
		// Implement above code, but explained with comments.
		int leftPointer = lowIndex;
		int rightPointer = highIndex - 1;
		
		// Loop through the array and swap elements until the left pointer is greater than the right pointer.
		while (leftPointer < rightPointer) {
			
			// Loop through the array and increment the left pointer until the element is greater than the pivot.
			while (strings[leftPointer].compareTo(pivot) <= 0 && leftPointer < rightPointer) {
				
				leftPointer++;
			}
			
			// Loop through the array and decrement the right pointer until the element is less than the pivot.
			while (strings[rightPointer].compareTo(pivot) >= 0 && leftPointer < rightPointer) {
				
				rightPointer--;
			}
			
			// Swap the elements at the left and right pointers.
			quickSwap(strings, leftPointer, rightPointer);
		}
		
		// If the element at the left pointer is greater than the pivot, swap the elements.
		if (strings[leftPointer].compareTo(pivot) > 0) {
			
			quickSwap(strings, leftPointer, highIndex);
			
		} else {
			
			// Otherwise, set the left pointer to the high index.
			leftPointer = highIndex;
		}
		
		// Return the left pointer.
		return leftPointer;
	}
	
	/**
	 * Swaps two elements in an array.
	 *
	 * @param strings The array of strings.
	 * @param index1  The index of the first element.
	 * @param index2  The index of the second element.
	 */
	private static void quickSwap(String[] strings, int index1, int index2) {
		
		String temp = strings[index1];
		
		strings[index1] = strings[index2];
		strings[index2] = temp;
	}
	
	/**
	 * Find the index of the specified key in the specified array using the binary search algorithm.
	 *
	 * @param array The array to search.
	 * @param key   The key to search for.
	 * @return The index of the key, or -1 if the key is not found.
	 */
	public static int binarySearch(int[] array, int key) {
		
		// Set the lower and upper bounds.
		int lowerBound = 0;
		int upperBound = array.length - 1;
		
		// Loop through the array and compare the key to the middle element.
		while (lowerBound <= upperBound) {
			
			int middle = (lowerBound + upperBound) / 2;
			
			if (key == array[middle]) {
				
				return middle;
			} else if (key < array[middle]) {
				
				upperBound = middle - 1;
			} else {
				
				lowerBound = middle + 1;
			}
		}
		
		// Return -1 if the key is not found.
		return -1;
	}
	
	/**
	 * Find the index of the specified key in the specified array using the linear search algorithm.
	 *
	 * @param array The array to search.
	 * @param key   The key to search for.
	 * @return The index of the key, or -1 if the key is not found.
	 */
	public static int linearSearch(int[] array, int key) {
		
		// Loop through the array and compare the key to each element.
		for (int i = 0; i < array.length; i++) {
			
			if (key == array[i]) {
				
				return i;
			}
		}
		
		// Return -1 if the key is not found.
		return -1;
	}
}
