package searching;

public class binary_search {

	public static void main(String[] args) {
		int arr[]= {20,30,40,50,77,88,99}; // always sorted 
		int low=0;
		int high=arr.length-1;
		int target=77;
		while(low<=high)
		{
			int mid=(low+high)/2;
			
			if(arr[mid]==target)
			{
				System.out.println("target found at index "+ mid);
				break;
			}
			else if(target>arr[mid])
			{
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
	}

}
