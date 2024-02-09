package interfaces;

@FunctionalInterface
interface A {
    void show(int i);
}

public class Lambda {
    public static void main(String[] args) {
        
        // lambda expression
        // it will define for the method of the interface
        A obj = (int i) -> System.out.println("Hello");
        obj.show(5);
    }
}
