package searching;

public class search_in_rotated_sorted_array {

	public static void main(String[] args) 
	{
		int arr[]= {7,8,9,0,1,2,3,4,5};
		int high=arr.length-1;
		int low=0;
		int target=5;
		
		while(low<=high)
		{
			int mid=(low+high)/2;
			
			if(arr[mid]==target)
			{
				System.err.println("target found at position : "+ mid);
			}
			
			if(arr[low]<=arr[mid])  //left part sorted
			{
				if (target >= arr[low] && target < arr[mid])				{
					high=mid-1;
				}
				else
				{
					low=mid+1;
				}
			}
			if(arr[mid]<=arr[high])   // right part sorted
			{
                if (target > arr[mid] && target <= arr[high]) 
				{
					low=mid+1;
				}
				else
				{
					high=mid-1;
				}
			}
		}
		
		
	}

}
