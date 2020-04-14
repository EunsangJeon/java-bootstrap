package multithread;

class MyThread implements Runnable {
    private String thrdName;

    public MyThread(String name) {
        thrdName = name;
    }

    public void run() {
        System.out.println(thrdName + " starting.");
        try {
            for(int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println("In " + thrdName + ", count is " + i);
            }
        } catch (InterruptedException exc) {
            System.out.println(thrdName + " interrupted.");
        }
        System.out.println(thrdName + " terminating.");
    }
}

public class UseThreads {
    public static void main(String args[]) {
        System.out.println("Main thread starting");

        MyThread mt = new MyThread("Child #1");
        Thread newThread = new Thread(mt);

        newThread.start();

        for(int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch(InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        }
        
        System.out.println("Main thread ending.");
    }
}