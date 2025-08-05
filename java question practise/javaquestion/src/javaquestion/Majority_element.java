package javaquestion;

public class Majority_element {
	

	public static void main(String[] args) 
	{
		
		/* majority element-- a element in an array that appears more then n/2 times where n is no.of element in an array */
		
		/*The brute-force approach is a simple, direct method to solve a problem by trying all possible solutions,*/
		/*  time complexity=o(n^2)*/
		/* another method is -- so sorting then count freq */
		int a[]= {2,3,4,5,5,5,5,5,5,5,2,3,2};
		int size=a.length;
		for (int i=0;i<size;i++)
		{
			int count=0;
			for(int j=0;j<size;j++)
			{
				if( a[i]==a[j])
				{
					count++;
				}
						
			}
			
			if (count>(size/2))
			{
				System.out.println("majority element is :"+ a[i]);
				break;
			}	
		}
	}

}
