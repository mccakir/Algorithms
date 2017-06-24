package com.murat.algorithms;

import java.util.Arrays;

public class BinarySearch {

	static int binarySearch(int[] data,int searchNum){
		//Declare and initialize variables
		int low,mid,high;
		
		low=0;
		mid=0;
		high=data.length-1;
		
		while(low<=high){
			mid=low+((high-low)/2);
			
			if(data[mid]==searchNum){
				return mid;
			}
			else if (searchNum<data[mid]){
				high=mid-1;
			}
			else if (searchNum>data[mid]){
				low=mid+1;
			}
		}
		//Not found
		return -1;
	}
	
	public static void main(String[] args){

		int [] data = new int[] {45,183,22,55,7,51,22,111,82,3,5,44,76,33,550,987,154,0,52,978,14,2,36,368,9};
		int searchNum=22;
		
		//Sort array in ascending order
		Arrays.sort(data);
		
	
		//Print Array
		printArray(data);
		
		int result=binarySearch(data,searchNum);
	
		if(result!=-1){
			System.out.println("Search number: "+searchNum+" found at index "+result+" in array");
		}
		else{
			System.out.println("Seach number cannot be found");
		}
	
	}
	
	static void printArray(int [] array){
		for (int i : array) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
