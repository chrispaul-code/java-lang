// Java program for Sorting an array and 
// searching for an element in the 
// sorted array 

// Importing util files 
import java.util.*; 

public class Gfg { 

	// Main function 
	public static void main(String args[]) throws Exception 
	{ 

		// Unsorted Array 
		int array[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 }; 

		// Sorting the array 
		Arrays.sort(array); 
		
        System.out.println("\nThe sorted array is: ");
        for (int num : array) {
            System.out.print(num + " ");

		// Printing sorted array 
		// } 
		// System.out.println(); 

		// // Using binarySearch to search for desired element 
		// int index = Arrays.binarySearch(array, 0); 

		// // Printing result 
		// if (index >= 0) 
		// 	System.out.println("Element 2 found at index: "
		// 					+ index); 
		// else
		// 	System.out.println("Element not found"); 
	} 
	}
}
