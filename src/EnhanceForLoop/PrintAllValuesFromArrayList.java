package EnhanceForLoop;

import java.util.ArrayList;

public class PrintAllValuesFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> courses = new ArrayList<>();
		courses.add("JAVA");
		courses.add("Selenium");
		courses.add("API");
		
		for(String course : courses ) {
			 System.out.println(course);
		}
		
	}

}
