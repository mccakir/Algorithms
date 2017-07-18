package com.murat.algorithms;

public class QuickSort {

	static int [] data = new int[] {610,1,4181,377,28657,13,46368,34,17711,514229,1,317811,8,144,233,89,1597,0,196418,75025,55,121393,5,21,6765,3,2584,10946,2,987};
	
	public static void main(String[] args)  {
		
		quickSort( 0, data.length-1);
		
		for (int num : data) {
			System.out.print(num +" ");
		}
	}
	
	static int partition(int [] data, int left, int right){
		int lower = left;
		int higher = right;
		int pivot = data[lower+(higher-lower)/2];
		int temp;
		
		while(lower <= higher){
			while(data[lower] < pivot)
				lower++;
			while(data[higher] > pivot)
				higher--;
			if(lower <= higher) {
				temp = data[lower];
				data[lower] = data[higher];
				data[higher] = temp;
				lower++;
				higher--;
			}
		}
		return lower;
	}
	
	static void quickSort( int left, int right){
		int i = partition(data, left, right);
		if(left < i-1 ){
			quickSort(left, i-1);
		}
		if(i < right){
			quickSort(i, right);
		}
	}
	
}