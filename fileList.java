import java.io.*;
import java.util.Scanner;


class fileList {
	
	public static void List() {
		try {
			
			//create File Object with define location and change location as per requirement
			File fileObj = new File("D:\\LMS"); 
			System.out.println("\nFiles in current directory :\n");
			String[] filesList = fileObj.list(); 
			
			//Call the QuickSort method to sort the array
			sort(filesList);
			
			//print array of list
			printArray(filesList);
			
			} 
	    catch (Exception e) { 
	        System.err.println(e.getMessage());
	        }
		

		}

	// This method sort an array internally and internally calls quickSort 
	public static void sort(String[] filesList){
		int left = 0;
		int right = filesList.length-1;
		quickSort(left, right,filesList);
		
		} 
	
		
	// This method is used to sort the array using Quicksort algorithm.
	// It takes left and the right end of the array as two cursors
	private static void quickSort(int left,int right, String[] filesList){
		// If both cursor scanned the complete array quicksort exits
		if(left >= right) {
			return ;
		}
		// Pivot using median of 3 approach
		String pivot = getMedian(left, right,filesList);
		int partition = partition(left, right, pivot,filesList);
		
		// Recursively, calls the quicksort with the different left and right parameters of the sub-array
		quickSort(0, partition-1,filesList);
		quickSort(partition+1, right,filesList);
		
		}
	
	
	
	
	
	// This method is used to partition the given array and returns the integer which points to the sorted pivot index
	private static int partition(int left,int right,String pivot, String[ ] filesList){
		int leftCursor = left-1;
		int rightCursor = right;
		while(leftCursor < rightCursor){
			
			while(((Comparable<String>)filesList[++leftCursor]).compareTo(pivot) < 0);
			
				while(rightCursor > 0 && ((Comparable<String>)filesList[--rightCursor]).compareTo(pivot) > 0);
				
					if(leftCursor >= rightCursor){
						break;
					}
					
					else{
						swap(leftCursor, rightCursor,filesList);
						}
				}
		swap(leftCursor, right,filesList);
		return leftCursor;
		}
	
	
	
	public static String getMedian(int left,int right,String[ ] filesList){
		
		int center = (left+right)/2;
		if(((Comparable<String>)filesList[left]).compareTo(filesList[center]) > 0)
			swap(left,center,filesList);
		
		if(((Comparable<String>)filesList[left]).compareTo(filesList[right]) > 0)
			swap(left, right,filesList);
		
		if(((Comparable<String>)filesList[center]).compareTo(filesList[right]) > 0)
			swap(center, right,filesList);
			swap(center, right,filesList);
			
		return filesList[right];
		
		}

	
	
	// This method is used to swap the values between the two given index
	public static void swap(int left,int right,String[] filesList){
		String temp = filesList[left];
		filesList[left] = filesList[right];
		filesList[right] = temp;
		}

	
	// This method is used to print list of FileList
	public static void printArray(String[] filesList){
		for(int i =0; i<filesList.length;i++){
			System.out.println(i+1+". "+filesList[i]);
			}
		}
}