
// Pythagorean triplet for which a + b + c = 1000 find product abc - 

public class Que09 {

	public static void main(String[] args) {

		double p = 1;
		for(int i=1; i<=1000; i++)
		{
			for(int j=1; j<=1000; j++)
			{
				double x = Math.sqrt(i*i+j*j);
				
				if((i+j+x)==1000)
				{
					p = i*j*x;
				}
			}
		}
		System.out.println("product is "+p);
	}

}
