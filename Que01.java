
// Sum of all multiple of 3 or 5 below 1000 :

public class Que01 {

	public static void main(String[] args) {
		
		int sum = 0 , i;
		for(i=1; i<1000; i++) 
		{
			if(i%3==0 || i%5==0)
			{
				sum = sum + i;
			}
		}
		System.out.println("Sum of all multiple of 3 or 5 below 1000 is - "+sum);
		

	}

}
