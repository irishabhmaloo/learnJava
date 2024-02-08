package extras;

class A {
    public void print1() {
        System.out.println("A");
    }
}

class B extends A {
    public void print2() {
        System.out.println("B");
    }
}


public class Casting {
    public static void main(String[] args) {
        // upcasting
        A a = new B();
        a.print1();

        // upcasting
        A a1 = (A) new B();
        a1.print1();

        // downcasting
        B b = (B)a1;
        b.print2();
        b.print1();
    }
}