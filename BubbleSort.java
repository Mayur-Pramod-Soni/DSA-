package SortingAlgorithm;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int [] arr = {10,6,12,8,3,1};
		System.out.println("Before Sort :"+Arrays.toString(arr));
		afterBubbleSort(arr);
		System.out.println("After Sort :"+Arrays.toString(arr));
	}
	public static void afterBubbleSort(int [] arr)
	{
		int n = arr.length ; 
		for(int i=0 ; i<n ;i++)
		{
			boolean swapFlag = false ;
			for(int j=0 ; j<n-1-i ; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp ;
					swapFlag = true ;
				}
			}
			if(!swapFlag)
				break ; 
		}
	}
}
