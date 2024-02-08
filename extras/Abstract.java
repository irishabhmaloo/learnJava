package extras;

// abstract method should be in abstract class
// cant create object of abstract class
// can create reference of abstract class
abstract class A {
    public abstract void show();
}

class B extends A {
    
    // have to override the abstract method
    public void show() {
        System.out.println("Show B");
    }
}

public class Abstract {
    public static void main(String[] args) {
        // A a = new A(); // error
        A a = new B();
        a.show();
    }
}
