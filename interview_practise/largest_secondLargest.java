package interview_practise;

public class largest_secondLargest {

	public static void main(String[] args)
	{
		int a[]= {1,2,44,55,33,44,22,7,645};
		
		int sl=0;
		int l=a[0];
		for(int i=1 ;i<a.length;i++)
		{
			if(l<a[i])
			{
				sl=l;
				l=a[i];
			}
			else if(a[i]>sl)
			{
				sl=a[i];
			}
		}
		
		System.out.println("largest is : " +l+ " Second largest is : " + sl);

	}

}
