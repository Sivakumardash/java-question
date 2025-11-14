package Linked_list;
import java.util.*;
class node
	{
		int info;
		node next;
	}
public class LL 
{
	
	
	
	public static node create()
	{
		Scanner sc=new Scanner(System.in);
		node p=new node();
		System.out.println("enter the no you went to store");
		p.info=sc.nextInt();
		node start=p;
		node q=p;
		 sc.nextLine();
		System.out.println("went to create more node?");
		while(sc.nextLine().charAt(0)=='y')
		{
			 p=new node();
			 System.out.println("enter the element ..");
			 p.info=sc.nextInt();
			 p.next=null;
			 q.next=p;
			 q=p;
			 System.out.println("went to create more node?");
			 sc.nextLine();
			 
		}
		return start;
	}
	
	
	
	public static void display(node start)
	{
		node p=start;
		while(p!=null)
		{
			System.out.println(p.info);
			p=p.next;
		}
	}
	
	public static node delbeg(node start)
	{
		start=start.next;
		return start;
		
	}
	public static node delend(node start)
	{
		node p=start;
		while(p.next.next!=null)
		{
			p=p.next;
		}
		p.next=null;
		return start;
	}
	
	
	
	
	public static void main(String[] args) 
	{
		node start=create();
		System.out.println(start);
		
		start=delbeg(start);
		start=delend(start);

		
        display(start);
	}
	
	
	

}
