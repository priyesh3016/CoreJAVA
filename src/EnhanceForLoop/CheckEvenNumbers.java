package EnhanceForLoop;

public class CheckEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] abc = {2,3,4,5,6,7,8,9,10};
		
		for(int ab : abc) {
			
			if(ab % 2 == 0 ) {
				System.out.println(ab +  " is Even");
			}
		}
	}

}
