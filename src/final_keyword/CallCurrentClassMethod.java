package final_keyword;

class Demo {
	void show() {
        System.out.println("Show method");
    }
	
	
	void display() {
		this.show();
	}
}


public class CallCurrentClassMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo Demo  = new Demo();
		Demo.display();
		}

}
