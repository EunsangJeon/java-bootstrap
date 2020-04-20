package lambda;

interface MyFunc {
  int func(int n);
}

public class VarCapture {
  public static void main(String args[]) {
    int num = 10; // this value is effectively final

    MyFunc myFunc = (n) -> n + num;

    System.out.println(myFunc.func(9));
  }
}