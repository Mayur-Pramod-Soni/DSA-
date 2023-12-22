package SortingAlgorithm;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		int [] arr = {8 , 4 ,6 ,9 ,11 ,1 , 3 , 2 , 2 , 1};
		System.out.println("Before Sort : " + Arrays.toString(arr));
		SelectionSortAlgo(arr);
		System.out.println("After Sort : " + Arrays.toString(arr));
	}
	public static void SelectionSortAlgo(int[] arr)
	{
		for(int i=0 ; i<arr.length-1 ; i++)
		{
			for(int k=i+1 ; k<arr.length ; k++)
			{
				if(arr[i] > arr[k])
				{
					int temp = arr[i];
					arr[i] = arr[k] ;
					arr[k] = temp ;
				}
			}
		}		
	}
}
