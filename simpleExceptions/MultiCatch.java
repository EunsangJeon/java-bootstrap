package simpleExceptions;

public class MultiCatch {
  public static void main(String args[]) {
    int a = 88, b = 0;
    int result = 0;
    char chrs[] = { 'A', 'B', 'C' };

    for(int i =  0; i < 2; i++) {
      try {
        if(i == 0) {
          result = a / b;
        }
        else {
          chrs[4] = 'X';
        }
      }
      catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
        System.out.println("GOTCHA");
        System.out.println(e);
      }
    }
    System.out.println(result + " DONE");
  }
}