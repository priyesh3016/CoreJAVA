package loops;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Quality Analyist";
		String reversed = new StringBuilder(text).reverse().toString();
		System.out.println("Reversed: " + reversed);
	}

}
