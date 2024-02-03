
class Calculator {
    
    int a;
    
    public int add(int num1, int num2) {
        return num1+num2;
    }
}

public class oops {
    public static void main(String[] args) {
        int n1=2, n2=2;
        Calculator c1 = new Calculator();
        
        int res = c1.add(n1,n2);
        System.out.println(res);
    }
}
