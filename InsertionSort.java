package SortingAlgorithm;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10,8,5,7,6,9,12};
		System.out.println("Before : "+Arrays.toString(arr));
		insertionSort(arr);
		System.out.println("After  : "+Arrays.toString(arr));

	}
	public static void insertionSort(int []arr)
	{
		int n = arr.length ;
		for(int i=1 ;i<n ;i++)
		{
			int j , temp = arr[i];
			for(j=i-1 ;j >=0 && arr[j]>temp ;j--)
			{
				arr[j+1] = arr[j] ;
			}
			arr[j+1] = temp ;
		}
	}
}
