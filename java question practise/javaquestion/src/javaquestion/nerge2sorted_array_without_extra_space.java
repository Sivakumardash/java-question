package javaquestion;

public class nerge2sorted_array_without_extra_space {

	public static void main(String[] args) 
	{
		/* see from the last of 2 array which one is big put it in 1st array in the last then subtract 1 like that continue*/  
		
		int a[]= {2,3,6,7,0,0,0,0};
		int b=3;
		int c[]= {1,4,5,8};
		int d=3;
		int k=b+d+1;
		
		while (d>=0 && b>=0)
		{
			if(a[b]>c[d])
			{
				a[k]=a[b];
				b--;k--;
			}
			else
			{
				a[k]=c[d];
				d--;k--;
			}
		}
		while(d>=0)
		{
			a[k]=c[d];
			k--;d--;
		}
		System.out.println("the sorted elements are: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
