package interview_practise;
import java.util.HashMap;
import java.util.Scanner;
public class freq_of_no {

	public static void main(String[] args) {
		int a[]= {1,2,2,1,3,2,4,5,6,5,3,2,1,5};
		HashMap <Integer,Integer>h1=new HashMap<>();
		for(int i:a)
		{
			h1.put(i, h1.getOrDefault(i,0)+1);
		}
		System.out.println(h1);
		
		for(int i:h1.keySet())
		{
			if(h1.get(i)==3)
			{
				System.out.println(i + " occured 3 times");
			}
		}
}
}
