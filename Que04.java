// Largest palindrome made from two 3-digit numbers :

public class Que04 {
	
	public static boolean palindrome(int n)
	{
		int sum = 0;
		int p = n;
		while(n>0)
		{
			int x = n % 10;
			sum = sum*10 + x;
			n = n / 10;
		}
	
		return sum==p;
		
	}

	public static void main(String[] args) {
		
		int pro = 1, max = -1;
		
		for(int i=100; i<1000; i++)
		{
			for(int j=100; j<=999; j++)
			{
				pro = i*j;
				if(palindrome(pro) && pro > max)
				{
					max = pro;
				}
			}
		}
		
		System.out.println("largest palindrome made of two 3-digit number is - "+max);
		

	}

}
