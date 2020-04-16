package multithread;

class SumArraySyncTwo {
    private int sum;
    public int sumArray(int nums[]) {
        sum = 0;
        for(int num : nums) {
            sum += num;
            System.out.println("Running total for " + Thread.currentThread().getName() + " is " + sum);
            try {
                Thread.sleep(10);
            } catch(InterruptedException exc) {
                System.out.println("Thread interrupted.");
            }
        }
        return sum;
    }
}

class MyThreadSyncTwo implements Runnable {
    Thread thrd;
    static SumArraySyncTwo sa = new SumArraySyncTwo();
    int a[];
    int answer;

    public MyThreadSyncTwo(String name, int nums[]) {
        thrd = new Thread(this, name);
        a = nums;
        thrd.start();
    }

    public void run() {
        System.out.println(thrd.getName() + " starting.");
        synchronized(sa) {
            answer = sa.sumArray(a);
        }
        System.out.println("Sum for " + thrd.getName() + " is " + answer);
        System.out.println(thrd.getName() + " terminating.");
    }
}

public class SyncTwo {
    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5};

        MyThreadSyncTwo mt1 = new MyThreadSyncTwo("Child #1", a);
        MyThreadSyncTwo mt2 = new MyThreadSyncTwo("Child #2", a);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
    }
}