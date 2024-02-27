package extras;

class Outer {
    int a;
    static int b;
    
    void show() {
        System.out.println("Show Outer");
    }
    
    //not availabe outside outer class  
    class Inner {
        void show() {
            System.out.println("Show Inner");
        }
    }

    // only inner classes can be made static
    static class Inner2{
        void show1() {
            System.out.println("Show1 Inner");
        }
    }
}


public class Inner {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.show();

        Outer.Inner i = o.new Inner();
        i.show();

        Outer.Inner2 i2 = new Outer.Inner2();
        i2.show1();
    }
}
