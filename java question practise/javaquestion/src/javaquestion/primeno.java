package javaquestion;

public class primeno {

	public static void main(String[] args) 
	{
		for(int i=1;i<=50;i++)
		{
			int x=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					x=x+1;
				}
			}
			if(x==2)
			{
				System.out.print(i+ "  ");
			}
			
		}
		System.out.println();
		System.out.print(" is a prime number");

	}
}
