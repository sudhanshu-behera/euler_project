
//sum of prime number below 2 million - 

public class Que10 {

	public static boolean isprime(int n)
	{
		int i, flag = 0;
		
		if(n<=1)
		{
			return false;
		}
		else
		{
			for(i=2; i<=n/2; i++)
			{
				if(n%i==0)
				{
					flag = 1;
					break;
					
				}
			}
		}
		
		if(flag==0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

	public static void main(String[] args) {


		int sum = 0;
		for(int i=3; i<=2000000; i=i+2)
		{
			if(isprime(i))
			{
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}

}
