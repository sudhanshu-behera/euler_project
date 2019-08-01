//Sum of even-valued term of a fibonacci sequence :

public class Que02 {

	public static void main(String[] args) {
		
		int a = 1, b = 2;
		int sum = 0;
		
		while(a<=4000000)
		{
			if(a%2==0)
			{
				sum = sum + a;
			}
			
			int c = a+b;
			a = b;
			b = c;
		}
		System.out.println("Sum of even-valued term of a fibonacci sequence upto 4 million is - "+sum);

	}

}
