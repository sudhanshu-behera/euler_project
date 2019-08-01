
// First six prime no. are 2,3,5,7,11,13 and find 10001st prime no. - 

public class Que07 {
	
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

		int n = 1;
		int nprime = 1;
		
		while(nprime < 10001)
		{
			n = n + 2;
			if(isprime(n))
			{
				nprime++;
			}
			
		}
		System.out.println(n);
		
	}

}
