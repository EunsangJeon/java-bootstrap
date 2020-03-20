class CalFact {
    private int value;
    public int getVal(int num) {
        value = 1;
        if (num < 0){
            return -1;
        }
        else if (num == 0){
            return 1;
        }
}

class Recursion {
    public static void main(String args[]) {
        CalFact ob = new CalFact(4);
        System.out.println(ob.getVal());
    }
}