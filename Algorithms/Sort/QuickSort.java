public class QuickSort {

	void quickSort(int [] data, int left, int right){
		
		int pivot = partition(data, left, right);
		
		if(left < right ){
		       	quickSort(data, left, pivot-1);
			quickSort(data, pivot, right);
		}
	}
  
  	int partition(int [] data, int left, int right){
	
		int pivot = data[left+(right-left)/2];
		int temp;
		
		while(left <= right){
			while(data[left] < pivot)
				left++;
			while(data[right] > pivot)
				right--;
			if(left <= right) {
				temp = data[left];
				data[left] = data[right];
				data[right] = temp;
				left++;
				right--;
			}
		}
		return left;
    	}
	
 	public static void main(String[] args)  {
	
      		int [] data = new int[] {610,1,4181,377,28657,13,46368,34,17711,46,1111222,514229,1,317811,8,144,233,89,1597,0,196418,75025,55,121393,5,21,6765,3,2584,10946,2,987};
		QuickSort qs = new QuickSort();
      		qs.quickSort( data, 0, data.length-1);
		
		for (int num : data) {
			System.out.print(num +" ");
		}
	}
}
