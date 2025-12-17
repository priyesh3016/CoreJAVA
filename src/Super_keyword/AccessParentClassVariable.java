package Super_keyword;



class Vehicle {
    String type = "Vehicle";
}



class Car extends Vehicle {
    String type = "Car";
    
    void display() {
    	
    	System.out.println(type);        // Child variable
        System.out.println(super.type);  // Parent variable
    	
    }

}



public class AccessParentClassVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Car c = new Car();
	        c.display();
	}

}
