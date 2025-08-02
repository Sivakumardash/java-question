package javaquestion;
import java.util.Scanner;
public class armstrongnumber {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int e=sc.nextInt();
		int a=e;
		int x=a;
		int y=0;
		
		while(x!=0)
		{
		 x=x/10;
		 y++;
		}
		System.out.println(y);
		int c=0;
		
		while(a!=0)
		{
			int b=a%10;
			 c=c+(int)Math.pow(b, y);
			 a=a/10;
		}
		if(c==e)
		{
			System.out.println("yes the no is a armstrong number");
		}
		else 
		{
			System.out.println("no the no is not a armstrong number");
		}
		
		
		


	}

}
