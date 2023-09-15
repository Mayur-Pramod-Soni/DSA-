class BubbleSort 
{
	public static void main(String args[])
	{
		int [] arr = new int [] { 1,5,7,8,9,10,44,12,45};
		int temp ;
		for(int i= 0 ; i<arr.length ; i++)
		{
			int swap = 0 ;
			for(int j=0 ; j<arr.length-1-i ; j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j] ;
					arr[j] = arr[j+1] ;
					arr[j+1] = temp ;
					swap = 1;
				}
			}
			if(swap == 0 )
			{
				break ;
			}
		}
		System.out.print("Sorted Array : ");
		for(int i=0 ;i<arr.length ; i++)
		{
			System.out.print(arr[i]+" ");	
		}
		System.out.println("Second Highest Array Element :"+arr[arr.length - 2]);
	}
}