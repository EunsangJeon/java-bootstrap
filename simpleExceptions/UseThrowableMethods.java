package simpleExceptions;

class ExcTestThrowableMethod {
  static void getException() {
    int nums[] = new int[4];
    System.out.println("Before");
    nums[7] = 5;
    System.out.println("Invisible");
  }
}

public class UseThrowableMethods {
  public static void main(String args[]) {
    try {
      ExcTestThrowableMethod.getException();
    }
    catch(ArrayIndexOutOfBoundsException e) {
      System.out.println(e);
      e.printStackTrace();
    }
    System.out.println("After");
  }
}