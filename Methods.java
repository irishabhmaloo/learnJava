// methods
class Computer {

    // method 1
    public void playMusic() {
        System.out.println("play music");
    }

    // method 2 
    public String getMePower(int cost) {
        return "Pen";
    }
}

// method overloading (compile time)
class Calculator {
    public int add(int n1, int n2) {
        return n1+n2;
    }
    public int add(int n1, int n2, int n3) {
        return n1+n2+n3;
    }
    public double add(double n1, double n2) {
        return n1+n2;
    }
}


// main class
public class Methods {
    public static void main(String[] args) {
        
        // object
        Computer c1 = new Computer();

        c1.playMusic();
        String str = c1.getMePower(1);
        System.out.println(str);

    }
}
