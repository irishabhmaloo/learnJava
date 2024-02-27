package threads;

class A extends Thread {
    // start() calls run()
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("A");
            
            // make thread wait
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } 
    }
}

class B extends Thread {
    // every thread obj should have run()
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("B");
        }
    }
}

public class T1 {
    public static void main(String arg[]) {

        A o1 = new A();
        B o2 = new B();

        // get priority
        System.out.println(o1.getPriority());

        // set priority : you can only suggest scheduler 
        // at the end it will decide by itself
        o2.setPriority(Thread.MAX_PRIORITY);
        o1.setPriority(2);

        // when you want to start a threads use start()
        o1.start();
        o2.start();
    }
}