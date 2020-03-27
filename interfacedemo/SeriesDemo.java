package interfacedemo;

class SeriesDemo {
    public static void main(String args[]) {
        ByTwos ob = new ByTwos();

        ob.setStart(100);
        for(int i = 0; i < 5; i++) {
            System.out.println("Next value is " + ob.getNext());
        }
    }
}
