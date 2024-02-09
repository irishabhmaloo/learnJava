package exceptions;

// can create own exception by using class
class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }
}

public class Except {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;

            if(c == 0) {
                throw new MyException("Cannot divide by zero");
            }

            System.out.println(c);
        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } 
        catch (MyException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Cannot divide by zero");
        } 
    }
}