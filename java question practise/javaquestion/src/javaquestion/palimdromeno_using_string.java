package javaquestion;

public class palimdromeno_using_string 
{
	public static boolean palim(int a)
	{
		String s=String.valueOf(a);
		int i=0;
		int j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				i++;
				j--;
			}
			else
			
				return false;
			
		}
		return true;
		
	}
	

	public static void main(String[] args) 
	{
		int a=1223221;
		System.out.println(palim(a));

	}

}
