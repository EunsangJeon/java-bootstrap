package simpleExceptions;

class Rethrow {
    public static void getException() {
        int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
        int denom[] = { 2, 0, 4, 4, 0, 8 };

        for(int i = 0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] + "/" + denom[i] + "=" + numer[i]/denom[i]);
            }
            catch(ArithmeticException e) {
                System.out.println("Can't divide by zero");
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Out of array boundary");
                throw e;
            }
        }
    }
}

class RethrowDemo {
    public static void main(String args[]) {
        try {
            Rethrow.getException();
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("System got terminated");
        }
    }
}
