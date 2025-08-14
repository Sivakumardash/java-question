package javaquestion;

public class buy_and_shell_stock {

	public static void main(String[] args) 
	{
		
		/*You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0. 

Initialize min with the first element of the prices array. It represents the lowest price seen so far

Initialize profit as 0, it will hold the maximum profit found during iteration

Iterate over the array starting from index 1 and for each price:

If the current price is less than min update min (a better buy opportunity)

Else compute the potential profit (current - min) and update profit if this value is greater than the previous profit

At the end of the iteration profit holds the maximum profit from a single buy-sell transaction





*Initialize min with the first element of the prices array. It represents the lowest price seen so far
*Initialize profit as 0, it will hold the maximum profit found during iteration

*Iterate over the array starting from index 1 and for each price:

       *If the current price is less than min update min (a better buy opportunity)

        *Else compute the potential profit (current - min) and update profit if this value is greater than the previous profit

*At the end of the iteration profit holds the maximum profit from a single buy-sell transaction

  */

		
		int a[]= {3,4,16,1,8,5};
		int min=a[0];
		int profit=0;
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			else
			{
				int currentprofit=a[i]-min;
				if (currentprofit>profit)
				{
					profit=currentprofit;
					
				}
			}
			
		}
		System.out.println("max profit will be "+ profit);
		
		
	}

}
