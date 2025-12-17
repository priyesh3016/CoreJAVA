package Super_keyword;


class person{
	person(){
		System.out.println("Person Constructor");
	}
}


class Employee extends person {
	
	Employee(){
		super();
		System.out.println("Employee constructor");
	}
}

public class CallParentClassConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new Employee();
		
		
	}

}
