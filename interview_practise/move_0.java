package interview_practise;

public class move_0 {

	public static void main(String[] args) 
	{
		int a[]= {1,0,2,4,5,0,5,0,2,3};
		
		int i=0;
		int n=a.length;
		for(int j=0;j<n;j++)
		{
			if(a[j]!=0)
			{
				a[i++]=a[j];
			}
		}
		
		while(i<n)
		{
			a[i++]=0;
		}
		
       for(int k:a)
       {
    	   System.out.print(k);
       }
       
       
       
	}

}
