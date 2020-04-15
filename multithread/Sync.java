package multithread;

class SumArray {
  private int sum;

  public synchronized int sumArray(int nums[]) {
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

class MyThreadSync implements Runnable {
  public Thread thrd;
  public static SumArray sa = new SumArray();
  public int a[];
  public int answer;

  public MyThreadSync(String name, int nums[]) {
    thrd = new Thread(this, name);
    a = nums;
    thrd.start();
  }

  public void run() {
    System.out.println(thrd.getName() + " starting.");
    answer = sa.sumArray(a);
    System.out.println("Sum for " + thrd.getName() + " is " + answer);
    System.out.println(thrd.getName() + "  terminating.");
  }
}

public class Sync {
  public static void main(String args[]) {
    int a[] = { 1, 2, 3, 4, 5};

    MyThreadSync mt1 = new MyThreadSync("Child #1", a);
    MyThreadSync mt2 = new MyThreadSync("Child #2", a);

    try {
      mt1.thrd.join();
      mt2.thrd.join();  
    } catch(InterruptedException exc) {
      System.out.println("Main thread interrupted");
    }
  }
}