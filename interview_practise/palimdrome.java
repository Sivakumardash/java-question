package interview_practise;

public class palimdrome {

	public static void main(String[] args) 
	{
		
		/*
		
		int i=1234321;
		int y=i;
		int x=0;
		
		while(y!=0)
		{
			x=x*10+y%10;
			y=y/10;
		}

		if(x==i)
		{
			System.out.println("yes palimdrome");
		}
		else {
			System.out.println("not a palimdrome");
		}
		*/
		
		
		int x=123454321;
		boolean ispalim=true;
		String s=String.valueOf(x);
		int i=0;
		int j=s.length()-1;
		
		while(i<j)
		{
			if(s.charAt(i++)!=s.charAt(j--))
			{
				ispalim=false;
			}
			
		}
		
		if(ispalim)
		{
			System.out.print("yes it is palim no");
		}
		else
		{
			System.out.println("no not apalim no");
		}
		
		
	}

}
