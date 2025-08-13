package javaquestion;

public class Product_of_Array_Except_Self_02 {

	public static void main(String[] args) 
	{
		int a[]= {2,3,4,5};
		int ans[]=new int[a.length];
		int prefix[] = new int[a.length];
		int postfix[]=new int[a.length];
		prefix[0]=1;
		postfix[a.length-1]=1;
		for (int i=1;i<a.length;i++)
		{
			prefix[i]=prefix[i-1]*a[i-1];
		}
		for(int j=a.length-2;j>=0;j--)
		{
			postfix[j]=postfix[j+1]*a[j+1];
		}
		
		for (int i=0;i<a.length;i++)
		{
			ans[i]=prefix[i]*postfix[i];
		}
		for (int i=0;i<a.length;i++)
		{
			System.out.println(ans[i]);
		}
	}

}
