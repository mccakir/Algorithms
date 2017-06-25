package com.murat.algorithms;

public class BubbleSort {

	public static void main(String[] args) {
		
		int [] data = new int[] {610,1,4181,377,28657,13,46368,34,17711,514229,1,317811,8,144,233,89,1597,0,196418,75025,55,121393,5,21,6765,3,2584,10946,2,987};
		
		System.out.println(data.length);
		
		boolean flag=true;
		
		while(flag){
			flag=false;
			for (int i = 1; i < data.length; i++) {
				int temp=0;
				if(data[i-1]>data[i]){
					temp=data[i-1];
					data[i-1]=data[i];
					data[i]=temp;
					flag=true;
				}
			}
		}
		
		printArray(data);

	}
	
	static void printArray(int [] array){
		for (int i : array) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
