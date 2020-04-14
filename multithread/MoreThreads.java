package multithread;

class MyThreadMore implements Runnable {
    private Thread thrd;

    public MyThreadMore(String name) {
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

public class MoreThreads {
    public static void main(String args[]) {
        System.out.println("Main thread starting.");
        MyThreadMore mt1 = new MyThreadMore("Child #1");
        MyThreadMore mt2 = new MyThreadMore("Child #2");
        MyThreadMore mt3 = new MyThreadMore("Child #3");

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