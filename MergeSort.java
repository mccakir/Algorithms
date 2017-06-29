package com.murat.algorithms;

public class MergeSort {

	static int [] data = new int[] {610,1,4181,377,28657,13,46368,34,17711,514229,1,317811,8,144,233,89,1597,0,196418,75025,55,121393,5,21,6765,3,2584,10946,2,987};
	
	public static void main(String[] args) {
		
		//Print unsorted array
		printArray(data);
	
		//Sort array
		mergeSort(data,0,data.length-1);
		
		//Print sorted array
		printArray(data);
	}
	
	
	private static void mergeSort(int[] arr, int left, int right) {
		if (left < right){
			
			//Middle of array
			int middle=(left+right)/2;
			
			//Sort subarrays
			mergeSort(arr,left,middle);
			mergeSort(arr,middle+1,right);
			
			merge(arr,left,middle,right);
		}
	}


	private static void merge(int[] arr, int left, int middle, int right) {
		
		//Initialize subarrays
		int [] leftArr = new int [middle-left+1];
		int [] rightArr = new int [right-middle];
		
		//Fill subarrays
		for (int i = 0; i < leftArr.length; i++)
			leftArr[i] = arr[left+i];
		for (int j = 0; j < rightArr.length; j++) {
			rightArr[j] = arr[middle+1+j]; 
		}
		
		int i=0, j=0, k=left;
		//Merge subarrays
		while(i < leftArr.length && j < rightArr.length){
			if(leftArr[i] < rightArr[j]){
				arr[k] = leftArr[i];
				i++;
			}
			else{
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		
		//Add remaining values
		while (i < leftArr.length){
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		while (j < rightArr.length){
			arr[k] = rightArr[j];
			j++;
			k++;
		}
		
	}


	static void printArray(int [] arr){
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
