package multithread;

class MyThreadJoin implements Runnable{
    public Thread thrd;

    public MyThreadJoin(String name) {
        thrd = new Thread(this, name);
        thrd.start();
    }

    public void run() {
        System.out.println(thrd.getName() + " starting.");
        try {
            for(int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println("In " + thrd.getName() + " , count is " + i);
            }
        } catch(InterruptedException exc) {
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " terminating");
    }
}

public class JoinThreads {
    public static void main(String argsp[]) {
        MyThreadJoin mt1 = new MyThreadJoin("Child #1");
        MyThreadJoin mt2 = new MyThreadJoin("Child #2");
        MyThreadJoin mt3 = new MyThreadJoin("Child #3");

        try {
            mt1.thrd.join();
            System.out.println("Child #1 joined.");
            mt2.thrd.join();
            System.out.println("Child #2 joined.");
            mt3.thrd.join();
            System.out.println("Child #3 joined.");
        } catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread ending.");
    }
}