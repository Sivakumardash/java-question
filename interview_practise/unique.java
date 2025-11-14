package interview_practise;
import java.util.HashMap;
import java.util.Scanner;
public class unique {

	public static void main(String[] args) 
	{
		String s="siva";
		HashMap<Character, Integer>h1=new HashMap<>();
		char c[]=s.toCharArray();
		for(char x:c)
		{
			h1.put(x,h1.getOrDefault(x,0)+1);
		}
		
		System.out.println(h1);
		
		for(char y:h1.keySet())
		{
			if(h1.get(y)>1)
			{
				System.out.println("not unique");
			}
			else
			{
				System.out.println("unique nos");
			}
		}
	}

}
