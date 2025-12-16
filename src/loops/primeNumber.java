package loops;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 7;
		
		 boolean isPrime = true;
		 
		for(int i=0;i< num/2;i++)
		{
			if(num % 1 == 0)
			{
				isPrime = false;
				break;
			}
		}
		
		if(isPrime)
		{
			System.out.println("Prime");
		}
		else 
		{
			System.out.println("Not Prime");
		}
		}

}
