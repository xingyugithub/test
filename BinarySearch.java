package demo;

public class BinarySearch {
public static int binarySearch(int[] arr,int x){
	int low = 0;
	int high = arr.length - 1;
	while(low <= high){
		int middle = (low + high)/2;
		if(x == arr[middle]){
			return middle;
		}else if(x < arr[middle]){
			 high = middle - 1;
		}else{
			low = middle + 1;
		}
	}
	return -1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,7,9,78,89,99};
		System.out.println("循环查找："+(binarySearch(arr,99)+1));
	}
}
