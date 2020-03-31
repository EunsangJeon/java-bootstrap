package simpleExceptions;

class ExcTypeMismatch {
    public static void main(String args[]) {
        int nums[] = new int[4];
        try {
            System.out.println("Before");
            nums[7] = 10;
            System.out.println("skipped");
        }
        catch(ArithmeticException exc) {
            System.out.println("skipped too");
        }
        System.out.println("After");
    }
}