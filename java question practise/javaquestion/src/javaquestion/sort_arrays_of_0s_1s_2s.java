package javaquestion;


/*Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.*/


public class sort_arrays_of_0s_1s_2s 
{

	public static void main(String[] args) 
	{
		int a[]= {1,2,2,0,0,1,2,0};
		int count0=0;int count1=0;int count2=0;int ind=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				count0++;
			}
			else if(a[i]==1)
			{
				count1++;
			}
			else
			{
				count2++;
			}
		}
		for(int i=0;i<count0;i++)
		{
			a[ind]=0;
			ind++;
		}
		for(int i=0;i<count1;i++)
		{
			a[ind]=1;
			ind++;
		}

		for(int i=0;i<count2;i++)
		{
			a[ind]=2;
			ind++;
		}
		
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}
		
	}

}
