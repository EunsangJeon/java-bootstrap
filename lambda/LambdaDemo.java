package lambda;

interface MyValue {
    double getValue();
}

interface MyParamValue {
    double getValue(double v);
}

public class LambdaDemo {
    public static void main(String args[]) {
        MyValue myVal;
        myVal = () -> 99.9;
        System.out.println("A constant value: " + myVal.getValue());

        MyParamValue myPval = (n) -> 1.0 / n;
        System.out.println("Reciprocal of 4 is " + myPval.getValue(4.0));
    }
}