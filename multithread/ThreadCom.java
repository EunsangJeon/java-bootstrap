package multithread;

class TickTock {
    String state;

    synchronized void tick(boolean running) {
        if(!running) {
            state = "ticked";
            notify();
            return;
        }

        System.out.print("Tick ");
        state = "ticked";
        notify();
        try {
            while(!state.equals("tocked"))
                wait();
        } catch(InterruptedException exc) {
            System.out.println("Thread interrupted.");
        }
    }

    synchronized void tock(boolean running) {
        if(!running) {
            state = "tocked";
            notify();
            return;
        }

        System.out.println("Tock");
        state = "tocked";
        notify();
        try {
            while(!state.equals("ticked"))
                wait();
        } catch(InterruptedException exc) {
            System.out.println("Thread interrupted");
        }
    }
}

class MyThreadCom implements Runnable {
    Thread thrd;
    TickTock ttOb;

    public MyThreadCom(String name, TickTock tt) {
        thrd = new Thread(this, name);
        ttOb = tt;
        thrd.start();
    }
}

public class ThreadCom {

}