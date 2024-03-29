package multithread;

class MyThreadImproved implements Runnable {
    private Thread thrd;

    public MyThreadImproved(String name) {
        thrd = new Thread(this, name);
        thrd.start();
    }

    public void run() {
        System.out.println(thrd.getName() + " starting.");
        try {
            for(int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println("In " + thrd.getName() + ", count is " + i);
            }
        } catch(InterruptedException exc) {
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " terminating.");
    }
}

public class UseThreadsImproved {
    public static void main(String args[]) {
        System.out.println("Main thread starting.");
        MyThreadImproved mti = new MyThreadImproved("Child #1");
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