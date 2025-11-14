package interview_practise;

public class selection_sort {

	public static void main(String[] args) 
	{
		int temp;
		int a[]= {12,34,55,3,2,1};
		
		for(int i=0;i<a.length;i++)
		{
			int minvalue=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[minvalue]>a[j])
				{
					minvalue=j;
				}
			}
			temp=a[i];
			a[i]=a[minvalue];
			a[minvalue]=temp;
			
		}
		
		for(int i:a)
		{
			System.out.println(i);
		}

	}

}
