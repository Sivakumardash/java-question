package imp_questions;

public class sec_to_hour_min 
{
	public static void main(String[]args)
	{
		int sec=1400;
		int hr=sec/3600;
		int remainder=sec%3600;
		int min=remainder/60;
		int remainder2=remainder%60;
		
		System.out.println("the total sec:"+ sec + "in hour:min:sec is : "+ hr+":"+ min +":"+ remainder2);
		

		
	}
	


}
