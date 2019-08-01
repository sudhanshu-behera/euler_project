
// Difference between the Sum of squares of first one hundred and Square of the sum -

public class Que06 {

	public static void main(String[] args) {
		
		int sum1 = 0;              // sum1 is sum of squares of first one hundred
		int sum2 = 0;               //sum2 is sum of first one hundred
		for(int i=1; i<=100; i++)
		{
			sum1 = sum1 + i*i;
			sum2 = sum2 + i;
		}
		System.out.println("Sum of squares of first one hundred is = "+sum1);
		System.out.println("Square of Sum of first one hundred is = "+(sum2*sum2));
		System.out.println("Difference between the Sum of squares of first one hundred and Square of the sum is = "+((sum2*sum2)-sum1));

	}

}
