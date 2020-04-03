package simpleExceptions;

class ExcTest {
    static void getException() {
        int nums[] = new int[4];
        System.out.println("Before exception is generated");
        nums[7] = 10;
        System.out.println("this won't be displayed");
    }
}