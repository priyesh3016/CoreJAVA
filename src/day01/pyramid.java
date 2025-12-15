package day01;

public class pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row = 5;
		for(int i=0;i<=row;i++)
		{
			for(int j=0;j<row;j++)
			{
				System.out.println("");
				
			}
			for (int k=1 ; k<=(2*i-1); k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
				
	}

}
