class ConsDemo00 {
    int x;
    ConsDemo00() {
        x = 10;
    }
}

class ConsDemo {
    public static void main(String args[]) {
        ConsDemo00 y = new ConsDemo00();
        System.out.println(y.x);
    }
}