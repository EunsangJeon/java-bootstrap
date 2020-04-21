package lambda;

interface MyIntNumPredicate3 {
    boolean test(MyIntNum3 mv, int n);
}

class MyIntNum3 {
    private int v;

    MyIntNum3(int x) {
        v = x;
    }

    int getNum(){
        return v;
    }

    boolean isFactor(int n) {
        return (v % n) == 0;
    }
}

public class MethodRefDemo3 {
    public static void main(String args[]) {
        boolean result;
        MyIntNum3 myNum = new MyIntNum3(12);
        MyIntNum3 myNum2 = new MyIntNum3(16);

        MyIntNumPredicate3 inp = MyIntNum3::isFactor;

        result = inp.test(myNum, 3);
        if(result) System.out.println("3 is a factor of " + myNum.getNum());
        result = inp.test(myNum2, 3);
        if(!result) System.out.println("3 is a not a factor of " + myNum2.getNum());
    }
}