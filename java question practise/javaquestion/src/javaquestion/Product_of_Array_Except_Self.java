package javaquestion;

public class Product_of_Array_Except_Self {

	public static void main(String[] args) 
	{
		int a[]= {2,3,4,5};
		int ans[]=new int[4];
		for (int i=0;i<a.length;i++)
		{
			int p=1;
			for(int j=0;j<a.length;j++)
			{
				if(i!=j)
				{
					p=p*a[j];
				}
				
			}
			ans[i]=p;
			
		}
		for (int i=0;i<a.length;i++)
		{
			System.out.println(ans[i]);
		}
			

	}

}
