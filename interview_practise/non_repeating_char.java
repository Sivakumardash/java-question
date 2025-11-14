package interview_practise;
import java.util.*;
public class non_repeating_char {

	public static void main(String[] args) {

		String s1="sssdddnnnmsda";
		char c[]=s1.toCharArray();
		LinkedHashMap<Character , Integer>s=new LinkedHashMap<>();
		for(char i:c )
		{
			s.put(i, s.getOrDefault(i,0)+1);
		}
		System.out.println(s);
		for(char ch:s.keySet())
		{
			if(s.get(ch)==1)
			{
				System.out.println(ch + " is the 1st non repeating char");
				break;
			}
		}
	}

}
