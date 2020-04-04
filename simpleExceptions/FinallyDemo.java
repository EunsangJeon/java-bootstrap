package simpleExceptions;

class UseFinally {
  public static void genException(int what) {
    int t = 0;
    int nums[] = new int[2];
    System.out.println(t + " Receiving: " + what);
    try {
      switch(what) {
        case 0:
          t = 10 / what; // to generate divide by 0 error
          break;
        case 1:
          nums[4] = 4; // to generate array index error
          break;
        case 2:
          return;
      }
    }
    catch(ArithmeticException e) {
      System.out.println("Can't divide by zero");
      return;
    }
    catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("Array out of index");
    }
    finally {
      System.out.println("Leaving try");
    }
  }
}

public class FinallyDemo {
  public static void main(String args[]) {
    for(int i = 0; i < 3; ++i) {
      UseFinally.genException(i);
      System.out.println();
    }
  }
}