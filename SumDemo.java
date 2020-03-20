class Summation {
    public int sum;

    Summation(int num) {
        sum = 0;
        for(int i = 1; i <= num; i++){
            sum += i;
        }
    }

    Summation(Summation ob) {
        sum = ob.sum;
    }
}

class SumDemo {
    public static void main(String args[]) {
        Summation ob1 = new Summation(100);
        Summation ob2 = new Summation(ob1);
        System.out.println(ob1.sum + " " + ob2.sum);
    }
}
