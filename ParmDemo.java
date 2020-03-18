class ChckNum {
    boolean isEven (int x){
        return (x % 2) == 0;
    }
}

class ParmDemo {
    public static void main(String args[]) {
        ChckNum e = new ChckNum();
        if(e.isEven(10)){
            System.out.println("TRUE");
        }
    }
}