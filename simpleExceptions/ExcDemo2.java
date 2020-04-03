package simpleExceptions;

class ExcDemo2 {
    public static void main(String args[]) {
        try {
            ExcTest.getException();
        } catch(ArrayIndexOutOfBoundsException exc) {
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statement.");
    }
}