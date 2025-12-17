package final_keyword;

class Employee {
    int id;
    String dept;

    Employee() {
        this(101, "QA"); // calls parameterized constructor
    }

    Employee(int id, String dept) {
        this.id = id;
        this.dept = dept;
    }

    void display() {
        System.out.println(id + " " + dept);
    }
}

public class CallCurrentClassConstructor {
    public static void main(String[] args) {
    	Employee e = new Employee();
        e.display();
    }
}



