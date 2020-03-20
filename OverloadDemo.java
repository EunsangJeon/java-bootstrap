class OverloadExample {
    void ovlDemo() {
        System.out.println("NO PARAMS");
    }

    void ovlDemo(int a) {
        System.out.println("ONE PARAM: " + a);
    }

    void ovlDemo(int a, int b) {
        System.out.println("TWO PARAMS: " + a + ", " + b);
    }

    void ovlDemo(double a) {
        System.out.println("ONE DOUBLE PARAM: " + a);
    }
}

class OverLoadDemo {
    public static void main(String args[]) {
        OverloadExample ob = new OverloadExample();
        ob.ovlDemo();
        ob.ovlDemo(1);
        ob.ovlDemo(2, 3);
        ob.ovlDemo(4.5);
    }
}