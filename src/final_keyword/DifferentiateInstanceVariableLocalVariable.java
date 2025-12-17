package final_keyword;



class Student {
	
	int id ;
	String name  ;

	Student(int id ,String name ){
		this.id = id;       // instance variable
        this.name = name;   // instance variable
			
	}
	
	void display() {
		System.out.println(id + " " + name);
	}
}

public class DifferentiateInstanceVariableLocalVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student std = new  Student(101,"priyesh");
		std.display();
		
	}

}
