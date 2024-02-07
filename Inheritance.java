
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

// normal inheritance
class AdvancedCalculator extends Calculator {
    public int subtract(int a, int b) {
        return a - b;
    }
}


// method overriding
class ScientificCalculator extends Calculator {
    public int add(int a, int b) {
        return a + b + 10;
    }
}


public class Inheritance {
    public static void main(String[] args) {
        AdvancedCalculator ac = new AdvancedCalculator();
        System.out.println(ac.add(5, 5));

        ScientificCalculator sc = new ScientificCalculator();
        System.out.println(sc.add(5, 5));
    }
}