package threads;

class A implements Runnable {
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

class B implements Runnable {
    // every thread obj should have run()
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("B");
        }
    }
}

public class RunnableThread {
    public static void main(String[] args) throws InterruptedException {
        Runnable o1 = new A();
        Runnable o2 = new B();

        Thread t1 = new Thread(o1);
        Thread t2 = new Thread(o2);

        t1.start();
        t2.start();

        // join with main thread
        t1.join();
        t2.join();
    }
}
