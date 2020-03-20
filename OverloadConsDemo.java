class OverloadConsClass {
    public int x;
    public OverloadConsClass() {
        System.out.println("0");
        x = 0;
    }
    public OverloadConsClass(int a) {
        System.out.println("1");
        x = a;
    }
    public OverloadConsClass(int a, int b) {
        System.out.println("2");
        x = a * b;
    }
    public OverloadConsClass(double a) {
        System.out.println("3");
        x = (int) a;
    }
}

class OverlodConsDemo {
    public static void main(String args[]) {
        OverloadConsClass ob1 = new OverloadConsClass();
        System.out.println(ob1.x);
        OverloadConsClass ob2 = new OverloadConsClass(1);
        System.out.println(ob2.x);
        OverloadConsClass ob3 = new OverloadConsClass(2, 3);
        System.out.println(ob3.x);
        OverloadConsClass ob4 = new OverloadConsClass(4.5);
        System.out.println(ob4.x);
    }   
}
