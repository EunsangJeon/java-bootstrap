class StaticDemo {
  public int x;
  public static int y;
  public static double rootOf2;
  static {
    System.out.println("Inside static block");
    rootOf2 = Math.sqrt(2.0);
  }
  public StaticDemo() {
    x = 0;
    y = 0;
  }
  public int sum(){
    return x + y;
  }
  public static int divByTwo() {
    return y / 2;
  }
  public void printRootOf2() {
    System.out.println(rootOf2);
  }
}

class SDemo {
  public static void main(String args[]){
    StaticDemo a = new StaticDemo();
    StaticDemo b = new StaticDemo();
    a.x = 10;
    b.x = 20;
    System.out.println(a.x);
    System.out.println(b.x);
    StaticDemo.y = 30;
    System.out.println(a.sum());
    System.out.println(b.sum());
    System.out.println(StaticDemo.divByTwo());
    b.printRootOf2();
  }
}