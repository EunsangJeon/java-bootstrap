class CalFact {
    public int getVal(int num) {
        if (num < 0){
            System.out.println("Invalid Input");
            return -1;
        }
        else if (num == 0){
            return 1;
        }
        return num * getVal(num - 1);
    }
}

class Recursion {
    public static void main(String args[]) {
        CalFact ob = new CalFact();
        System.out.println(ob.getVal(4));
    }
}