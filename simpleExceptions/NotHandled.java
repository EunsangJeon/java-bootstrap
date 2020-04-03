package simpleExceptions;

class NotHandled {
    public static void main(String args[]){
        int nums[] = new int[4];
        System.out.println("Before exception is getnerated");
        nums[7] = 10;
    }
}