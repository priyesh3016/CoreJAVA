package EnhanceForLoop;

public class CountElementsGreaterThan50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] abc = {2,23,87,90,34,78};
		int  count = 0 ;
		
		for(int ab : abc) {
			
			if(ab > 50 ) {
				
				count++;
			}
		
		}
		System.out.println("Count = " + count );
	}

}
