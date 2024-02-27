package oops;

class Calculator {
    
    int a; // instance variable
    static int b; // static variable
    
    public Calculator() {
        a = 0;
    }

    // static block
    static {
        b = 1;
    }

    public int add(int num1, int num2) {
        
        int c; // local variable
        return num1+num2;
    }

    // static method
    public static int sub(int num1, int num2) {
        return num1-num2;
    }
}

public class oops {
    public static void main(String[] args) {
        
        // Class.forName("Calculator");
        
        int n1=2, n2=2;
        Calculator c1 = new Calculator();
        
        int res = c1.add(n1,n2);
        System.out.println(res);
    }
}
