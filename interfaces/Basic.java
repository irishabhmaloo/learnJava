package interfaces;

interface A {
    // all variable, by default: finala nd static
    int age=64;
    String s="hello";

    // all methods, by default: public and abstract
    void show();
    public abstract void config();
}


// interface C extends A{
    
// }

// functional interface
@FunctionalInterface
interface D {
    void show();
}

class B implements A {
    public void show() {
        System.out.println("Show");
    }

    public void config() {
        System.out.println("Config");
    }
}

public class Basic {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();
    }
}
