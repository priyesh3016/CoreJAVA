package Super_keyword;

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }

    void callParentSound() {
        super.sound();
    }
}

public class CallParentClassMethod {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();            // Child method
        d.callParentSound();  // Parent method
    }
}
