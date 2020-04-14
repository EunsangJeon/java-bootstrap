package multithread;

class Priority implements Runnable {
    public int count;
    public Thread thrd;
    public static boolean stop = false;
    public static String currentName;

    public Priority(String name) {
        thrd = new Thread(this, name);
        count = 0;
        currentName = name;
    }

    public void run() {
        System.out.println(thrd.getName() + " starting.");
        do {
            count++;
            if(currentName.compareTo(thrd.getName()) != 0) {
                currentName = thrd.getName();
                System.out.println("In " + currentName);
            }
        } while(stop == false && count < 10000000);
        stop = true;
        System.out.println("\n" + thrd.getName() + " terminating.");
    }
}

public class PriorityDemo {
    public static void main(String args[]) {
        Priority m1 = new Priority("High Priority");
        Priority m2 = new Priority("Low Priority");

        m1.thrd.setPriority(Thread.NORM_PRIORITY + 2);
        m2.thrd.setPriority(Thread.NORM_PRIORITY - 2);

        m1.thrd.start();
        m2.thrd.start();

        try {
            m1.thrd.join();
            m2.thrd.join();
        } catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("\nHigh priority thread counted to " + m1.count);
        System.out.println("Low priority thread counted to " + m2.count);
    }
}