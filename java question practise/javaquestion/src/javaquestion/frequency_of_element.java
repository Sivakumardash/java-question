package javaquestion;

public class frequency_of_element {

	public static void main(String[] args)
	{
		int a[]= {30,30,20,20,20,40,40,40,30};
		int count=1,i=0;
		int n=a.length;
		while(i<n-1)
		{
			if(a[i]==a[i+1])
			{
				count++;
			
			}
			else
			{
				System.out.println(a[i]+"occured:" +count+"times");
				count=1;
			}
			i++;
		}
		

	}

}
