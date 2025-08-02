package javaquestion;
import java.util.Scanner;
public class febonacciseries {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		a[0]=0;
		a[1]=1;
		int i=2;
		for(int j=2;j<10;j++)
		{
			a[j]=a[j-2]+a[j-1];
			System.out.println(j + " element is :"+ a[j]);
		}
		
		

	}

}
